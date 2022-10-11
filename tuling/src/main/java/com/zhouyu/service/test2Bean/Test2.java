package com.zhouyu.service.test2Bean;


import com.zhouyu.AppConfig;
import com.zhouyu.service.User;
import com.zhouyu.service.UserService;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 创建Bean的方式有两大类
 * 第一种声明式：：  a--使用@Compennot
 *                b--使用@Bean---一般类似使用在 getUserBean( ){return new User()}这样的方法上
 *                c--使用spring.xml文件配置  类似  <bean id="user1" class="com.zhouyu.service.User"/> ，当然需要配合使用Scanner
 * 第二种编程式（这里只列举常用的几种）：：
 *                                  a--当前页面方法 getBean2() {AbstractBeanDefinition 类的使用}
 *                                  b-- 当前页面方法 getBean3(){AnnotatedBeanDefinitionReader 类的使用}
 *
 *
 * 小结：：实际上所用Bean的创建底层源码都是使用编程式 来生成一个Bean,使用xml，注解的方式只是为了更方便开发人员使用，提高开发效率
 */

public class Test2 {




    @org.junit.Test
    public void Anno_way() {
        getBean1();
    }

    /**
     * 声明式获取一个bean  使用@Component
     */
    public static void getBean1() {
        // 创建一个Spring容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        DemoBeanService demoBeanService = (DemoBeanService) applicationContext.getBean("demoBeanService");
        System.out.println("调用方法A1");
        demoBeanService.test();
    }


    @org.junit.Test
    public void programme_way() {
        getBean2();
    }
    /**
     * 编程式获取一个bean对象,不需要一个注解@Component注解
     */
    public static void getBean2() {
        // 创建一个Spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //39-43行就是和添加@Component注解的功能一样
        AbstractBeanDefinition beanDefinition= BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition.setBeanClass(DemoBeanService2.class);
        beanDefinition.setScope("singleton");

//        beanDefinition.setxx()  还有许多其他属性可以设置
        context.registerBeanDefinition("demoService2",beanDefinition); //然后把beanDefinition放入容器
        DemoBeanService2 demoBeanService2 = (DemoBeanService2) context.getBean("demoService2");
        demoBeanService2.demo1();
    }






}

//  AnnotatedBeanDefinitionReader   AbstractBeanDefinition





