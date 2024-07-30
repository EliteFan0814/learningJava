package com.atguigu.extend;

import java.sql.SQLOutput;

public class Laptop {
    public void useUsb(Usb usb){
        usb.open();
        usb.close();
    }
    public void running() {
        System.out.println("笔记本运行");

    }

    public void shutdown() {
        System.out.println("笔记本关机");

    }

}

