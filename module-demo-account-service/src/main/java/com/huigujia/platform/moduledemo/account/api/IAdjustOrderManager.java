package com.huigujia.platform.moduledemo.account.api;


import com.huigujia.platform.moduledemo.account.dto.req.F831108Req;
import com.huigujia.platform.moduledemo.account.pojo.AdjustOrder;

/**
 * 内部冲帐订单-内部接口
 *
 * 1.新增(业务字段) 2.修改(业务字段) 3.审核 4.软删除 5.判断是否审核 6.针对原来记录冲账------------后续版本实现
 *
 * @author: chenyun
 * @since: 2014年12月8日 下午2:15:06
 * @history:
 */
public interface IAdjustOrderManager {


  /**
   * 生成记录 传递req对象方式
   *
   * @param needAudit --是否需要审核
   * @create: 2014年12月16日 上午12:16:12 chenyun
   * @history:
   */
   void doGenerateAdjustOrderBean(AdjustOrder adjustOrder,
                                        Boolean needAudit);

  /**
   * 修改
   *
   * @create: 2014年12月15日 下午9:42:06 chenyun
   * @history:
   */
   void doChangeAdjustOrder(Long orderNo,
                                  Long orderAmout,
                                  String seqFlag,
                                  String orderAbstract);


  /**
   * 软删除
   *
   * @create: 2014年12月8日 下午4:04:37 chenyun
   * @history:
   */
   void doDeleteAdjustOrder(Long orderNo);

  /**
   * @create: 2014年12月15日 下午3:22:10 chenyun
   * @history:
   */
   F831108Req queryAdjustOrderWithPage(F831108Req qry);

}
