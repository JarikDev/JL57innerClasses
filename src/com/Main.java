package com;

public class Main {
    private  Inner inner = new Inner();
    private int i = 5;
    static int q = 5;
    static class StaticClass{
        static  void staticMethod(){
            System.out.println(q);
        }
    }
    public static void main(String[] args) throws Exception {
        StaticClass staticClass=new StaticClass();
        staticClass.staticMethod();
        Main main = new Main();
        // main.method();
        Inner inner = main.new Inner();
        inner.method2();
        main.method4();
    }

    void method() {
        Inner inner = new Inner();
        inner.method2();
        System.out.println(inner.k);
        inner.method2();
    }

    class Inner {
        private int k = 6;

        void method2() {
            System.out.println(i);
        }
    }
    void method4(){
        class NewInner{
            void newMethod(){
                System.out.println("bla new Inner");
            }
        }
        NewInner newInner=new NewInner();
        newInner.newMethod();
    }
}

class Second {
    void method() {
        Main.Inner inner = new Main().new Inner();
        inner.method2();
    }

}