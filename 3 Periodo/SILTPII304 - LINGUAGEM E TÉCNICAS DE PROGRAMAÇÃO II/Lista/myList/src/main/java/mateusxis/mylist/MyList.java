package mateusxis.mylist;

import java.util.Scanner;
import mateusxis.mylist.exercise1.*;
import mateusxis.mylist.exercise2.*;
import mateusxis.mylist.exercise3.*;
import mateusxis.mylist.exercise4.*;
import mateusxis.mylist.exercise5.*;
import mateusxis.mylist.exercise9.*;
import mateusxis.mylist.exercise10.*;
import mateusxis.mylist.exercise11.*;

/**
 *
 * @author mateusxis
 */
public class MyList {

    public static void main(String[] args) {
        String numberExercise = "";
        Scanner myScanner = new Scanner(System.in);
        
        while (!"0".equals(numberExercise)) {
            System.out.println("Enter number exercise: If you want exit, press 0.");
            numberExercise = myScanner.nextLine();
            System.out.println("Exercise " + numberExercise + " started!");
            
            switch(numberExercise) {
                case "1" -> { 
                    Exercise1 exercise1 = new Exercise1();
                    exercise1.run();
                }
                case "2" -> {
                    Exercise2 exercise2 = new Exercise2();
                    exercise2.run();
                }
                case "3" -> {
                    Exercise3 exercise3 = new Exercise3();
                    exercise3.run();
                }
                case "4" -> {
                    Exercise4 exercise4 = new Exercise4();
                    exercise4.run();
                }
                case "5", "6", "7", "8" -> {
                    Exercise5 exercise5 = new Exercise5();
                    exercise5.run();
                }
                case "9" -> {
                    Exercise9 exercise9 = new Exercise9();
                    exercise9.run();
                }
                case "10" -> {
                    Exercise10 exercise10 = new Exercise10();
                    exercise10.run();
                }
                case "11" -> {
                    Exercise11 exercise11 = new Exercise11();
                    exercise11.run();
                }
                default -> System.out.println("Enter number exercise available!");
            }
        }
    }
}
