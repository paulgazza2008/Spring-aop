package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)


public class SecurityAspect {

        @Before(" aop.aspect.MyPointcuts.allAddMethods()")
        public void beforeAddSecurityAdvise() {
            System.out.println(" beforeAddSecurityAdvise: checking the right to get a book/magazine");
            System.out.println("-----------------------------------------");
        }












        }
