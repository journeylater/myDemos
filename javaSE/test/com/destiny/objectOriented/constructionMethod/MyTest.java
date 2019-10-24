package com.destiny.objectOriented.constructionMethod;


import org.junit.Test;

public class MyTest {
    /**
     * 构造方法
     */
    @Test
    public void personTest1() {
        Person person = new Person();
    }

    /**
     * 方法重载
     */
    @Test
    public void personTest2() {
        Person person = new Person("tom", 21);
        person.show();
    }

    /**
     * 成员变量赋值
     */
    @Test
    public void personTest3() {
        Person person = new Person("tom", 21);
        person.show();
        person.setName("joy");
        person.show();
    }

    /**
     * 成员变量练习
     */
    @Test
    public void studentTest4() {
        Student student = new Student();
        student.setName("pipixia");
        student.setAge(18);
        student.show();
    }

    /**
     * 长方形练习
     */
    @Test
    public void pectangleTest5() {
        Rectangle rectangle = new Rectangle(10, 10);
        System.out.println(rectangle.getLenght());
        System.out.println( rectangle.getArea());
        rectangle.setHigh(20);
        rectangle.setWidth(30);
        System.out.println(rectangle.getLenght());
        System.out.println( rectangle.getArea());

    }

    /**
     * 数组操作
     */
    @Test
    public void arrayToolTest6() {
        int arr[] = {14,12,2,23,11,8,3};
        System.out.println("最大值："+ArrayTool.getMax(arr));
        System.out.print("反转前：");
        ArrayTool.print(arr);
        ArrayTool.revArray(arr);
        System.out.println("");
        System.out.print("反转后：");
        ArrayTool.print(arr);
    }

}
