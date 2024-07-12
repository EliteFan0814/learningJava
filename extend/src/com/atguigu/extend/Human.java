package com.atguigu.extend;

public class Human {
    String name = "人类";
    int age = 50000;

    public Human() {
    }

    public Human(int i){
        System.out.println("父类无参构造");
        System.out.println(i);
    }
    public void eat(){
        System.out.println("我是人类，我能吃");
    }
    public static void method02(){
        System.out.println("fulei");
    }
}
