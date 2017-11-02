/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysavings;

/**
 *
 * @author EvMcQ5970
 */
public class PiggyBank {
    
    int choice;
    double balance = 0;
    double withdraw;
    
    
    /**
     * Returns the balance
     * Pre: N/A
     * Post: balance returned
    */
    public double getBalance(){
        
        return balance;
    }
    
    /**
     * Receives a number and adds it to balance
     * Pre: double passed
     * Post: passed variable added to balance
     * @param d 
     */
    
    public void deposit(double d){
        
        balance += d;
        
    }
    
    
    /**
     * Receives a number and subtracts it from balance
     * Pre: double passed
     * Post: passed variable subtracted from balance
     * @param d 
     */
    public void withdraw(double d){
        
        balance -= d;
        
    }
    
    
}
