package com.example.demomessage;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private TwilioSmsSender twilioSmsSender;

    public boolean sendSMS(SmsReq smsReq){

        return twilioSmsSender.sendSms(smsReq);
    }
}
