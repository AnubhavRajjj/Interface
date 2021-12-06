package Library__System;

import java.util.Objects;
import java.util.Scanner;

interface Adults{
    void RegisterAnAccount();
}
interface Kids{
    void RegisterAnAccount();
}
public class User implements Adults,Kids{
    int age;
    User(){
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
    }
    public void RegisterAnAccount(){
        if(age<12){
            System.out.println("Congrats,You are registered as a kids" + " , "+"You can borrow the books only for 10 days from the date of issue" );

        }
        else{
            System.out.println("Congrats,You are registered as an Adult" + " , "+"You can borrow the books only for 7 days from the date of issue" );
        }
    }
}
interface LibraryUser{
    void registerAccount();
    void requestBook();
}
class KidUsers implements LibraryUser{
    int age;
    String bookType;

    KidUsers(){
        Scanner a = new Scanner(System.in);
        age=a.nextInt();
        bookType=a.next();
    }
    public void registerAccount(){
        if(age<12){
            System.out.println( "You have successfully registered under a Kids Account");
        }
      else{
            System.out.println( "Sorry, Age must be less than 12 to register as a kid");
        }
    }
    public void requestBook(){
        if(Objects.equals(bookType, "Kids")){
            System.out.println( "Book Issued successfully, please return the book within 10 days");
        }
        else{
            System.out.println( "Oops, you are allowed to take only kids books");
        }

    }
}
class AdultUsers implements LibraryUser{
    int age;
    String bookType;
    AdultUsers(){
        Scanner b = new Scanner(System.in);
        age=b.nextInt();
        bookType=b.next();
    }
    public void registerAccount(){
        if(age>12){
            System.out.println("You have successfully registered under an Adult Account");
        }
        else{
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }

    }
    public void requestBook(){
        if(Objects.equals(bookType, "Fiction")){
            System.out.println("Book Issued Successfully");
        }
        else{
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }

    }
}
class LibraryInterfaceDemo{
    public static void main(String[] args) {
        User obj=new User();
        obj.RegisterAnAccount();
        KidUsers obj1=new KidUsers();
        obj1.registerAccount();
        obj1.requestBook();
        AdultUsers obj2=new AdultUsers();
        obj2.registerAccount();
        obj2.requestBook();


    }


}

