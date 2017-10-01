package com.litesky.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by finefine.com on 2017/10/1.
 */
public class Message implements Serializable {
    private static final long serialVersionUID=-3289781765432l;

    /**
     * id
     */
    private int id;
    /**
     * 维修员id
     */
    private int pid;
    /**
     * 消息主题
     */
    private String subject;
    /**
     * 消息内容
     */
    private String content;
    /**
     * 创建时间
     */
    private Date createTime;

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
