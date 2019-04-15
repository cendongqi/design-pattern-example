package com.apple.pattern.proxy.staticProxy;


import org.junit.Test;

public class NSFatherTest {


    @Test
    public void findLove() {
        NSFather father = new NSFather(new NSSon());
        father.findLove();
    }
}
