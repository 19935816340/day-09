package com.company;

public interface LiveAble {
    public abstract void func();

    public default void func4(){
        System.out.println("123");

    }

    public static void run(){
        System.out.println("456");

    }

    private void func1(){
    System.out.println("func1跑起来");

   // }
    //private void func2(){
     //   System.out.println("func1跑起来");

    }
    public void show();
    public default void method(){
        System.out.println("接口method");
    }
}
