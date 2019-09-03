package com.virtusa.interview.test;

import java.util.Scanner;

import com.virtusa.interview.test.tool.NumberToWord;
import com.virtusa.interview.test.tool.exception.NotaNumberException;

public class Application {

	public static void main(String[] args) {
        NumberToWord obj = new NumberToWord();      
        start(obj);        
    }
	
	public static void start(NumberToWord obj) {
		String exit = "N";
        
        do {        	
        	System.out.println("Enter Y to Exit: or any other numeric/character to continue: ");
        	Scanner un = new Scanner(System.in);
        	String enteredValue = un.next(); 
        	
        	if("Y".equalsIgnoreCase(enteredValue)) {
        		exit = "Y";
         	} else {
         		System.out.println("Enter number to convert : " );
         		//Scanner scan = new Scanner(System.in);
         		String val = un.next();
         		
         		try {         			
         			System.out.println("Converted number in to word is: " + obj.convert(val));                			
         		} catch(NotaNumberException ne ) {
         			System.out.println("Please enter numbers only. Entered number is not a numeric");
         		}       		         		        
         	}
        	
        } while(!("Y".equalsIgnoreCase(exit)));
	}
	
	
}
