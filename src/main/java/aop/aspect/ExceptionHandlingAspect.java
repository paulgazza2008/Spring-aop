package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)


public class ExceptionHandlingAspect {
    @Before("aop.aspect.MyPointcuts.allAddMethods()")

    public void beforeGAddExceptionHandlingAdvice(){

        System.out.println("beforeAddExceptionHandlingAdvice:catching/handling " + "an exception when trying to get a book/magazine");
        System.out.println("-----------------------------------------");



    }









}
