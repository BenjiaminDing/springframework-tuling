package com.zhouyu.service;

import org.springframework.core.OrderComparator;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;


public class BikeService {

    public static void main(String[] args) {
        com();
    }

    public static void com() {
        A a = new A();
        B b = new B();

        OrderComparator orderComparator = new OrderComparator();
        System.out.println(orderComparator.compare(a, b));

        //---
        List list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.sort(orderComparator);
        // 打印
        System.out.println(list.toString());

    }

        public void com2() {
            A a = new A();
            B b = new B();
            AnnotationAwareOrderComparator  awareOrderComparator=new AnnotationAwareOrderComparator();
            awareOrderComparator.compare(a,b);

            //---
            List list = new ArrayList<>();
            list.add(a);
            list.add(b);
            list.sort(awareOrderComparator);
            // 打印
            System.out.println(list.toString());
            }

}

class A<T> implements Ordered {

    @Override
    public int getOrder() {
        return 2;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

class B<T> implements Ordered {

    @Override
    public int getOrder() {
        return 3;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
