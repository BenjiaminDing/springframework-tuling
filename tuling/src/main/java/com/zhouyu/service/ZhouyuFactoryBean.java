package com.zhouyu.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * created     by benjiamin at 2022-08-31 / 20:10 /10
 */
//@Component("userService")
public class ZhouyuFactoryBean  implements FactoryBean {

    // 使用这个方式 创建bean  ,userService类上不需要使用@Component 注解
    @Override
    public Object getObject() throws Exception {
        return new UserService();
    }

    @Override
    public Class<?> getObjectType() {
        return UserService.class;
    }
    /**
     * 使用这种方式 ，得到的UserService 经过的生命周期是没有初始化前的 和使用@Bean在方法上 声明的UserService 形成鲜明的对比，后者经历三个过程
     */
}
