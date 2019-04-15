package com.apple.pattern.singleton.lazySimpleSingleton;

public class NSLazySimpleSingletonTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new NSExecutorThread());
        Thread t2 = new Thread(new NSExecutorThread());

        t1.start();
        t2.start();

        System.out.println("Execute End");
    }
}
