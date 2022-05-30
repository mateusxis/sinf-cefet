/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mateusxis.mylist.exercise10;

/**
 *
 * @author sueta
 */
public class Exercise10 {
    public void run() {
        var car1 = new Car(1, "Ferrari", "LQA9I49");
        var car2 = new Car(2, "Uno", "LTD8J10");

        System.out.println("Car " + car1.getName());
        
        car1.toRun(126, 2);
        
        System.out.println("Car has currency mileage: " + car1.getMileage());
        
        car1.toRun(162, 1);
        
        System.out.println("Car has currency mileage: " + car1.getMileage());
        
        System.out.println("Car " + car2.getName());
        
        car2.toRun(58, 1);
        
        System.out.println("Car has currency mileage: " + car2.getMileage());
        
        car2.toRun(88, 1);
        
        System.out.println("Car has currency mileage: " + car2.getMileage());
    }
}
