package com.destiny.objectOriented.innerClass;

/**
 * 成员内部类
 */
public class MemberInnerClass {

    private int num = 10;
    private class Inner{
        public void method() {
            System.out.println("成员内部类");
        }
    }
    public void print() {
        Inner inner = new Inner();
        inner.method();
    }

}
