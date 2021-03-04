package aop;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {

        Student st1 = new Student("Paul Kafumbe", 4, 8.8);

        Student st2 = new Student("Ricky  Zulu", 1, 6.8);

        Student st3 = new Student("John Banda ", 3, 9.8);


        students.add(st1);

        students.add(st2);

        students.add(st3);
    }

        public List<Student> getStudents(){

            System.out.println("start working method getStudents");
          //  System.out.println(students.get(4));


            System.out.println("start of method getStudents");

            //System.out.println(students.get(3));

            System.out.println("Information from Method  getStudents:");

            System.out.println(students);
            return students;
        }



    }

