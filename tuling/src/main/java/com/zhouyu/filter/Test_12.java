package com.zhouyu.filter;

import com.zhouyu.AppFilterConfig;
import com.zhouyu.service.User;
import com.zhouyu.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * created     by benjiamin at 2022-08-31 / 19:54 /54
 */
public class Test_12 {

    public static void main(String[] args) throws IOException {
        metadata();
    }

    private static void metadata() {
        AnnotationConfigApplicationContext   context=new AnnotationConfigApplicationContext(AppFilterConfig.class);
     // 因为设置了排除UserService所以没有 bean
        UserService  userService=(UserService) context.getBean("userService");
        System.out.println(userService);

    }

}
