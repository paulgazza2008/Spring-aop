package aop.aspect;

import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect

public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")

    public void beforeGetStudentsLoggingAdvice() {

        System.out.println("beforeGetStudentsLoggingAdvice:Logging receive" + "list students before method getStudents");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")

    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
        Student firstStudent = students.get(0);

        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Master" + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        double avgGrade = firstStudent.getAvgGrade();
        avgGrade = avgGrade+1;
        firstStudent.setAvgGrade(avgGrade);

        System.out.println(" afterGetStudentsLoggingAdvice" + "list students after work method getStudents");
            }






}


