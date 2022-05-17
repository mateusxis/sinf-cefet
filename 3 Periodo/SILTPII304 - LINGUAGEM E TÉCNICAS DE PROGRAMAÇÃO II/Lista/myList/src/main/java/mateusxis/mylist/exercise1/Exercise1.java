/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mateusxis.mylist.exercise1;

import java.util.Scanner;

/**
 *
 * @author mateusxis
 */
public class Exercise1 {
    public void run () {
        Scanner myScanner = new Scanner(System.in);
        Student student = new Student();

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
        
        System.out.println("Calculate avarage:");  
        float avarage = student.calculateAvarage();
        System.out.println("His avarage: " + avarage);

        if (student.getIsAproved()) {
            System.out.println("Student " + student.getName() + " is aproved");
        } else { 
            System.out.println("Student " + student.getName() + " isn't aproved");
        }
    }
}
