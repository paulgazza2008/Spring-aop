package aop.aspect;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)

public class LoggingAspect {

    @Before("  aop.aspect.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvise(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature );

        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());

        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType() );

        System.out.println("methodSignature.getName() = " + methodSignature.getName() );

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj:arguments) {
                if (obj instanceof Book)  {
                    Book myBook = (Book) obj;
                    System.out.println("Information of book: name - " + myBook.getName() + " , author -"
                            + myBook.getAuthor() + ",year of publication - " + myBook.getYearOfPublication());

                }
                else if (obj instanceof String) {
                    System.out.println("book in the library is added " + obj);
                }

            }
        }
        System.out.println(" beforeAddLoggingAdvise: Logging " + "trying to get a book/magazine");
        System.out.println("-----------------------------------------");
    }















//    @Pointcut("execution( * aop.UniLibrary.* (..))")
//    private void fromAllUniLibraryMethods(){
//
//    }
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineTOUniLibrary(){
//
//    }
//    @Pointcut(" fromAllUniLibraryMethods() && ! returnMagazineTOUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary(){
//
//    }
//    @Before("(allMethodsExceptReturnMagazineFromUniLibrary())")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println(" beforeAllMethodsExceptReturnMagazineAdvice: log #10");
//
//    }
//







    }

































//    @Pointcut("execution (* aop.UniLibrary.get*() )")
//     private void allGetMethodsFromUniLibrary() {
//
//     }
//
//    @Pointcut("execution (* aop.UniLibrary.get*() )")
//    private void allReturnMethodsFromUniLibrary() {
//
//     }
//
//     @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary() ")
//       private void allReturnAndGetMethodsFromUniLibrary(){
//
//       }
//
//
//     @Before("allGetMethodsFromUniLibrary()")
//       public void beforeGetLoggingAdvice(){
//     System.out.println("beforeGetLoggingAdvice:writing log #1");
//    }
//
//     @Before("allReturnMethodsFromUniLibrary()")
//       public void beforeReturnLoggingAdvice(){
//           System.out.println("beforeReturnLoggingAdvice:writing log #2");
//       }
//
//     @Before("allReturnAndGetMethodsFromUniLibrary()")
//        public void beforeReturnAndGetMethods(){
//           System.out.println("beforeReturnAndGetLoggingAdvice:writing log#3 ");
//       }
//
//
//        //  @Before("execution( public void aop.UniLibrary.getBook())")
//
//         // @Before("execution( public void get*())")






