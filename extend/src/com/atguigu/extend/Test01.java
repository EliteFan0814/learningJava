package com.atguigu.extend;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) {

    }

    public static Usb method() {
        return new Mouse();
    }

    public static void method2(String s) throws IOException {
        if (s == null) {
            throw new IOException("IO异常");
        } else if (!s.endsWith(".txt")) {
            throw new FileNotFoundException("文件找不到");
        }
    }
}
