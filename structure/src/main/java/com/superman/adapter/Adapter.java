package com.superman.adapter;

import java.util.List;

/**
 * @description: 适配器对象，把记录日志到文件
 * @author: superman宁
 **/
public class Adapter implements LogDbOperateApi {

  /**
   * 持有需要被适配的接口对象
   */
  private LogFileOperateApi adaptee;

  public Adapter(LogFileOperateApi adaptee){
    this.adaptee = adaptee;
  }

  /**
   * 新增日志
   */
  @Override
  public void createLog(LogModel lm) {
    List<LogModel> list = getAllLog();
    list.add(lm);
    adaptee.writeLogFile(list);
  }

  /**
   * 修改日志
   */
  @Override
  public void updateLog(LogModel lm) {
    List<LogModel> list = getAllLog();
    for (int i = 0; i < list.size(); i++) {
      LogModel logModel = list.get(i);
      if(logModel.getLogId().equals(lm.getLogId())){
        logModel = lm;
      }
    }
    adaptee.writeLogFile(list);
  }

  /**
   * 删除日志
   */
  @Override
  public void removeLog(LogModel lm) {
    List<LogModel> list = getAllLog();
    list.remove(lm);
    adaptee.writeLogFile(list);
  }

  /**
   * 获取所有的日志
   */
  @Override
  public List<LogModel> getAllLog() {
    return adaptee.readLogFile();
  }
}
