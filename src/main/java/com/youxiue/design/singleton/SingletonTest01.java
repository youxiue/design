package com.youxiue.design.singleton;

import org.junit.Test;

/**
 * @author: xfb
 * @projectName: design->SingletonTest01
 * @description: 单例模式
 * 单例模式保证了 系统内存中该类只存在一个对象, 节省了系统资源, 对于一些需要频繁创建销毁的对象, 使用单例模式可以提高系统性能
 * 场景: 需要频繁的进行创建和 销毁的对象, 创建对象时 耗时过多或耗费资源过多, 但又经常用到的对象/工具类/频繁访问数据库或文件的对象(比如数据源/session工厂等)
 * @date: 2021/06/28 15:53
 */
public class SingletonTest01 {

    @Test
    public void test1() {
        HungrySingleton1 i1 = HungrySingleton1.getInstance();
        HungrySingleton1 i2 = HungrySingleton1.getInstance();
        System.out.println(i1 == i2);
    }

    @Test
    public void test2() {
        HungrySingleton2 i1 = HungrySingleton2.getInstance();
        HungrySingleton2 i2 = HungrySingleton2.getInstance();
        System.out.println(i1 == i2);
    }

    @Test
    public void test3() {
        LazySingleton1 l1 = LazySingleton1.getInstance();
        LazySingleton1 l2 = LazySingleton1.getInstance();
        System.out.println(l1 == l2);
    }

    @Test
    public void test4() {
        LazySingleton2 l1 = LazySingleton2.getInstance();
        LazySingleton2 l2 = LazySingleton2.getInstance();
        System.out.println(l1 == l2);
    }

    @Test
    public void test5() {
        LazySingleton3 l1 = LazySingleton3.getInstance();
        LazySingleton3 l2 = LazySingleton3.getInstance();
        System.out.println(l1 == l2);
    }

    @Test
    public void test6() {
        InnerClassSingleton l1 = InnerClassSingleton.getInstance();
        InnerClassSingleton l2 = InnerClassSingleton.getInstance();
        System.out.println(l1 == l2);
    }


    @Test
    public void test7() {
        EnumSingleton i1 = EnumSingleton.INSTANCE;
        EnumSingleton i2 = EnumSingleton.INSTANCE;
        System.out.println(i1 == i2);
    }

}

/**
 * 饿汉式一: 静态成员变量中 赋值
 * 线程安全, 但是不能懒加载, 可能会造成内存浪费
 */
class HungrySingleton1 {

    public HungrySingleton1() {
    }

    private final static HungrySingleton1 instance = new HungrySingleton1();

    public static HungrySingleton1 getInstance() {
        return instance;
    }
}


/**
 * 饿汉式二: 静态代码块中 赋值
 * 线程安全, 但是不能懒加载, 可能会造成内存浪费
 */
class HungrySingleton2 {
    public HungrySingleton2() {
    }

    private static final HungrySingleton2 instance;

    static {
        instance = new HungrySingleton2();
    }

    public static HungrySingleton2 getInstance() {
        return instance;
    }
}

/**
 * 懒汉式一:
 * 线程不安全
 */
class LazySingleton1 {
    public LazySingleton1() {
    }

    private static LazySingleton1 instance;

    public static LazySingleton1 getInstance() {
        if (instance == null) {
            instance = new LazySingleton1();
        }
        return instance;
    }

}

/**
 * 懒汉式2: 同步方法
 * 解决了线程安全,  但是效率慢, 每次获取的时候都要加锁
 */
class LazySingleton2 {
    public LazySingleton2() {
    }

    private static LazySingleton2 instance;

    public static synchronized LazySingleton2 getInstance() {
        if (instance == null) {
            instance = new LazySingleton2();
        }
        return instance;
    }
}

/**
 * 懒汉式三: 双重检查方式
 * 解决了线程安全问题, 并提升了效率.
 * 实际开发中推荐这种
 */
class LazySingleton3 {
    public LazySingleton3() {
    }

    /**
     * volatile 保证内存可见性, 防止指令重排
     */
    private static volatile LazySingleton3 instance;


    public static LazySingleton3 getInstance() {
        if (instance == null) {
            synchronized (LazySingleton3.class) {
                if (instance == null) {
                    instance = new LazySingleton3();
                }
            }
        }
        return instance;
    }
}


/**
 * 静态内部类的方式
 * 线程安全, 懒加载, 效率高
 * 静态内部类方式再 Singleton类被装载时并不会立即实例化, 而是再需要实例化时, 调用 getInstance方法, 才会装载SingletonInstance 类,从而完成Singleton的实例化
 * 推荐
 */
class InnerClassSingleton {

    public InnerClassSingleton() {
    }

    /**
     * 类的静态属性只会再第一次加载类的时候初始化, 所以在这里, JVM 帮助我们保证了线程的安全性, 在类进行初始化时, 别的线程是无法进入的.
     */
    private static class SingletonInstance {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}

/**
 * 枚举类型单例模式
 * 线程安全,  还能防止反序列化重新创建新的对象.
 * 推荐
 */
enum EnumSingleton {
    // 单例对象
    INSTANCE;
}
