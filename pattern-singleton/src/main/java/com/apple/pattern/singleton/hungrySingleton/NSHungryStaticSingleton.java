package com.apple.pattern.singleton.hungrySingleton;

/**
 * 饿汉式单例
 *  不管有没有调用者，先初始化再说
 */
public class NSHungryStaticSingleton {
    // final修饰以防被其他类使用反射篡改
    private static final NSHungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new NSHungryStaticSingleton();
    }

    // 私有化构造器
    private NSHungryStaticSingleton() {
    }

    // 提供一个全局访问点
    public static NSHungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}
