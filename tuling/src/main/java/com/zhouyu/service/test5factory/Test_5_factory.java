package com.zhouyu.service.test5factory;


import com.zhouyu.AppConfig;
import com.zhouyu.service.User;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_5_factory {
    public static void main(String[] args) {

beanFactory();
    }

// DefaultListableBeanFactory--ConfigurableListableBeanFactory--ListableBeanFactory--



        public static void beanFactory() {
            ApplicationContext    context1=new AnnotationConfigApplicationContext(AppConfig.class);
            /**
             *  new AnnotationConfigApplicationContext(AppConfig.class);创建 ，当前类的构造方法里面就会先调用父类里面的构造方法，就是下面
             *  	public AnnotationConfigApplicationContext(Class<?>... componentClasses) {
             *      super();------------------------------------------@@调用父类构造
             * 		this();
             * 		register(componentClasses);
             * 		refresh();
             *        }
             *        ---------------------------
             * 	public GenericApplicationContext() {
             * 		this.beanFactory = new DefaultListableBeanFactory();
             *        }
             */

            DefaultListableBeanFactory  beanFactory=new DefaultListableBeanFactory();
            AbstractBeanDefinition beanDefinition= BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
            beanDefinition.setBeanClass(User.class);
            beanFactory.registerBeanDefinition("user",beanDefinition);
            System.out.println(beanFactory.getBean("user"));
            }
    }










