package com.apple.pattern.singleton.lazySimpleSingleton;

/**
 * 懒汉式（内部类）
 * 内部类实现单例模式
 *  利用JVM加载内部类和外部类的逻辑，不需要synchronize关键字，性能最优，完美避免了多线程安全问题
 *  JVM在加载类时先加载这个类的依赖类，内部类首先被加载，在内部类里进行初始化操作
 *  存在的问题1：内部类依然可以被反射破解
 *  解决：在构造器里判断，抛出异常
 */
public class NSLazyInnerClassSingleton {

    private NSLazyInnerClassSingleton() {
        if (LazyHolder.lazy != null) {
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    public static final NSLazyInnerClassSingleton getInstance() {
        return LazyHolder.lazy;
    }

    private static class LazyHolder {
        private static final NSLazyInnerClassSingleton lazy = new NSLazyInnerClassSingleton();
    }
}
