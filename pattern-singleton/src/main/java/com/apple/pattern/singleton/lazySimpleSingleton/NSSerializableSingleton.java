package com.apple.pattern.singleton.lazySimpleSingleton;

import java.io.Serializable;

public class NSSerializableSingleton implements Serializable {
    private static final NSSerializableSingleton singleton = new NSSerializableSingleton();

    private NSSerializableSingleton() {}

    public static NSSerializableSingleton getInstance() {
        return singleton;
    }

    public Object readResolve() {
        return singleton;
    }
}
