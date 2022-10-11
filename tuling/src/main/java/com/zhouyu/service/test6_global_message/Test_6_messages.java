package com.zhouyu.service.test6_global_message;


import com.zhouyu.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

/**
 * 国际化
 */
public class Test_6_messages {

    public static void main(String[] args) {
messages();
    }

    /**
     * 对应这个文件  messages.properties  messages_en.properties
     */
    public  static  void messages() {
        ApplicationContext    context1=new AnnotationConfigApplicationContext(AppConfig.class);
      String ss=  context1.getMessage("test",null,new Locale("en"));
      String ss_CN=  context1.getMessage("test",null,new Locale("en_CN"));
        System.out.println(ss); //英文
        System.out.println(ss_CN);  //中文
        }

    }










