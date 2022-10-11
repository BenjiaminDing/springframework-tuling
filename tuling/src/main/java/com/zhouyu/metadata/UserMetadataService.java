package com.zhouyu.metadata;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * created     by benjiamin at 2022-08-30 / 12:51 /51
 *
 * 该类只是为了测试Test-11 的接口量 和成员变量的的 信息
 */

@Service
@Scope
public class UserMetadataService implements ApplicationContextAware {

    private  ApplicationContext applicationContext;

    private ClassPathXmlApplicationContext   classPathXmlApplicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

// 内部类
    class InnerClass_Ben{
        private   String  name;
        private   String  address;
}
}
