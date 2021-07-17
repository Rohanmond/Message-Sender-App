package com.example.demomessage;

import com.twilio.Twilio;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class TwilioInitializer {
    private static final String acc_sid="####DEMO_SID####";
    private static final String auth_token="###DEMO_AUTH_TOKEN#######";
    private static final String ph_number="###DEMO_PH_NO####";
    public TwilioInitializer(){
        Twilio.init(acc_sid,auth_token);
    }
}
