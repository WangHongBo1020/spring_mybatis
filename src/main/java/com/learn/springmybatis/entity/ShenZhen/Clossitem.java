package com.learn.springmybatis.entity.ShenZhen;

import java.io.Serializable;

/**
 * \* KDA IntelliJ IDEA.
 * \* User: hi
 * \* Date: 2021/06/04
 * \* Time: 15:07

 * \
 */

public class Clossitem implements Serializable {
    private static final long serialVersionUID = 1L;

    private String insertdate;

    private String ifobject;

    private String taskserialno;

    private String insertop;

    private String surveystatus;

    private String currtask;

    private String lossitemserialno;

    private String ifdispatch;

    private String insertunit;

    private String resurveyserialno;

    private String subserialno;

    private String tootherserialno;

    private String opdate;

    private String losstype;

    private String caseno;

    private String LOSSITEMP17ID;

    private String MEMO;

    public String getMEMO() {
        return MEMO;
    }

    public void setMEMO(String MEMO) {
        this.MEMO = MEMO;
    }

    public String getInsertdate() {
        return insertdate;
    }

    public void setInsertdate(String insertdate) {
        this.insertdate = insertdate;
    }

    public String getIfobject() {
        return ifobject;
    }

    public void setIfobject(String ifobject) {
        this.ifobject = ifobject;
    }

    public String getInsertop() {
        return insertop;
    }

    public void setInsertop(String insertop) {
        this.insertop = insertop;
    }

    public String getCurrtask() {
        return currtask;
    }

    public void setCurrtask(String currtask) {
        this.currtask = currtask;
    }

    public String getLossitemserialno() {
        return lossitemserialno;
    }

    public void setLossitemserialno(String lossitemserialno) {
        this.lossitemserialno = lossitemserialno;
    }

    public String getIfdispatch() {
        return ifdispatch;
    }

    public void setIfdispatch(String ifdispatch) {
        this.ifdispatch = ifdispatch;
    }

    public String getInsertunit() {
        return insertunit;
    }

    public void setInsertunit(String insertunit) {
        this.insertunit = insertunit;
    }

    public String getResurveyserialno() {
        return resurveyserialno;
    }

    public void setResurveyserialno(String resurveyserialno) {
        this.resurveyserialno = resurveyserialno;
    }

    public String getOpdate() {
        return opdate;
    }

    public void setOpdate(String opdate) {
        this.opdate = opdate;
    }

    public String getLosstype() {
        return losstype;
    }

    public void setLosstype(String losstype) {
        this.losstype = losstype;
    }

    public String getCaseno() {
        return caseno;
    }

    public void setCaseno(String caseno) {
        this.caseno = caseno;
    }

    public String getLOSSITEMP17ID() {
        return LOSSITEMP17ID;
    }

    public void setLOSSITEMP17ID(String LOSSITEMP17ID) {
        this.LOSSITEMP17ID = LOSSITEMP17ID;
    }


    public String getTaskserialno() {
        return taskserialno;
    }

    public void setTaskserialno(String taskserialno) {
        this.taskserialno = taskserialno;
    }

    public String getSurveystatus() {
        return surveystatus;
    }

    public void setSurveystatus(String surveystatus) {
        this.surveystatus = surveystatus;
    }

    public String getSubserialno() {
        return subserialno;
    }

    public void setSubserialno(String subserialno) {
        this.subserialno = subserialno;
    }

    public String getTootherserialno() {
        return tootherserialno;
    }

    public void setTootherserialno(String tootherserialno) {
        this.tootherserialno = tootherserialno;
    }


    @Override
    public String toString() {
        return "Clossitem{" +
                "insertdate='" + insertdate + '\'' +
                ", ifobject='" + ifobject + '\'' +
                ", taskserialno='" + taskserialno + '\'' +
                ", insertop='" + insertop + '\'' +
                ", surveystatus='" + surveystatus + '\'' +
                ", currtask='" + currtask + '\'' +
                ", lossitemserialno='" + lossitemserialno + '\'' +
                ", ifdispatch='" + ifdispatch + '\'' +
                ", insertunit='" + insertunit + '\'' +
                ", resurveyserialno='" + resurveyserialno + '\'' +
                ", subserialno='" + subserialno + '\'' +
                ", tootherserialno='" + tootherserialno + '\'' +
                ", opdate='" + opdate + '\'' +
                ", losstype='" + losstype + '\'' +
                ", caseno='" + caseno + '\'' +
                ", LOSSITEMP17ID='" + LOSSITEMP17ID + '\'' +
                ", MEMO='" + MEMO + '\'' +
                '}';
    }
}
