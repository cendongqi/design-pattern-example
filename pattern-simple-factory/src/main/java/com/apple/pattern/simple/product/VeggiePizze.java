package com.apple.pattern.simple.product;

public class VeggiePizze extends Pizza {
    @Override
    public Pizza prepare() {
        System.out.println("prepare VeggiePizze ...");
        return this;
    }

    @Override
    public Pizza bake() {
        System.out.println("bake VeggiePizze ...");
        return this;
    }

    @Override
    public Pizza cut() {
        System.out.println("cut VeggiePizze ...");
        return this;
    }

    @Override
    public Pizza box() {
        System.out.println("box VeggiePizze ...");
        return this;
    }
}
