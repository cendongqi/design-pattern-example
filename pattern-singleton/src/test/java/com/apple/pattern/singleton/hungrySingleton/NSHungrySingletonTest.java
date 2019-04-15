package com.apple.pattern.singleton.hungrySingleton;

import org.junit.Test;

public class NSHungrySingletonTest {

    @Test
    public void testHungrySingleton() {
        NSHungrySingleton instance = NSHungrySingleton.getInstance();
        System.out.println(instance);
    }
}
