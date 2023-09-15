package com.cqh.spring.demo.aspect;


import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 日志切面，功能是实现对方法调用时，打印相印的日志
 */
@Aspect
@Component
public class LoggingAspect {

    Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(public boolean com.cqh.spring.demo.aspect.UserService.updateUser(int,String))")

    public void beforeMethod(JoinPoint joinPoint){
        logger.info("=====before method");
        Object[] args = joinPoint.getArgs();
        String methodName = joinPoint.getSignature().getName();
        logger.info("====before method:方法名称为" + methodName +"参数为" + args);

    }
}
