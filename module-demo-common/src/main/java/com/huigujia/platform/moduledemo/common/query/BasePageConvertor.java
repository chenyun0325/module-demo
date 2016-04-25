package com.huigujia.platform.moduledemo.common.query;


import com.huigujia.platform.dao.base.para.IPageConverter;
import com.huigujia.platform.dao.base.para.IPageParameter;
import com.huigujia.platform.dao.common.para.PageParameter;

@SuppressWarnings("rawtypes")
public class BasePageConvertor implements IPageConverter<QueryBase> {

    public IPageParameter toPage(QueryBase qryDto) {
        PageParameter page = new PageParameter();
        page.setRequireTotal(true);
        page.setStart(qryDto.getStart());
        page.setLimit(qryDto.getLimit());
        return page;
    }

    public void returnTotal(QueryBase qryDto, int total) {
        qryDto.setTotalCount(total);
    }

}
