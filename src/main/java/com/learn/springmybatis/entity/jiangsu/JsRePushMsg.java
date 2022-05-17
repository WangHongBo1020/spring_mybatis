package com.learn.springmybatis.entity.jiangsu;

import java.util.Date;

/**
 * com.sunshine.autoclaim.domain.jiangsu
 *
 * @Author wujiyao
 * @create 2021 2021/4/16 10:56
 */

public class JsRePushMsg {

    private String sid; //,
    private String worktype; //流程类型
    private String claimNo;
    private String flag; // 1: 成功 2：失败
    private Date optime; //创建时间
    private String unitcode; ////机构编码
    private String no1; //
    private String no2; //
    private String js_Exchange; //交换机
    private String js_Queue; //队列
    private String msg_Xml;//  CLOB 报文
    private String remark;  //单条日志记录
    private Integer optimes; //上传次数

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getWorktype() {
        return worktype;
    }

    public void setWorktype(String worktype) {
        this.worktype = worktype;
    }

    public String getClaimNo() {
        return claimNo;
    }

    public void setClaimNo(String claimNo) {
        this.claimNo = claimNo;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Date getOptime() {
        return optime;
    }

    public void setOptime(Date optime) {
        this.optime = optime;
    }

    public String getUnitcode() {
        return unitcode;
    }

    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    public String getNo1() {
        return no1;
    }

    public void setNo1(String no1) {
        this.no1 = no1;
    }

    public String getNo2() {
        return no2;
    }

    public void setNo2(String no2) {
        this.no2 = no2;
    }

    public String getJs_Exchange() {
        return js_Exchange;
    }

    public void setJs_Exchange(String js_Exchange) {
        this.js_Exchange = js_Exchange;
    }

    public String getJs_Queue() {
        return js_Queue;
    }

    public void setJs_Queue(String js_Queue) {
        this.js_Queue = js_Queue;
    }

    public String getMsg_Xml() {
        return msg_Xml;
    }

    public void setMsg_Xml(String msg_Xml) {
        this.msg_Xml = msg_Xml;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getOptimes() {
        return optimes;
    }

    public void setOptimes(Integer optimes) {
        this.optimes = optimes;
    }

    @Override
    public String toString() {
        return "JsRePushMsg{" +
                "sid='" + sid + '\'' +
                ", worktype='" + worktype + '\'' +
                ", claimNo='" + claimNo + '\'' +
                ", flag='" + flag + '\'' +
                ", optime=" + optime +
                ", unitcode='" + unitcode + '\'' +
                ", no1='" + no1 + '\'' +
                ", no2='" + no2 + '\'' +
                ", js_Exchange='" + js_Exchange + '\'' +
                ", js_Queue='" + js_Queue + '\'' +
                ", msg_Xml='" + msg_Xml + '\'' +
                ", remark='" + remark + '\'' +
                ", optimes=" + optimes +
                '}';
    }
}
