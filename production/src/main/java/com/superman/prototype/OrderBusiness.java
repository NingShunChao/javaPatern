package com.superman.prototype;

/**
 * @description: 处理订单的业务对象
 * @author: superman宁
 **/
public class OrderBusiness {

  /**
   * 创建订单的方法
   * @param orderApi 订单的接口对象
   */
  public void saveOrder(OrderApi orderApi){

    //1:判断当前的预订产品数量是否大于1000
    while (orderApi.getOrderProductNum() > 1000){
      //2:如果大于，还需要继续拆分
      //2.1:再新键一份订单，跟传入的订单除了数量不一样外，其他都相同
      OrderApi newOrder = orderApi.cloneOrder();
      // 然后进行复制，产品数量为1000
      newOrder.setOrderProductNum(1000);
      // 2.2 原来的订单保留，把数量设置减少1000
      orderApi.setOrderProductNum(orderApi.getOrderProductNum()-1000);
      // 然后是业务功能处理，省略。。。。
      System.out.println("拆分生成订单===="+newOrder);
    }
    // 3不超过，那就直接业务功能处理
    System.out.println("订单==="+orderApi);

  }

}
