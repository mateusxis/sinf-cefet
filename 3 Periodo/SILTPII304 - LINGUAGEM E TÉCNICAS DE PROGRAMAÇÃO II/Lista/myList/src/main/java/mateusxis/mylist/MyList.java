package mateusxis.mylist;

import java.util.Scanner;
import mateusxis.mylist.exercise1.*;
import mateusxis.mylist.exercise2.*;

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
                default -> System.out.println("Enter number exercise available!");
            }
        }
    }
}
