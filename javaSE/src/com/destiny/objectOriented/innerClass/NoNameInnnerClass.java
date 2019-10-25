package com.destiny.objectOriented.innerClass;

public class NoNameInnnerClass {

    class Inner implements Inter{

        @Override
        public void print() {
            System.out.println("print");
        }
    }

    public void nameMethod() {
        Inner inner = new Inner();
        inner.print();
    }

    public void noNameMethod() {
        new Inter(){
            @Override
            public void print() {
                System.out.println("no name");
            }
        }.print();
    }

    public void noNameMethod2(Inter inner) {
        inner.print();
    }
}
