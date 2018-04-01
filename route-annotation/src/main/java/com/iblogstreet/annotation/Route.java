package com.iblogstreet.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by armyone on 2018/3/31.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface Route {
    /**
     * 路径
     *
     * @return
     */
    String path();

    /**
     * 分组
     *
     * @return
     */
    String group() default "";
}
