package com.apple.pattern.proxy.staticProxy;

public class NSFather implements NSMySon {

    private NSMySon mySon;

    public NSFather(NSMySon mySon) {
        this.mySon = mySon;
    }

    /**
     * 找对象方法
     */
    @Override
    public void findLove() {
        System.out.println("帮自己儿子找对象");
        mySon.findLove();
        System.out.println("根据儿子的要求找对象");
    }
}
