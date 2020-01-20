package com.apple.pattern.simple.product;

public class ClamPizza extends Pizza {
    @Override
    public Pizza prepare() {
        System.out.println("prepare ClamPizza ...");
        return this;
    }

    @Override
    public Pizza bake() {
        System.out.println("bake ClamPizza ...");
        return this;
    }

    @Override
    public Pizza cut() {
        System.out.println("cut ClamPizza ...");
        return this;
    }

    @Override
    public Pizza box() {
        System.out.println("box ClamPizza ...");
        return this;
    }
}
