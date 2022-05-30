package mateusxis.mylist.exercise11;

import java.util.Scanner;

/**
 *
 * @author mateusxis
 */
public class Exercise11 {
    public void run() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = myScanner.nextLine();

        System.out.println("Enter your birthday with formatted dd/MM/yyyy: ");
        String birthday = myScanner.nextLine();

        Person person = new Person(name, birthday);

        System.out.println("Your age is " + person.calculateAge());
    }   
}
