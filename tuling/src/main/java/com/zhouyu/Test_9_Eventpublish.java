package com.zhouyu;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.MutablePropertySources;

import java.util.Map;

public class Test_9_Eventpublish {

    public static void main(String[] args) {
getEnv();
    }


    /**
     * 获取事件发布功能
     */

    public  static void getEnv() {
        AnnotationConfigApplicationContext    context=new AnnotationConfigApplicationContext(AppConfig.class);
   context.publishEvent("发布事件--警报");
    }

}










