package com.atguigu.extend;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            // Thread.sleep(1000l);
            System.out.println("我是执行的子线程"+this.getName());
        }
    }
}
