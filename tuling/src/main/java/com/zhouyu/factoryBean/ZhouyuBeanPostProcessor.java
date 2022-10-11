package com.zhouyu.factoryBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * created     by benjiamin at 2022-08-31 / 20:42 /42
 */
@Component
// 和ZhouyuFactoryBean 有关系
public class ZhouyuBeanPostProcessor  implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
     if(beanName.equals("userService")){
         System.out.println("初始化前"+bean);
     }
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("userService")){
            System.out.println("初始化后"+bean);
        }
        return bean;

    }
}
