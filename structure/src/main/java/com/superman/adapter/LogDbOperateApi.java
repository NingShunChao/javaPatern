package com.superman.adapter;

import java.util.List;

/**
 * @description: 定义操作日志的应用接口
 * @author: superman宁
 **/
// target角色
public interface LogDbOperateApi {

  /**
   * 新增日志
   * @param lm
   */
  public void createLog(LogModel lm);

  /**
   * 修改日志
   * @param lm
   */
  public void updateLog(LogModel lm);

  /**
   * 删除日志
   * @param lm
   */
  public void removeLog(LogModel lm);

  /**
   * 获取所有的日志
   * @return
   */
  public List<LogModel> getAllLog();

}
