package com.example.wangweijun.dagger2_test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by wangweijun on 2017/11/20.
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface RedCloth {
}
