package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class LoggingAspect {
    //@Before("execution( public void aop.UniLibrary.getBook())")

   // @Before("execution( public void get*())")
   // public void beforeGetBookAdvice() {
       // System.out.println("beforeGetBookAdvice: try to get a book");


       // @Before("execution(public void returnBook())")
        //public void beforeReturnBookAdvice () {
           // System.out.println("beforeReturnBookAdvice: try to bring back a book");

            @Before("execution(* *())")
            public void beforeReturnBookAdvice () {
                System.out.println("beforeReturnBookAdvice: try to bring back a book");


        }
    }


