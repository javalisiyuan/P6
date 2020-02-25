package com.study.p6_2.p62_5.Jbatis.annotation;

import java.lang.annotation.*;

/**
 * 用于注解拦截器，指定拦截的方法
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Intercepts {
    String value();
}
