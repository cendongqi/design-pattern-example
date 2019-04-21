package com.apple.pattern.singleton.lazySimpleSingleton;

/**
 * 懒汉式（双重检查锁）
 */
public class NSLazyDoubleCheckSingleton {
    private static NSLazyDoubleCheckSingleton lazy = null;

    private NSLazyDoubleCheckSingleton() {}

    public static NSLazyDoubleCheckSingleton getInstance() {
        if (lazy == null) {
            synchronized (NSLazyDoubleCheckSingleton.class) {
                if (lazy == null) {
                    lazy = new NSLazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }
}
