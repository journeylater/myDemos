package com.destiny.objectOriented.objectExtend;

/**
 * 代码块
 */
public class Student {

    private String name;
    private String age;


    public Student() {
        System.out.println("空参构造");
    }

    public Student(String name, String age) {
        System.out.println("有参构造");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    static {
        System.out.println("静态代码块");
    }
    {
        System.out.println("构造代码块");
    }
}
