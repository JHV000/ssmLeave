package com.leave.model;

public class Leave {
    private int uid;
    private int id;
    private String starttime;
    private String endtime;
    private String reason;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "uid=" + uid +
                ", id=" + id +
                ", starttime='" + starttime + '\'' +
                ", endtime='" + endtime + '\'' +
                ", reason='" + reason + '\'' +
                ", status=" + status +
                '}';
    }
}
