package com.zhouyu;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Map;

public class Test_8_envirment {

    public static void main(String[] args) {
getEnv();
    }


    /**
     * 获取环境变量
     */

    public  static void getEnv() {
        AnnotationConfigApplicationContext    context=new AnnotationConfigApplicationContext(AppConfig.class);
        Map<String,Object>   systemEnvironment=context.getEnvironment().getSystemEnvironment();

        //----
        Map<String,Object>   systemProperty=context.getEnvironment().getSystemProperties();

        //-----
        MutablePropertySources  propertySources=context.getEnvironment().getPropertySources();

        // 输出
        System.out.println("分割线---------------------");

//        System.out.println(systemEnvironment);
//        System.out.println(systemProperty);
//        System.out.println(propertySources);

        System.out.println(context.getEnvironment().getProperty("NO_PROXY"));
        System.out.println(context.getEnvironment().getProperty("sun.jnu.encoding"));
        System.out.println(context.getEnvironment().getProperty("zhouyu"));

    }

}










