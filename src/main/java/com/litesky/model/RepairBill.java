package com.litesky.model;

import java.util.Date;

/**
 * Created by finefine.com on 2017/8/30.
 */
public class RepairBill {
    /**
     * id
     */
    private int id;

    /**
     * 父id
     */
    private int pid;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 完成时间
     */
    private Date completeTime;

    /**
     * 状态 完成(0）未完成（1）失效（2）
     */
    private short state;

    /**
     * 客户名字
     */
    private String name;

    /**
     * 性别
     */
    private short gender;

    /**
     * QQ号
     */
    private String QQ;

    /**
     * 电话
     */
    private String phone;

    /**
     * 学号
     */
    private int StudentID;

    /**
     * 地址
     */
    private String address;

    /**
     * 原因描述
     */
    private String remark;

    /**
     * 笔记本sn码
     */
    private String SN;

    /**
     * 建议
     */
    private String advice;

    /**
     * 是否交接 否（0）是（1）
     */
    private short handOverState;

    /**
     * 交接来源（维修员的id）
     */
    private int handOverFrom;

    /**
     * 交接去向（维修员ID）
     */
    private int getHandOverTO;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getGender() {
        return gender;
    }

    public void setGender(short gender) {
        this.gender = gender;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSN() {
        return SN;
    }

    public void setSN(String SN) {
        this.SN = SN;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public short getHandOverState() {
        return handOverState;
    }

    public void setHandOverState(short handOverState) {
        this.handOverState = handOverState;
    }

    public int getHandOverFrom() {
        return handOverFrom;
    }

    public void setHandOverFrom(int handOverFrom) {
        this.handOverFrom = handOverFrom;
    }

    public int getGetHandOverTO() {
        return getHandOverTO;
    }

    public void setGetHandOverTO(int getHandOverTO) {
        this.getHandOverTO = getHandOverTO;
    }

    @Override
    public String toString() {
        return "RepairBill{" +
                "id=" + id +
                ", pid=" + pid +
                ", createTime=" + createTime +
                ", completeTime=" + completeTime +
                ", state=" + state +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", QQ='" + QQ + '\'' +
                ", phone='" + phone + '\'' +
                ", StudentID=" + StudentID +
                ", address='" + address + '\'' +
                ", remark='" + remark + '\'' +
                ", SN='" + SN + '\'' +
                ", advice='" + advice + '\'' +
                ", handOverState=" + handOverState +
                ", handOverFrom=" + handOverFrom +
                ", getHandOverTO=" + getHandOverTO +
                '}';
    }
}
