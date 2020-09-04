package com.superman.proxy.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @description: 代理类
 * @author: superman宁
 **/
public class CGLibProxy implements MethodInterceptor {

  /**
   * 需要代理的目标对象
   */
  private Object targetObject;

  public Object createProxyObject(Object obj){
    this.targetObject = obj;
    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(obj.getClass());
    // 回调方法的参数为代理类对象cglibProxy，最后增强目标类调用的是代理对象cglibProxy中的intercept方法
    enhancer.setCallback(this);
    // 返回代理对象
    return enhancer.create();
  }

  public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
      throws Throwable {
    Object obj = null;
    System.out.println("---before intercept-----");
    obj = method.invoke(targetObject,objects);
    System.out.println("---after intercept-----");
    return obj;
  }
}
