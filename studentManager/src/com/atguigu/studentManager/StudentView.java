package com.atguigu.studentManager;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentView {
    Scanner sc = new Scanner(System.in);
    // 存放学生的数组
    Student[] students = new Student[50];
    // 学生数量
    int count = 0;
    Student[] newStudents = new Student[students.length];

    // 展示应用
    public void start() {
        while (true) {
            System.out.println("----------学生管理系统----------");
            System.out.println("1 添加学生");
            System.out.println("2 修改学生");
            System.out.println("3 删除学生");
            System.out.println("4 查看学生");
            System.out.println("5 退   出");
            System.out.println("请选择（1-5）：");
            int num = sc.nextInt();
            System.out.println("----------");
            switch (num) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    findAllStudent();
                    break;
                case 5:
                    System.out.println("退出");
                    break;
            }
        }
    }

    private void findAllStudent() {
    }

    private void deleteStudent() {
    }

    private void editStudent() {
    }

    private void addStudent() {
    }
}
