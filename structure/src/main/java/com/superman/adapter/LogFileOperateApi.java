package com.superman.adapter;

import java.util.List;

/**
 * @description: 日志文件操作接口
 * @author: superman宁  适配角色
 **/
public interface LogFileOperateApi {

  /**
   * 读取日志文件
   * @return
   */
  public List<LogModel> readLogFile();

  /**
   * 写日志文件
   * @param list
   */
  public void writeLogFile(List<LogModel> list);

}
