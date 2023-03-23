# 设计模式
##七大原则
核心思想
1. 找出应用中可能需要变化之处，把它们独立出来，不要和那些不需要变化的代码混在一起。
2. 针对接口编程，而不是针对实现编程。
3. 为了交互对象之间的松耦合设计而努力
### 单一职责原则
1. 降低类的复杂度, 一个类只负责一项职责
2. 提高类的可读性, 可维护性,
3. 降低变更引起的风险
4. 通常情况下, 我们应当遵守单一职责原则, 只有逻辑足够简单, 才可以在代码级违反单一职责原则; 只有类中的方法数量足够少, 才可以在方法级别保持单一原则.
### 接口隔离原则
1. 客户端不应该依赖他不需要的接口, 即一个类对另一个类的依赖应该建立在最小的接口上.
2. 建立单一接口
### 依赖倒置原则
细节依赖抽象, 下层依赖上层
#### 介绍
1. 高层模块不应该依赖低层模块, 二者都应该依赖其抽象,
2. 抽象不应该依赖细节, 细节应该依赖抽象. 
3. 依赖倒转的中心思想是面向接口编程.
#### 设计理念
相对于细节的多变性, 抽象的东西要稳定的多, 以抽象 为基础搭建的架构比以细节为基础的架构要稳定的多, 在java 中, 抽象指的是接口或抽象类, 细节就是具体的实现类. 
使用接口或抽象类的目的是制定好规范, 而不涉及任何具体的操作, 把展现细节的任务交给他们的实现类去完成.
#### 注意
1. 低层模块尽量都要有抽象类或接口, 或者两者都有, 程序稳定性更好. 
2. 变量的声明类型尽量是抽象类或接口, 这样我们的变量引用和实际对象间, 就存在一个缓冲层, 利于程序扩展和优化. 
3. 继承时遵循里氏替换原则.
### 里氏替换原则
多态, 子类可扩展父类
1. 里氏替换原则通俗的来讲就是：子类可以扩展父类的功能，但不能改变父类原有的功能。
2. 里氏代换原则告诉我们，在软件中将一个基类对象替换成它的子类对象，程序将不会产生任何错误和异常，反过来则不成立，如果一个软件实体使用的是一个子类对象的话，那么它不一定能够使用基类对象。
3. 里氏代换原则是实现开闭原则的重要方式之一，由于使用基类对象的地方都可以使用子类对象，因此在程序中尽量使用基类类型来对对象进行定义，而在运行时再确定其子类类型，用子类对象来替换父类对象。
### 开闭原则
1. 开闭原则是编程中最基础, 最重要的设计原则.
2. 一个软件实体如类, 模块和函数应该对扩展开放, 对修改关闭. 用抽象构建框架, 用实现扩展细节.
3. 当软件需要变化时, 尽量通过扩展软件实体的行为来实现变化, 而不是通过修改已有的代码来实现. 
4. 编程中遵循其他原则, 以及使用设计模式的目的都是为了遵循开闭原则. 
### 迪米特原则
#### 介绍
1. 一个对象应该对其他对象保持最少的了解
2. 类与类关系越密切，耦合度越大
3. 迪米特法则(Demeter Principle)又叫最少知道原则，即一个类对自己依赖的类知道的越少越好。也就是说，对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内部。对外除了提供的public方法，不对外泄露任何信息
4. 迪米特法则还有个更简单的定义: 只与直接的朋友通信.
5. 直接的朋友: 每个对象都会与其他对象有耦合关系，只要两个对象之间有耦合关系，我们就说这两个对象之间是朋友关系。耦合的方式很多，依赖，关联，组合，聚合等。其中，我们称出现成员变量，方法参数，方法返回值中的类为直接的朋友，而出现在局部变量中的类不是直接的朋友。也就是说，陌生的类最好不要以局部变量的形式出现在类的内部。
#### 注意事项和细节
1. 迪米特法则注意事项和细节
2. 迪米特法则的核心是降低类之间的耦合
3. 但是注意:由于每个类都减少了不必要的依赖，因此迪米特法则只是要求降低类间(对象间)耦合关系，并不是要求完全没有依赖关系
### 合成复用原则
尽量使用合成/聚合的方式, 而不是继承.


## 设计模式
### 目录
1. 创建型模式
    * builder: 构建器模式
    * factory: 工厂模式
        * abstract factory: 抽象工厂模式
        * factory method: 工厂方法模式
        * simple: 简单工厂模式
    * prototype: 原型模式
    * singleton: 单例模式
2. 结构型模式
    * adapter: 适配器模式
    * bridge: 桥接模式
    * composite: 组合模式
    * decorator: 装饰模式
    * facade: 外观模式
    * flyweight: 享元模式
    * proxy: 代理模式
3. 行为性模式
    * responsibilityChain: 职责链模式
    * command: 命令模式
    * interpreter: 解释器模式
    * iterator: 迭代器模式
    * Mediator: 中介者模式
    * memento: 备忘录模式
    * observer: 观察者模式
    * state: 状态模式
    * strategy: 策略模式
    * template Method: 模板方法模式
    * visitor: 访问者模式
