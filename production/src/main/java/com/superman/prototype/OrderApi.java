package com.superman.prototype;

/**
 * @description: 订单的接口，声明了可以克隆自身的方法
 * @author: superman宁
 **/
public interface OrderApi {

  /**
   * 获取订单产品数量
   * @return
   */
  public int getOrderProductNum();

  /**
   * 设置订单产品数量
   * @param num
   */
  public void setOrderProductNum(int num);

  /**
   * 克隆方法
   * @return 订单原型的实例
   */
  public OrderApi cloneOrder();

}
