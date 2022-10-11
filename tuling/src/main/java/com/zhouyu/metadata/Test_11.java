package com.zhouyu.metadata;


import com.zhouyu.AppConfig;
import org.springframework.aop.aspectj.annotation.SimpleMetadataAwareAspectInstanceFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.SimpleMetadataReaderFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Set;

public class Test_11 {

    public static void main(String[] args) throws IOException {
        metadata();
    }


    /**
     * 获取事件发布功能
     */

    public static void metadata() throws IOException {
        SimpleMetadataReaderFactory metaAwareFactory = new SimpleMetadataReaderFactory();
        MetadataReader metadataReader = metaAwareFactory.getMetadataReader("com.zhouyu.metadata.UserMetadataService");
        ClassMetadata classMetadata = metadataReader.getClassMetadata();

        System.out.println(">>>>>$$$");
        System.out.println(classMetadata.getClassName());


        System.out.println(classMetadata.getInterfaceNames());
//        for (String  c:           classMetadata.getInterfaceNames()) {
//            System.out.println(c);
//        }
//        // 内部类名    --底层使用ASM
//        for (String  str:  classMetadata.getMemberClassNames()) {
//            System.out.println(str);
//        }

        System.out.println("注解-------------------》》》》》》》");

        // 注解
        AnnotationMetadata  annotationMetadata=metadataReader.getAnnotationMetadata();
        Set<String> annotationTypes = annotationMetadata.getAnnotationTypes();
        for (String   anType: annotationTypes) {
            System.out.println(anType);
        }

        // 判断是否标注了注解


        System.out.println(annotationMetadata.hasAnnotation(Service.class.getName()));
        System.out.println(annotationMetadata.hasAnnotation(Scope.class.getName()));
        System.out.println(annotationMetadata.hasMetaAnnotation(Service.class.getName()));//
        System.out.println(annotationMetadata.hasMetaAnnotation(Scope.class.getName()));

        System.out.println("d------------------------");

        System.out.println(annotationMetadata.hasAnnotation(Component.class.getName()));// 这个类UserMetadataService 上面有这个注解吗，发现没有
        System.out.println(annotationMetadata.hasMetaAnnotation(Component.class.getName())); // 这个类UserMetadataService上面的注解的上面有这个注解吗？  发现@Service上面有这个注解@Component


    }


}










