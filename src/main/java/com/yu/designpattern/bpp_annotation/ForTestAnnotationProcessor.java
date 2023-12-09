package com.yu.designpattern.bpp_annotation;

import org.springframework.aop.support.AopUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

/**
 * @Author zhongcanyu
 * @Date 2023/12/9
 */
@Component
public class ForTestAnnotationProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        ForTestAnnotation annotation = AnnotationUtils.findAnnotation(AopUtils.getTargetClass(bean), ForTestAnnotation.class);

        if (annotation == null) {
            return bean;
        }

        System.out.println(beanName + "---Implement the desired expansion logic");

        return bean;
    }
}
