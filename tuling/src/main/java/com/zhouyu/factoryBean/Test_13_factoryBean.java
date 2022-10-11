package com.zhouyu.factoryBean;


import com.zhouyu.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_13_factoryBean {

    public static void main(String[] args) {
getFactory();
    }

    public static  void getFactory() {

//        AnnotationConfigApplicationContext    context=new AnnotationConfigApplicationContext(AppConfig.class);
//        两个对象
//        System.out.println(context.getBean("userService"));  // com.zhouyu.service.UserService@fa36558
//        System.out.println(context.getBean("&zhouyuFactoryBean"));  // com.zhouyu.service.UserService@fa36558


        AnnotationConfigApplicationContext    context=new AnnotationConfigApplicationContext(AppConfig.class);
//        System.out.println("测试@Bean和 implements FactoryBean {  创建Bean 生命周期的问题");
        System.out.println(">>>>>>>>>>start");
        System.out.println(context.getBean("userService"));  // com.zhouyu.service.UserService@fa36558

    }


}










