package com.apple.pattern.proxy.JDKProxy;

import com.apple.pattern.proxy.NSPerson;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKMeipo implements InvocationHandler {

    // 目标对象
    private NSPerson person;

    public Object getInstance(NSPerson person) {
        this.person = person;
        Class<?> clazz = person.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(person, args);
        after();
        return null;
    }

    private void after() {
        System.out.println("调用后：404");
    }

    private void before() {
        System.out.println("调用前：接收目标对象要求");
    }
}
