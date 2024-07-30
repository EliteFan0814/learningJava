package com.atguigu.extend;

public class Consumer implements Runnable {
    Baozipu2 baozipu;

    public Consumer(Baozipu2 baozipu) {
        this.baozipu = baozipu;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            baozipu.getCount();
        }
    }
}
