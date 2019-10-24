package com.destiny.objectOriented.polymorphic;

/**
 *  继承提高了代码复用性
 *  继承破坏了对象的封装性，使类之间的耦合提高
 *  只支持单继承
 *  支持多层继承
 */
public class Animal extends Object{

    String color;
    int leg = 10;

    public Animal(){
        System.out.println("Animal构造方法");
    }

    public Animal(String color,int leg){
        this.color = color;
        this.leg = leg;
    }

    public void eat() {
        System.out.println("吃饭。。");
    }

    public static void sleep() {
        System.out.println("睡觉。。");
    }

}

