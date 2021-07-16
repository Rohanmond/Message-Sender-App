package com.example.demomessage;

import com.twilio.Twilio;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class TwilioInitializer {
    private static final String acc_sid="AC0579e5986087b618bf9b115b80ca15eb";
    private static final String auth_token="82f3371c3943c823ab6e1bed6a75838c";
    private static final String ph_number="+19092459674";
    public TwilioInitializer(){
        Twilio.init(acc_sid,auth_token);
    }
}
