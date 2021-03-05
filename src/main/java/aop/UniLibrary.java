package aop;


import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary {


    public void getBook() {

        System.out.println("we are taking a book from the UniLibrary ");
        System.out.println("-----------------------------------------");
    }

    public String returnBook() {
        System.out.println("we are bringing back a book to the UniLibrary");
        return "War and Peace";

    }

    public void getMagazine() {

        System.out.println("we are taking a Magazine from the UniLibrary");
        System.out.println("-----------------------------------------");
    }

    public void returnMagazine() {

        System.out.println("we are bringing back a Magazine to the UniLibrary");
        System.out.println("-----------------------------------------");
    }
    public void addBook(String person_name,Book book) {

        System.out.println("we are adding a book in the UniLibrary ");
        System.out.println("-----------------------------------------");
    }
    public void addMagazine() {

        System.out.println("we are adding a Magazine in the UniLibrary ");
        System.out.println("-----------------------------------------");
    }
}
