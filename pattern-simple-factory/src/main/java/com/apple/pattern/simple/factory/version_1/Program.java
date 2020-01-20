package com.apple.pattern.simple.factory.version_1;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字A：");
        String a = scanner.next();
        System.out.println("请输入运算符号(+、-、*、/)：");
        String operate = scanner.next();
        System.out.println("请输入第二个数字B：");
        String b = scanner.next();

        String result = null;
        if ("+".equals(operate)) {
            result = String.valueOf(Integer.valueOf(a) + Integer.valueOf(b));
        }
        if ("-".equals(operate)) {
            result = String.valueOf(Integer.valueOf(a) - Integer.valueOf(b));
        }
        if ("*".equals(operate)) {
            result = String.valueOf(Integer.valueOf(a) * Integer.valueOf(b));
        }
        if ("/".equals(operate)) {
            result = String.valueOf(Integer.valueOf(a) / Integer.valueOf(b));
        }
        System.out.format("结果是：%s", result);
    }
}
