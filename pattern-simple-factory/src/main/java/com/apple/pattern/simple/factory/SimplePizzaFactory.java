package com.apple.pattern.simple.factory;

import com.apple.pattern.simple.product.*;

/**
 * 创建披萨的工厂类
 *  优点：
 *      1.责任分割
 *      2.客户端只需要知道一种参数对应一种产品
 *  缺点：
 *      1.产品类过多
 *      2.每增加一个产品，就要改动一下工厂的逻辑
 *      3.静态工厂创建对象，无法形成继承结构
 *  适用：
 *      1.产品类较少
 *      2.只知道传入参数，不关心如何创建
 */
public class SimplePizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizze();
        }
        return pizza;
    }
}
