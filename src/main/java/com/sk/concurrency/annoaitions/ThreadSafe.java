package com.sk.concurrency.annoaitions;

/**
 *
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: concurrency
 * @description:  非线程安全注解标记，无逻辑影响
 * @author: sk_wangc
 * @create: 2019-08-28 14:45
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ThreadSafe {
    String value() default "";
}
