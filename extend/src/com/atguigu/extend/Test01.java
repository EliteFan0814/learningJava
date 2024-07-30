package com.atguigu.extend;

public class Test01 {
    public static void main(String[] args) {
        Baozipu2 baozipu = new Baozipu2();
        Product product = new Product(baozipu);
        Consumer consumer = new Consumer(baozipu);

        Thread tp = new Thread(product);
        Thread tc = new Thread(consumer);
        tp.start();
        tc.start();
    }
}
