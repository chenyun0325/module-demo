package com.huigujia.platform.moduledemo.account.dto.req;


import com.huigujia.platform.moduledemo.account.dto.res.F831108Res;
import com.huigujia.platform.moduledemo.common.query.QueryBase;

/**
 * 分页查询req
 * @author: chenyun 
 * @since: 2014年12月8日 上午11:38:09 
 * @history:
 */
public class F831108Req extends QueryBase<F831108Res> {

    private Long userId;

    private Long pzAccountId;

    private String remark;

    private String verifyStatus;

    private String seqFlag;

    private String verifyDatetimeBegin;

    private String verifyDatetimeEnd;

    private String createDatetimeBegin;

    private String createDatetimeEnd;

    private String accountBizType;

    public String getAccountBizType() {
        return accountBizType;
    }

    public void setAccountBizType(String accountBizType) {
        this.accountBizType = accountBizType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPzAccountId() {
        return pzAccountId;
    }

    public void setPzAccountId(Long pzAccountId) {
        this.pzAccountId = pzAccountId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public String getSeqFlag() {
        return seqFlag;
    }

    public void setSeqFlag(String seqFlag) {
        this.seqFlag = seqFlag;
    }

    public String getVerifyDatetimeBegin() {
        return verifyDatetimeBegin;
    }

    public void setVerifyDatetimeBegin(String verifyDatetimeBegin) {
        this.verifyDatetimeBegin = verifyDatetimeBegin;
    }

    public String getVerifyDatetimeEnd() {
        return verifyDatetimeEnd;
    }

    public void setVerifyDatetimeEnd(String verifyDatetimeEnd) {
        this.verifyDatetimeEnd = verifyDatetimeEnd;
    }

    public String getCreateDatetimeBegin() {
        return createDatetimeBegin;
    }

    public void setCreateDatetimeBegin(String createDatetimeBegin) {
        this.createDatetimeBegin = createDatetimeBegin;
    }

    public String getCreateDatetimeEnd() {
        return createDatetimeEnd;
    }

    public void setCreateDatetimeEnd(String createDatetimeEnd) {
        this.createDatetimeEnd = createDatetimeEnd;
    }

}
