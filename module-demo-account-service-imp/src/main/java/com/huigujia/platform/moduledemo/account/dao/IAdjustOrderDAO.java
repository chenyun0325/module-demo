package com.huigujia.platform.moduledemo.account.dao;

import com.huigujia.platform.dao.base.func.IEntityDAO;
import com.huigujia.platform.moduledemo.account.dto.req.F831108Req;
import com.huigujia.platform.moduledemo.account.dto.res.F831108Res;
import com.huigujia.platform.moduledemo.account.pojo.AdjustOrder;

import java.util.List;


public interface IAdjustOrderDAO extends IEntityDAO<AdjustOrder, AdjustOrder> {
     List<F831108Res> queryF831108WithPage(F831108Req req);
}
