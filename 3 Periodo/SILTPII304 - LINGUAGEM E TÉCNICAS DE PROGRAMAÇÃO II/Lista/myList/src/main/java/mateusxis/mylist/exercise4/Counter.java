/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mateusxis.mylist.exercise4;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author mateusxis
 */
public class Counter {
    
    public void upCounter() {
        for (int i = 1; i < 11; i++) {
            System.out.println("Counter " + i);
        }
    }
    
    public void downCounter() {
        for (int i = 10; i > 0; i--) {
            System.out.println("Counter " + i);
        }
    } 
}
