package com.superman.prototype;

/**
 * @description: 企业订单对象
 * @author: superman宁
 **/
public class EnterpriseOrder implements OrderApi {

  /**
   * 订购人员姓名
   */
  private String enterpriseName;

  /**
   * 产品编号
   */
  private String productId;

  /**
   * 订单产品数量
   */
  private int orderProductNum = 0;


  /**
   * 获取订单产品数量
   */
  public int getOrderProductNum() {
    return orderProductNum;
  }

  /**
   * 设置订单产品数量
   */
  public void setOrderProductNum(int num) {
    this.orderProductNum= num;
  }

  public String getEnterpriseName() {
    return enterpriseName;
  }

  public void setEnterpriseName(String enterpriseName) {
    this.enterpriseName = enterpriseName;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * 克隆方法
   *
   * @return 订单原型的实例
   */
  public OrderApi cloneOrder() {
    // 创建一个新的订单，然后把本实例的数据复制过去
    EnterpriseOrder order = new EnterpriseOrder();
    order.setEnterpriseName(this.enterpriseName);
    order.setProductId(this.productId);
    order.setOrderProductNum(this.orderProductNum);
    return order;
  }
}
