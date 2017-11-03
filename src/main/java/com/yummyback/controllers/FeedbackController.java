package com.yummyback.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/feedback")
public class FeedbackController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return "<h1>Yummyback is working</h1>";
    }

    @RequestMapping(value = "/validate", method = RequestMethod.GET)
    @ResponseBody
    public Boolean validate(){
        return true;
    }

    @RequestMapping(value = "/submit", method = RequestMethod.GET)
    @ResponseBody
    public String submit(){
        return "Submitted";
    }


}
