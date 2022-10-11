package com.zhouyu.service.test2Bean;

import org.springframework.stereotype.Component;

/**
 * 用户于对比编程式和声明式创建Bean
 */
@Component
public class DemoBeanService {
    public void test() {

        System.out.println("声明方式--注解");
    }
}
