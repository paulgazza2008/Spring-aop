package aop.aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* abc* (..))")
    public void allAddMethods(){


    }




    }

