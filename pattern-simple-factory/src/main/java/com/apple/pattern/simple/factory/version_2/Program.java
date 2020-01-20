package com.apple.pattern.simple.factory.version_2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入第一个数字A：");
            String strNumberA = scanner.next();
            System.out.println("请输入运算符号(+、-、*、/)：");
            String strOperate = scanner.next();
            System.out.println("请输入第二个数字B：");
            String strNumberB = scanner.next();

            String strResult = null;

            switch (strOperate) {
                case "+":
                    strResult = String.valueOf(Integer.valueOf(strNumberA) + Integer.valueOf(strNumberB));
                    break;
                case "-":
                    strResult = String.valueOf(Integer.valueOf(strNumberA) - Integer.valueOf(strNumberB));
                    break;
                case "*":
                    strResult = String.valueOf(Integer.valueOf(strNumberA) * Integer.valueOf(strNumberB));
                    break;
                case "/":
                    if (Integer.valueOf(strNumberB) != 0) {
                        strResult = String.valueOf(Integer.valueOf(strNumberA) / Integer.valueOf(strNumberB));
                    } else {
                        strResult = "除数不能为0";
                    }
                    break;
            }
            System.out.format("结果是：%s\n", strResult);
        } catch (Exception e) {
            System.out.format("您的输入有误：%s", e.getMessage());
        }
    }
}
