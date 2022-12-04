package org.ayyy.base.museum;

/**
 * @Author: 杨严
 * @Date: 2022/12/04/2:20 PM
 * @Description: 博物馆实体
 * 单例模式
 */
public enum Museum {
    // 用枚举类型实现单例模式
    INSTANCE;
    public static Museum getInstance(){
        return INSTANCE;
    }

    public void say(){
        System.out.println("museum say!");
    }




}
