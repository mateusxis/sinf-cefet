package mateusxis.mylist.exercise5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mateusxis
 */
public class DiscoverNumber {
    private int chosenNumber;
    private int counter = 0;
    private int entryNumber = 0;
    
    public int getChosenNumber() {
        return this.chosenNumber;
    }
    
    private void randomNumber() {
        Random rand = new Random();
        this.chosenNumber = rand.nextInt(101);
    }
    
    public int getCounter() {
        return this.counter;
    }
    
    public void setCounter(int _counter) {
        this.counter = _counter;
    }
    
    public int getEntryNumber() {
        return this.entryNumber;
    }
    
    public void setEntryNumber(String _entryNumberInput) {
        int _entryNumber = Integer.parseInt(_entryNumberInput);  
        if (_entryNumber >= 0 && _entryNumber <= 100) {
            this.entryNumber = _entryNumber;
        } else {
            System.out.println("Enter number for 0 to 100");
        }
    }
    
    public void discoveryNumber() {
        this.randomNumber();
        Scanner myScanner = new Scanner(System.in);
        
        do {
            System.out.println("Enter um number: ");
            this.setEntryNumber(myScanner.nextLine());
            int _counter = this.getCounter();
            this.setCounter(_counter + 1);
            
            if (this.getEntryNumber() > this.getChosenNumber()) {
                System.out.println("Entry number is greater than mystery number");
            } else {
                System.out.println("Entry number is less than mystery number");
            }
        } while (this.getEntryNumber() != this.getChosenNumber());

        if (this.getCounter() == 1) {
            System.out.println("You are excellent! Made a kick!");
        } else if (this.getCounter() < 11) {
            System.out.println("You are good! Made " + this.getCounter() + " kicks!");
        } else if (this.getCounter() < 20) {
            System.out.println("You didn't do so well! Made " + this.getCounter() + " kicks!");
        } else {
            System.out.println("You need to practice! Made " + this.getCounter() + " kicks!");
        }
    }
}
