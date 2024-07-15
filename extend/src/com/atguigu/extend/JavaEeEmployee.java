package com.atguigu.extend;

public class JavaEeEmployee extends Employee {
    public JavaEeEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public void mainJob() {
        System.out.println("我是javaEE工程师"+this.getName());
    }
}
