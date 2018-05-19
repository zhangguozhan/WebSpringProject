package com.spring.in.action.c2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.in.action.c2.impl.ConfigScanFlag;

@Configuration
//@ComponentScan("com.spring.in.action.c2.impl")
@ComponentScan(basePackageClasses = {ConfigScanFlag.class})
public class CDPlayerConfig {

}
