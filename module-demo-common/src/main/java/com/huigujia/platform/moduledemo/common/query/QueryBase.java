package com.huigujia.platform.moduledemo.common.query;

import java.util.List;

public class QueryBase<T> {
    private Integer start = 0;

    private Integer limit = 10;

    private Integer totalCount;// 总条数

    private Integer pages;// 总页数

    private List<T> items;// 查询结果

    private String orderColumn;// 分页字段

    private String orderDir;// 分页方向

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        this.pages = (totalCount + limit - 1) / limit;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public String getOrderColumn() {
        return orderColumn;
    }

    public void setOrderColumn(String orderColumn) {

        this.orderColumn = orderColumn;
    }

    public String getOrderDir() {
        return orderDir;
    }

    public void setOrderDir(String orderDir) {

        this.orderDir = orderDir;
    }



}
