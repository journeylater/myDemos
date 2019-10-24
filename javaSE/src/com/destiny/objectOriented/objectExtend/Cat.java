package com.destiny.objectOriented.objectExtend;

public class Cat extends Animal{
    public Cat() {
        System.out.println("Cat构造方法");
    }
    //重写
    public void eat() {
        System.out.println("猫猫吃饭。。");
    }
}
