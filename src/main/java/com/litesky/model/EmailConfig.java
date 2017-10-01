package com.litesky.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by finefine.com on 2017/10/1.
 */
public class EmailConfig implements Serializable{

    private static final long serialVersionUID=2416988789654l;
    /**
     * id
     */
    private int id;

    /**
     * 主机
     */
    private String host;
    /**
     * 协议
     */
    private String procotol;

    /**
     * 邮箱账号
     */
    private String userName;

    /**
     * 邮箱密码
     */
    private String password;

    /**
     * 创建时间
     */
    private Date crateTime;

    /**
     * 更改时间
     */
    private Date updateTime;

    private int isuse;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getProcotol() {
        return procotol;
    }

    public void setProcotol(String procotol) {
        this.procotol = procotol;
    }

    public Date getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIsuse() {
        return isuse;
    }

    public void setIsuse(int isuse) {
        this.isuse = isuse;
    }
}
