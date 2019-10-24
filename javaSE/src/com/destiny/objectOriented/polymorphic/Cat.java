package com.destiny.objectOriented.polymorphic;

public class Cat extends Animal implements Active{

    int leg = 20;

    public Cat() {
        System.out.println("Cat构造方法");
    }
    //重写
    public  void eat() {
        System.out.println("猫猫吃饭。。");
    }

    public static void sleep() {
        System.out.println("猫猫睡觉。。");
    }

    public void say(){
        System.out.println("喵喵。。");
    }

    @Override
    public void jump() {
        System.out.println("猫猫跳一跳");
    }

    @Override
    public void run() {
        System.out.println("猫猫跑一跑");
    }
}
