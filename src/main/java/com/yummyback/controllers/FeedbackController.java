package com.yummyback.controllers;

import com.yummyback.util.AppUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/feedback")
public class FeedbackController {

    @RequestMapping(value = "/{uuid}", method = RequestMethod.GET)
    @ResponseBody
    public Boolean validateFeedbackUrl(@PathVariable String uuid){
        return true;
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    @ResponseBody
    public String submit(
            @RequestParam("service") int service,
            @RequestParam("quality") int quality,
            @RequestParam("cleanliness") int cleanliness,
            @RequestParam("food_value") int food_value,
            @RequestParam("response") int response_time,
            @RequestParam("comment") String comment,
            @RequestParam("email") String email,
            @RequestParam("mobile") String mobile
    ){
        String datetime = AppUtil.getDateTime();
        return "Submitted";
    }


}
