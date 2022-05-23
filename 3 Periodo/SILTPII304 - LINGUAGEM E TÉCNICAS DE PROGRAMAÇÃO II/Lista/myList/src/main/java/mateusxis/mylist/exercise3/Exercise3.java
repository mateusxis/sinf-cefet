package mateusxis.mylist.exercise3;

import java.util.Scanner;

/**
 *
 * @author mateusxis
 */
public class Exercise3 {
    public void run () {
        Scanner myScanner = new Scanner(System.in);
        int counter = 0;
        MaximumNumber maximunNumber = new MaximumNumber();

        do {
            System.out.println("Enter um number: ");
            maximunNumber.setMaximumNumber(myScanner.nextLine());
            counter++;
        } while (counter < 3);
        
        float maxNumber = maximunNumber.getMaximumNumber();
        
        System.out.println("The biggest number is " + maxNumber);
    }
}
