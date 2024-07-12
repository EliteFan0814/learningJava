package com.atguigu.extend;

public class Test01 {
    public static void main(String[] args) {
        // Human h = new Human();
        // h.age = 10;
        // h.name = "人类";
        // h.eat();
        //
        // Student s = new Student();
        // s.name = "孙善武";
        // s.age = 18;
        // s.eat();

        Human studentOne = new Student();
        studentOne.method02();

        Student studentTwo = new Student();
        studentTwo.method02();

    }
}
