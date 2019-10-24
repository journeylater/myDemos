package com.destiny.objectOriented.objectExtend;

import org.junit.Test;

public class MyTest {

    /**
     * 代码块
     */
    @Test
    public void test1() {
        Student student = new Student();
    }

    /**
     * 继承
     */
    @Test
    public void test2() {
        Cat cat = new Cat();
        cat.sleep();

    }

    /**
     * 组合
     */
    @Test
    public void test3() {
        Animal animal = new Animal();
        Sheep<Animal> sheep = new Sheep<Animal>();
        sheep.setAnimal(animal);
        sheep.getAnimal().sleep();

    }

    /**
     *继承的构造方法关系
     *
     */
    @Test
    public void test4() {
        Cat cat = new Cat();
    }

    /**
     *final关键字
     *
     */
    @Test
    public void test5() {
        Son son = new Son();
        son.print();
    }


}
