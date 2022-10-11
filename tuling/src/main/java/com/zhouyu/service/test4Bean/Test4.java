package com.zhouyu.service.test4Bean;


import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.ChildBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;

public class Test4 {
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//
//    }


    /**
     *
     * BeanDefinition是一个接口，的实现类有12类+1个接口，一共13个，
     * 其中比较重要的 1.GenericBeanDefinition 2.ScannedGenericBeanDefinition  3.AnnotatedGenericBeanDefinition  4.RootBeanDefinition
     * 5.ChildBeanDefinition
     */

    /**
     * 下面方法几个类式比较重要的  需要多多学习的
     */
        public void n1() {


            GenericBeanDefinition  gene=new GenericBeanDefinition();

//            ScannedGenericBeanDefinition  ff=new ScannedGenericBeanDefinition();
//            AnnotatedGenericBeanDefinition  ffs=new  AnnotatedGenericBeanDefinition();

//            RootBeanDefinition  bb=new RootBeanDefinition();    //  父级abstractBeanDefinition
           // ChildBeanDefinition cc=new ChildBeanDefinition();    //  父级abstractBeanDefinition
        }


    }










