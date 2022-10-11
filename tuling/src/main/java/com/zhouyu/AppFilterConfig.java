package com.zhouyu;

import com.zhouyu.convertest.StringToUserConverter;
import com.zhouyu.convertest.StringToUserPropertyEditor;
import com.zhouyu.service.User;
import com.zhouyu.service.UserService;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.beans.PropertyEditor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//   ,excludeFilters 排除类和其他信息，

//@ComponentScan(value = "com.zhouyu",excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = UserService.class)})
@ComponentScan(value = "com.zhouyu",includeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = UserService.class)})
// 使用include 即使UserService类上面没有Component也是 bean放入context
public class AppFilterConfig {

    /**
     * 中英文提示语---------Test_6_messages
     *
     * @return
     */
    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        return messageSource;
    }

    /**
     * 下面定义一个时间监听器   --Test_9_Eventpublish
     */
    @Bean
    public ApplicationListener applicationListener() {
        return new ApplicationListener() {
            @Override
            public void onApplicationEvent(ApplicationEvent event) {
                System.out.println("收到一个事件：：" + event.getSource());
            }
        };

    }

    /**
     * 对用Test-10          PropertyEditor() { 方法
     */
    @Bean
    public CustomEditorConfigurer customEditorConfigurer() {
        CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
        Map<Class<?>, Class<? extends PropertyEditor>> propertyMap = new HashMap<>();

        //  定义  StringToUserPropertyEditor类可以将 @Value(value = "tomy")  String类型转换为User
        propertyMap.put(User.class, StringToUserPropertyEditor.class);
        customEditorConfigurer.setCustomEditors(propertyMap);

        return customEditorConfigurer;
    }


    /**
     * 对用Test-10          ConversionService() { 方法
     */
    @Bean
    public ConversionServiceFactoryBean conversionService() {
        ConversionServiceFactoryBean conversionServiceFactoryBean=new ConversionServiceFactoryBean();
        conversionServiceFactoryBean.setConverters(Collections.singleton(new StringToUserConverter()));
        return  conversionServiceFactoryBean;
    }



}

