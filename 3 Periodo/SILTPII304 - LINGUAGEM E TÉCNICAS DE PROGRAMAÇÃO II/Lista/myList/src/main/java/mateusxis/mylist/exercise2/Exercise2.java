package mateusxis.mylist.exercise2;

import java.util.Scanner;

/**
 *
 * @author mateusxis
 */
public class Exercise2 {
    public void run () {
        Scanner myScanner = new Scanner(System.in);
        StudentCollage student = new StudentCollage();

        System.out.println("Enter name student: ");
        student.setName(myScanner.nextLine());
        
        System.out.println("Enter registration student: ");
        student.setRegistration(myScanner.nextLine());
        
        do {
            System.out.println("Enter note of test one: ");
            student.setNoteOne(myScanner.nextLine());
        } while (student.getNoteOne() == -1f);
        
        do {
            System.out.println("Enter note of test two: ");
            student.setNoteTwo(myScanner.nextLine());
        } while (student.getNoteTwo() == -1f);
        
        System.out.println("Calculate average partial:");  
        float averagePartial = student.calculateAveragePartial();
        System.out.println("His average partial: " + averagePartial);

        if (student.getIsApproved()) {
            System.out.println("Student " + student.getName() + " is approved");
        } else if (student.needTestFinal()){ 
            do {
                System.out.println("Enter note of test final: ");
                student.setNoteFinal(myScanner.nextLine());
            } while (student.getNoteFinal() == -1f);

            System.out.println("Calculate average partial:");  
            float averageFinal = student.calculateAverageFinal();
            System.out.println("His average final: " + averageFinal);

            if (student.getIsApproved()) {
                System.out.println("Student " + student.getName() + " is approved");
            } else {
                System.out.println("Student " + student.getName() + " isn't approved");
            }
        } else {
            System.out.println("Student " + student.getName() + " isn't approved");
        }
    }
}
