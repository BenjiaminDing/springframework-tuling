package com.zhouyu.convertest;


import com.zhouyu.AppConfig;
import com.zhouyu.service.CarService;
import com.zhouyu.service.User;
import org.springframework.beans.SimpleTypeConverter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.convert.support.DefaultConversionService;

public class Test_10 {

    public static void main(String[] args) {
//        PropertyEditor()；
//        ConversionService();
        typeConverter();
    }


    public static void PropertyEditor() {
        // ##方式一

        //        StringToUserPropertyEditor  propertyEditor=new StringToUserPropertyEditor();
//        propertyEditor.setAsText("2");
//        User value=(User)propertyEditor.getValue();
//        System.out.println(value);
        /**    方式二
         * 上面的代码只是支持一种，其实spring提供了一种通用的转换器
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CarService ss = (CarService) context.getBean("carService");
        System.out.println("转换》》》》");
        ss.userDriveCar();
    }


    public static void ConversionService() {
// 方式一
//        DefaultConversionService  defaultConversionService=new DefaultConversionService();
//        defaultConversionService.addConverter(new StringToUserConverter());
//        User convert = defaultConversionService.convert("2", User.class);
//        System.out.println("print--before");
//        System.out.println(convert);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CarService ss = (CarService) context.getBean("carService");
        System.out.println("print--before");
        ss.userDriveCar();
    }

    /**
     * 第三种 支持前面两种
     */

    public static void typeConverter() {

        // jdk
        SimpleTypeConverter typeConverter = new SimpleTypeConverter();
        typeConverter.registerCustomEditor(User.class, new StringToUserPropertyEditor());
        // converter
        DefaultConversionService conversionService = new DefaultConversionService();
        typeConverter.setConversionService(conversionService);
        // 他同时支持两种方式
        User value = typeConverter.convertIfNecessary("2", User.class);
        System.out.println("print--brfore");
        System.out.println(value);

    }

    /**
     * 第四种类比
     */
    public static void fourth() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CarService ss = (CarService) context.getBean("carService");
//        CarService ss=context.getBean("carService",CarService.class);

        System.out.println("转换》》》》");
        ss.userDriveCar();
    }
}










