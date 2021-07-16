package com.example.demomessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
@RequestMapping("/sendSms")
public class Controller {
    @Autowired
    private Service service;
    @GetMapping
    public String sendSMS(@ModelAttribute("smsReq") SmsReq smsReq,Model model){
        return "index";
    }
    @PostMapping
    public String SendSMS(@ModelAttribute("smsReq") SmsReq smsReq, Model model){
       if(smsReq.getPh_no().length()==10) smsReq.setPh_no("+91"+smsReq.getPh_no());
       boolean res= service.sendSMS(smsReq);
       if(res){
           model.addAttribute("sendSuccess",true);
       }else{
           model.addAttribute("sendError",true);
       }
        return "index";
    }
}
