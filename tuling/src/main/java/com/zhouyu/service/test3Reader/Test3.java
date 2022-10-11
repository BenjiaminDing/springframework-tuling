package com.zhouyu.service.test3Reader;


import com.zhouyu.AppConfig;
import com.zhouyu.service.User;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class Test3 {



    /**
     *
     */
    @org.junit.Test
    public void name() {
        BeanDefinitionReader();
    }

    public void BeanDefinitionReader() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AnnotatedBeanDefinitionReader annotatedBeanDefinitionReader=new AnnotatedBeanDefinitionReader(context);

        annotatedBeanDefinitionReader.register(DefinitionReaderBean.class);
        System.out.println(context.getBean("definitionReaderBean"));
    }


    public void BeanDefinitionReader2() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.register(User.class);
        System.out.println(context.getBean("definitionReaderBean"));
    }

    @org.junit.Test
    public void xmlReader() {
        xmlRead();
    }



    /**
     *解析xml的方法
     */
    public  void xmlRead() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        XmlBeanDefinitionReader xmlReader = new XmlBeanDefinitionReader(context);
//        xmlReader.loadBeanDefinitions(Resource  resource)  --Resource路径下面的文件 ,  i的值 返回有几个bean对象
        int i = xmlReader.loadBeanDefinitions("spring.xml");
        System.out.println("i::::" + i);

        System.out.println(context.getBean("readerBean"));
    }



    @org.junit.Test
    public void Scan() {
        classPathRead();
    }
    /**
     * 定义一个扫描去器.但是类上面需要注解@Component
     */
    public  void classPathRead() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.refresh();

        // new AnnotationConfigApplicationContext(); 不传入AppConfig.class 一样可以getBean获取到返回值，
        // 下面两行就是替换  //@ComponentScan("com.zhouyu")  作用
        ClassPathBeanDefinitionScanner  pathScanner=new ClassPathBeanDefinitionScanner(context);
        int count = pathScanner.scan("com.zhouyu");

        System.out.println(context.getBean("scannerBean"));
    }
}







