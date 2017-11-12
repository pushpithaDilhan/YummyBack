package com.yummyback.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class AppUtil {

    private static DateFormat dateFormat;

    public static String getDateTime() {
        if(dateFormat == null){
            dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        }
        Date datetime = new Date();
        return dateFormat.format(datetime);
    }

    public static String generateUUID(){
        return UUID.randomUUID().toString();
    }

}
