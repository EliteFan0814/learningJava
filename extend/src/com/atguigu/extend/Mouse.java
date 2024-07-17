package com.atguigu.extend;

public class Mouse implements Usb {
    @Override
    public void open() {
        System.out.println("鼠标开启");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }

    public final void mouseMark(){
        System.out.println("我是windows鼠标");
    }
}
