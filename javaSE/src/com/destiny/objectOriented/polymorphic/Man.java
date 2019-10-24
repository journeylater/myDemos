package com.destiny.objectOriented.polymorphic;

/**
 * 必须实现父抽象类的所有抽象方法
 */
public class Man extends Person{
    @Override
    public void eat() {
        System.out.println("吃饭。。");
    }

}
