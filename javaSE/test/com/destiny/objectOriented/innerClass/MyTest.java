package com.destiny.objectOriented.innerClass;

import org.junit.Test;

public class MyTest {

    /**
     * 内部类
     */
    @Test
    public void test1() {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method();
    }

    /**
     * 成员内部类
     */
    @Test
    public void test2() {
        MemberInnerClass memberInnerClass = new MemberInnerClass();
        memberInnerClass.print();
    }

    /**
     * 静态内部类
     */
    @Test
    public void test3() {
//        StaticInnerClass staticInnerClass = new StaticInnerClass();
//        StaticInnerClass.Inner inner = new StaticInnerClass.Inner();
//        inner.method();

        StaticInnerClass.Inner.method();
    }

    /**
     * 局部内部类
     */
    @Test
    public void test4() {
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.method();
    }

    /**
     * 匿名内部类
     */
    @Test
    public void test5() { 
        //有名字的内部类
        NoNameInnnerClass noNameInnnerClass = new NoNameInnnerClass();
       // noNameInnnerClass.nameMethod();
        noNameInnnerClass.noNameMethod();
        //lambda
        noNameInnnerClass.noNameMethod2(()-> System.out.println("as"));

    }
}
