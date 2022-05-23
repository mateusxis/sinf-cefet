package mateusxis.mylist.exercise4;

import java.util.Scanner;

/**
 *
 * @author mateusxis
 */
public class Exercise4 {
    public void run () {
        Scanner myScanner = new Scanner(System.in);
        Counter counter = new Counter();
        System.out.println("Enter with up or down for counter: ");

        String type = myScanner.nextLine();

        switch(type) {
            case "up" -> {
                counter.upCounter();
            }
            case "down" -> {
                counter.downCounter();
            }
            default -> System.out.println("Invalid type");
        }
    }
}
