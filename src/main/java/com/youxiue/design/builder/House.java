package com.youxiue.design.builder;

import lombok.Data;

/**
 * TODO
 *
 * @author xfb
 * @date 2021/11/25 17:05
 */
@Data
public class House {

    /**
     * 地基
     */
    private String basic;

    /**
     * 墙
     */
    private String walls;


    /**
     * 房顶
     */
    private String roofed;
}
