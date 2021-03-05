package aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class NewLoggingAspect {

    @Around("execution(public String returnBook())")

    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("aroundReturnBookLoggingAdvice:Library " + " trying to return book");
        Long  begin = System.currentTimeMillis();

        Object targetMethodResult = proceedingJoinPoint.proceed();

        targetMethodResult = "Crime and punishment";

        Long end = System.currentTimeMillis();


        System.out.println("aroundReturnBookLoggingAdvice:Library: " + " successfully return book");


        System.out.println("aroundReturnBookLoggingAdvice:Library : Method return book" + "work completed for " + ( end-begin) + " Millis ");

        return targetMethodResult;
    }
}


