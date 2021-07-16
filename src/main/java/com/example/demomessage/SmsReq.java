package com.example.demomessage;

public class SmsReq {
    private String ph_no;
    private String message;

    public SmsReq(String ph_no, String message) {
        this.ph_no = ph_no;
        this.message = message;
    }

    public String getPh_no() {
        return ph_no;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SmsReq{" +
                "ph_no='" + ph_no + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
