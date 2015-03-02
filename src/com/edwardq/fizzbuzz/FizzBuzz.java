/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edwardq.fizzbuzz;

import java.util.Scanner;

/**
 * This Class is for the FizzBuzz Function Program.
 *
 * @author Edward Quixote
 * Created on 28th March 2015
 * At 08:19PM
 */
public class FizzBuzz {
    
    private Scanner scnUserInput;
    
    private int i35;
    private int iNumber;
    
    private String sQ1;
    private String sQ2;
    private String sFizzBuzz;
    
    public static void main(String[] args) {
        
        FizzBuzz clsFizzBuzz = new FizzBuzz();
        String sResult1 = clsFizzBuzz.codeForFizzBuzz();
        if (sResult1.equals("Fizz") || sResult1.equals("FizzBuzz")) {
         
            clsFizzBuzz.codeForThreeFive();
            
            System.exit(0);
        } else {
            
            System.out.println("You didn't qualify! Goodbye!");
            
            System.exit(0);
            
        }
        
    }
    
    /**
     * This Method returns:
     * Fizz, Buzz or FizzBuzz depending on a specified parameter.
     * 
     * In this case, if the user doesn't wanna tell Jarvis Quixote his/her name,
     * Buzz is returned and vice versa.
     * If the user doesn't even follow instructions at all,
     * FizzBuzz is returned.
     * 
     * @return sFizzBuzz(String)
     */
    private String codeForFizzBuzz() {
        
        scnUserInput = new Scanner(System.in);
        
        System.out.println("Hi there,");
        System.out.println("My name is Jarvis Quixote.");
        System.out.println("Edward Quixote is my papa.");
        System.out.println("Do you wanna tell me your name? (y/n):");
        
        sQ1 = scnUserInput.next();
        if (sQ1.equalsIgnoreCase("n") || sQ1.equalsIgnoreCase("N")) {
            
            sFizzBuzz = "Buzz";
            
            System.out.println("GoodBye");
            
            return sFizzBuzz;
            
        } else if (sQ1.equalsIgnoreCase("y") || sQ1.equalsIgnoreCase("Y")) {
            
            sFizzBuzz = "Fizz";
            
            System.out.println("Thank You. See you another time.");
            
            return sFizzBuzz;
            
        } else {
            
            sFizzBuzz = "FizzBuzz";
            
            System.out.println("I'm amazed you can't follow easy instructions. Goodbye!");
            
            return sFizzBuzz;
        }
        
    }
    
    /**
     * This method is more complex than the one for FizzBuzz(I assume).
     * It should return:
     * a number divisible by 3,
     * a number divisible by 5
     * OR
     * a number divisible by both 3 and 5 respectively.
     * If the number is not divisible by 3 or 5,
     * then this method should return the number itself.
     * 
     * @return i35(integer)
     */
    private int codeForThreeFive() {
        
        System.out.println("Hi there,");
        System.out.println("So, what's your lucky number?");
        
        sQ2 = scnUserInput.next();
        
        iNumber = Integer.parseInt(sQ2);
        if (sQ2.isEmpty() == true) {
            System.out.println("You didn't answer the Question! Goodbye!");
            
            System.exit(0);
            
            i35 = 0;
            return i35;
        } else if ((iNumber % 3) == 0) {
            
            i35 = 3;
            
            System.out.println("Lucky! Your number is divisible by 3!");
            
            return i35;
        } else if ((iNumber % 5) == 0) {
            
            i35 = 5;
            
            System.out.println("Your number is divisible by 5");
            
            return i35;
        } else if (((iNumber % 5) == 0) && (iNumber % 3) == 0) {
            
            i35 = 35;
            
            System.out.println("Your number is divisible by both 3 & 5!");
            
            return i35;
        } else {
            
            System.out.println("Too bad - Your number is not divisible by 3 or 5!");
            
            i35 = 0;
            
            return i35;
        }
       
    }
    
}
