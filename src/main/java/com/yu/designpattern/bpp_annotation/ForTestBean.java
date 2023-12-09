package com.yu.designpattern.bpp_annotation;

/**
 * @Author zhongcanyu
 * @Date 2023/12/9
 */
@ForTestAnnotation
public class ForTestBean {

    public ForTestBean() {
        System.out.println(ForTestBean.class.getSimpleName() + " -- init");
    }
}
