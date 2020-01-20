package com.apple.pattern.method;

import com.apple.pattern.method.factory.ChicagoPizzaStore;
import com.apple.pattern.method.factory.NYPizzaStore;
import com.apple.pattern.method.product.Pizza;

/**
 * 工厂和调用者合二为一
 * 简单工厂：
 *      1.需要知道参数对应的产品类型
 * 工厂方法：
 *      2.找到对应的工厂类即可
 *
 * 优点：
 *      1.只需要知道具体工厂
 *      2.增加新产品，只需要增加具体产品和对应的工厂类，无需对原工厂进行修改
 * 缺点：
 *      1.相对于简单工厂模式，增加一个产品需要增加两个类，增加复杂度，增加了依赖
 * 适用：
 *      1.不想知道具体类，只需要知道具体工厂
 *      2.创建对象交给子类实现，更容易扩展
 *      3.动态指定某个工厂类
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare().bake().cut().box();
        return pizza;
    }

    /**
     * 由子类决定如何创建披萨
     *
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);

    public static void main(String[] args) {
        System.out.println("---------Joel 需要的芝加哥的深盘披萨---------");
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();       //建立芝加哥的披萨店
        Pizza joelPizza = chicagoPizzaStore.orderPizza("cheese");             //下订单
        System.out.println("Joel ordered a " + joelPizza.getName() + "\n");

        System.out.println("---------Ethan 需要的纽约风味的披萨---------");
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza ethanPizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + ethanPizza.getName() + "\n");
    }
}
