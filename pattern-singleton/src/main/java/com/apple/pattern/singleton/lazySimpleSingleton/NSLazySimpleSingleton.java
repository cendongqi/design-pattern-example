package com.apple.pattern.singleton.lazySimpleSingleton;

public class NSLazySimpleSingleton {
    private static NSLazySimpleSingleton lazySimpleSingleton = null;

    private NSLazySimpleSingleton() {
    }

    // 存在线程安全问题，LazySimpleSingleton被多次初始化
    public static NSLazySimpleSingleton getInstance() {
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new NSLazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
