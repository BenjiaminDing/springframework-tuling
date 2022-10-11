package com.zhouyu.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * created     by benjiamin at 2022-08-30 / 12:51 /51
 */

public class UserContextService  implements ApplicationContextAware {
    private  ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }


    /**

     在某些特殊的情况下，Bean需要实现某个功能，但该功能必须借助于Spring容器才能实现，
     此时就必须让该Bean先获取Spring容器，然后借助于Spring容器实现该功能。为了让Bean获取它所在的Spring容器，
     可以让该Bean实现ApplicationContextAware接口，这样可以方便获得ApplicationContext中的所有bean。
     换句话说，就是这个类可以直接获取Spring配置文件中，所有有引用到的Bean对象。
     ————————————————
     版权声明：本文为CSDN博主「让程序飞」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
     原文链接：https://blog.csdn.net/javanbme/article/details/116096885
     */
        public void useAppContext() {
        // 使用 applicationContext 做其他事情

            }
}
