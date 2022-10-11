package com.zhouyu.service.test7_resource;


import com.zhouyu.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Locale;

public class Test_7_getResource {

    public static void main(String[] args) {
        getResourceTest();
    }


    /**
     * 资源加载的功能
     */

    public  static void getResourceTest() {
        AnnotationConfigApplicationContext    context=new AnnotationConfigApplicationContext(AppConfig.class);
        try {
            Resource resource=    context.getResource("file://C:\\Users\\22166\\Desktop\\spring源码v1\\lesson3\\springframework-tuling\\tuling\\src\\main\\java\\com\\zhouyu");
            System.out.println(resource.contentLength());
            //-------------
            Resource res2=context.getResource("classpath:spring.xml");
            System.out.println(res2.contentLength());
            System.out.println(res2.getURL());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}










