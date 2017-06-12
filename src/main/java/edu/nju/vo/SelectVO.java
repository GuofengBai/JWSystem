package edu.nju.vo;

/**
 * Created by xinyu on 2017/6/12.
 */
public class SelectVO {
    private String cid;
    private String sid;

    public SelectVO() {
    }

    public SelectVO(String cid, String sid) {
        this.cid = cid;
        this.sid = sid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}
