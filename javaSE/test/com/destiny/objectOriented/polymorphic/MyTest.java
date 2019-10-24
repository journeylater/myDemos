package com.destiny.objectOriented.polymorphic;

import org.junit.Test;

public class MyTest {

    /**1、当运行时调用引用变量的方法时，其方法行为总是表现出子类方法的行为特征，而不是父类方法的行为特征，
     *      这就表现出：相同类型的变量调用同一个方法时表现出不同的行为特征，这就是多态
     * 2、对象的实例变量不具备多态性
     */
    @Test
    public void test1() {

        Animal animal = new Cat();
        animal.eat();//成员方法
        animal.sleep(); //静态方法
        System.out.println(animal.leg);//成员变量

    }

    /**
     * 向上转型和向下转型
     */
    @Test
    public void test2() {
        //向上转型
        Animal animal = new Cat(); //父类引用指向子类对象
        animal.eat();
       // animal.say(); 不能使用子类的特有方法
        //向下转型
        Cat cat = (Cat) animal;
        cat.eat();
        cat.say();
    }

    /**
     * 抽象类
     */
    @Test
    public void test3() {

        Person person = new Man();
        person.eat();
        person.sleep();

    }

    /**
     * 接口
     */
    @Test
    public void test4() {

        Cat cat = new Cat();
        cat.jump();
        cat.run();

    }

}
