package com.atguigu.a_scanner;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        // System.out.println(cheng(10));
        // revert(new int[]{1, 2, 3, 4, 5, 6, 7});
        // paidui(new int[]{3, 1, 7, 3, 4, 5, 5, 9, 1, 0, 2, 4});
        erfen(new int[]{1,4,7,9,11,12,13,15,17,19,23}, 7);

    }

    // 计算阶乘
    public static int cheng(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * cheng(n - 1);
        }
    }

    // 翻转数组
    public static void revert(int[] iList) {
        for (int min = 0, max = iList.length - 1; min < max; min++, max--) {
            int temp = iList[min];
            iList[min] = iList[max];
            iList[max] = temp;
        }
        System.out.println(Arrays.toString(iList));
    }

    // 冒泡排序
    public static void paidui(int[] iList) {
        int loop = iList.length;
        for (int j = 0; j < loop; j++) {
            for (int i = 0; i < loop - 1 - j; i++) {
                if (iList[i] > iList[i + 1]) {
                    int temp = iList[i];
                    iList[i] = iList[i + 1];
                    iList[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(iList));
    }

    // 二分查找
    public static void erfen(int[] iList, int target) {
        int min = 0;
        int max = iList.length - 1;
        int mid = max / 2;
        while (true) {
            if (target > iList[mid]) {
                min = mid + 1;
                if (mid == iList.length - 1) {
                    System.out.println("大于，不存在");
                    break;
                }
                mid = (min + max) / 2;
            } else if (target < iList[mid]) {
                max = mid - 1;
                if (mid == 0) {
                    System.out.println("小于，不存在");
                    break;
                }
                mid = (min + max) / 2;
            } else {
                System.out.println(mid);
                break;
            }
        }
    }
}
