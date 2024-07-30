package com.atguigu.extend;

public class Baozipu {
    private int count;
    private boolean flag;

    public Baozipu() {
    }

    public Baozipu(int count, boolean flag) {
        this.count = count;
        this.flag = flag;
    }
    // 消费包子
    public int getCount() {
        System.out.println("消费了第"+count+"个包子");
        return count;
    }
    // 生产包子
    public void setCount() {
        this.count++;
        System.out.println("生产了第"+count+"个包子");

    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
