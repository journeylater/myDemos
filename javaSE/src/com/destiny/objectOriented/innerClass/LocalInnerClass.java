package com.destiny.objectOriented.innerClass;

/**
 * 局部内部类
 */
public class LocalInnerClass {

    public void method() {

        class Inner{
            public void print() {
                System.out.println("局部内部类");
            }
        }

        Inner inner = new Inner();
        inner.print();
    }



}
