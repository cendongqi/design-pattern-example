package com.apple.pattern.simple.product;

/**
 * 制作披萨的步骤
 */
public abstract class Pizza {
    public abstract Pizza prepare();
    public abstract Pizza bake();
    public abstract Pizza cut();
    public abstract Pizza box();
}
