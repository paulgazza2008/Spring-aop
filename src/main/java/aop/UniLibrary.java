package aop;


import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary {

    @Override

    public void getBook(){

        System.out.println("we are taking a book from UniLibrary");
    }
    public void returnBook(){
        System.out.println("we are bringing back a book to UniLibrary");
    }
    public void getMagazine(){

        System.out.println("we are taking a Magazine from UniLibrary");
    }
}
