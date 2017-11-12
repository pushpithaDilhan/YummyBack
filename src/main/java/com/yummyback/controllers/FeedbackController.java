package com.yummyback.controllers;

import com.yummyback.util.AppUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    @ResponseBody
    public String submit(
            @RequestParam("service") int service,
            @RequestParam("quality") int quality,
            @RequestParam("cleanliness") int cleanliness,
            @RequestParam("food_value") int food_alue,
            @RequestParam("response") int response_time,
            @RequestParam("comment") String comment,
            @RequestParam("email") String email,
            @RequestParam("mobile") String mobile
    ){
        String datetime = AppUtil.getDateTime();
        return "Submitted";
    }


}
