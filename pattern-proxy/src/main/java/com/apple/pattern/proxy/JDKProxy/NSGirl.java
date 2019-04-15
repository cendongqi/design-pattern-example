package com.apple.pattern.proxy.JDKProxy;

import com.apple.pattern.proxy.NSPerson;

public class NSGirl implements NSPerson {


    @Override
    public void findLove() {
        System.out.println("三点要求");
        System.out.println("1.高");
        System.out.println("2.富");
        System.out.println("3.帅");
    }
}
