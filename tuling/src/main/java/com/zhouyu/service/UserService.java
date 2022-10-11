package com.zhouyu.service;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component("UserService")
public class   UserService  {


	public void test(){
		System.out.println("你好，已经调用了UserService");
	}



}

