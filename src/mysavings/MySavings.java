/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysavings;

import java.util.Scanner;

/**
 *
 * @author EvMcQ5970
 */
public class MySavings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        PiggyBank bank = new PiggyBank();
        
        System.out.println("1. Show total in bank.");
        System.out.println("2. Add a penny.");
        System.out.println("3. Add a nickel.");
        System.out.println("4. Add a dime.");
        System.out.println("5. Add a quarter.");
        System.out.println("6. Take money out of bank.");
        System.out.println("Enter 0 to quit");
        System.out.println("Enter your choice: ");
        
        
        //What's this? An infinite loop? Not quite
        while (true){
            
            int c = input.nextInt();
            
            if (c == 0){
                //They want to quit, so get outta there
                break;
                
            }
            
            if (c == 1){
            //Show their paltry savings
            double b = bank.getBalance();
            System.out.println("Your balance is: " + b);
            
        } else if (c == 2){
            
            bank.deposit(0.01);
            
        } else if (c == 3){
            
            bank.deposit(0.05);
            
        } else if (c == 4){
            
            bank.deposit(0.10);
            
        } else if (c == 5){
            
            bank.deposit(0.25);
            
        } else if (c == 6){
            //Don't spend it all in one place
            System.out.println("How much?: ");
            
            double w = input.nextDouble();
            
            bank.withdraw(w);
            
        }
            
        }
        
        
        
    
        
    }
    
}
