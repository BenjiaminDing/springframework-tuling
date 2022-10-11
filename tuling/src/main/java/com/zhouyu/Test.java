package com.zhouyu;


import com.zhouyu.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		// 创建一个Spring容器
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        // 需要使用@Component("UserService")注解---属于声明式的创建Bean
		UserService userService = (UserService) applicationContext.getBean("UserService");
		userService.test();
//----



	}


}







