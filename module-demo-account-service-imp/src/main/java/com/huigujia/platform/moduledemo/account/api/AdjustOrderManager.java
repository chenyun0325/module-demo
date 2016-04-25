package com.huigujia.platform.moduledemo.account.api;

import com.huigujia.platform.moduledemo.account.dao.IAdjustOrderDAO;
import com.huigujia.platform.moduledemo.account.dto.req.F831108Req;
import com.huigujia.platform.moduledemo.account.dto.res.F831108Res;
import com.huigujia.platform.moduledemo.account.pojo.AdjustOrder;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;


@Service
public class AdjustOrderManager implements IAdjustOrderManager {


  @Resource
  private IAdjustOrderDAO adjustOrderDAO;


  public void doGenerateAdjustOrderBean(AdjustOrder adjustOrder,
                                        Boolean needAudit) {

    Date date = new Date();
    adjustOrder.setCreateDatetime(date);
    adjustOrder.setUpdateDatetime(date);

    adjustOrderDAO.save(adjustOrder);

    long orderId = adjustOrder.getOrderNo();
    String refSerialNo = new Long(orderId).toString();

  }


  public void doChangeAdjustOrder(Long orderNo,
                                  Long orderAmout,
                                  String seqFlag,
                                  String orderAbstract) {

    AdjustOrder order = adjustOrderDAO.getById(orderNo);
    order.setOrderAmount(orderAmout);
    order.setOrderAbstract(orderAbstract);
    order.setSeqFlag(seqFlag);
    order.setUpdateDatetime(new Date());

    adjustOrderDAO.update(order);
  }


  public void doDeleteAdjustOrder(Long orderNo) {

    AdjustOrder order = adjustOrderDAO.getById(orderNo);
    if (order != null) {
      adjustOrderDAO.update(order);
    }

  }


  public F831108Req queryAdjustOrderWithPage(F831108Req qry) {
    List<F831108Res> list = adjustOrderDAO.queryF831108WithPage(qry);
    qry.setItems(list);
    return qry;
  }

}
