package com.atguigu.extend;

public class Baozipu2 {
    private int count;
    private boolean flag;

    public Baozipu2() {
    }

    public Baozipu2(int count, boolean flag) {
        this.count = count;
        this.flag = flag;
    }

    // 消费包子
    public synchronized int getCount() {
        if (this.flag == false) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //     有包子，吃包子
        System.out.println("消费了第" + count + "个包子");
        //     吃完包子，设置flag
        this.flag = false;
        // 唤醒线程
        this.notify();
        return count;
    }

    // 生产包子
    public synchronized void setCount() {
        if (this.isFlag() == true) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //     没有包子，开始生产
        this.count++;
        System.out.println("生产了第" + count + "个包子");
        //     生产完毕，有包子了
        this.flag = true;
        // 唤醒线程
        this.notify();

    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
