package com.superman.factory.simplefactory;

/**
 * @description: Factory角色
 * @author: superman宁
 * 简单工厂类：独立的组件或独立的模块级别
 **/
public class Factory {

  public static Api createApi(){
    return new ApiImpl();
  }

  public static Api createApi(int type){
    Api api = null;
    if(type == 1){
      api = new ApiImpl();
    }
    return api;
    /**
     * 缺点，暴露参数的含义
     * type参数来源
     * 1：可以是配置文件
     * 2：系统自身
     */
  }

}
