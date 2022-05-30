package mateusxis.mylist.exercise9;

import java.util.Scanner;

/**
 *
 * @author mateusxis
 */
public class Exercise9 {
    public void run() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter term A: ");
        double termA = Double.parseDouble(myScanner.nextLine());

        System.out.println("Enter term B: ");
        double termB = Double.parseDouble(myScanner.nextLine());

        System.out.println("Enter term C: ");
        double termC = Double.parseDouble(myScanner.nextLine());
        
        Bhaskara bhaskara = new Bhaskara(termA, termB, termC);

        var roots = bhaskara.calculateRoots();

        for (Double root : roots) {
            System.out.println("Root is " + root);
        }
    }
}
