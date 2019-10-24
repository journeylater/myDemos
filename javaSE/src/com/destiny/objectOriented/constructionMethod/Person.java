package com.destiny.objectOriented.constructionMethod;

/**
 * 构造方法
 * 1、对象的数据属性初始化
 * 2、构造方法重载
 * 3、成员变量赋值
 */
public class Person {

    private String name;
    private int age;

    public Person() {
        System.out.println("Person...");
        return;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + ":" + age);
    }

    public void setName(String name) {
        this.name = name;
    }
}
