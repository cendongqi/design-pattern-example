package com.apple.pattern.singleton.lazySimpleSingleton;

public class NSExecutorThread implements Runnable {
    @Override
    public void run() {
        NSLazySimpleSingleton instance = NSLazySimpleSingleton.getInstance();
        System.out.println("Thread Name = " + Thread.currentThread().getName() +", NSLazySimpleSingleton = " + instance);
    }
}
