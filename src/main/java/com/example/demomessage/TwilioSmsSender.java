package com.example.demomessage;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Service;

@Service
public class TwilioSmsSender implements SmsSender{
    @Override
    public boolean sendSms(SmsReq smsReq) {
        if(isPhoneNumberValid(smsReq.getPh_no())){
       MessageCreator creator= Message.creator(
                new PhoneNumber(smsReq.getPh_no()),
                new PhoneNumber("###DEMO_PHNO####"),
                smsReq.getMessage()
        );
       creator.create(); return true;}
        else{
            return false;
        }
    }

    private boolean isPhoneNumberValid(String ph_no) {
        if(ph_no.length()==13) return true;
        else return false;
    }

}
