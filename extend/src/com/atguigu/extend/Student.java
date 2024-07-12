package com.atguigu.extend;

public class Student extends Human{
    String name;
    int age;

    public Student() {
    }

    public Student(int i) {
        super(1);
        System.out.println("子类");
        System.out.println(i);
    }

    public void eat(){
        System.out.println("我是学生，我能吃");
    }
    public static void method02(){
        System.out.println("zilei");
    }
}
