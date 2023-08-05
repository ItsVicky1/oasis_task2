package com.osis.intership;

import java.util.Random;
import java.util.Scanner;

/**
 * @author VIKAS
 *
 */
public class GuessNum {                      // this method for the logic
 
	int d=0;
       public void logic() {
    	   
    	int c;
   		int i;
   		
   		Random obj2=new Random();
   		int rand =obj2.nextInt(100);
   		Scanner obj=new Scanner(System.in);
   		 msg();
   		 System.out.println(rand);
    		for(c=1;c<=5;c++) {
    			
    			System.out.println("Enter the gusses number");
    			int a=obj.nextInt();
    			d++;
    		
    			if(rand==a)
    			{
    				System.out.println("You win..... ");
    				System.out.println("you got more 5 chance ");
    				c=1;
    				
    			}else if(rand<a){
    				
    				System.out.println("Enter a lowest number ");
    				
    			}else {
    				
    				System.out.println("Enter a highest number ");
    			
    				
    			}
    	   }
    			System.out.println("you loss ");
       }
       
       
       
       public void score() {                   // this method for the Score
    	   
    	   if(d>=1 && d<=3) {
   			System.out.println("your score is 20");
   		}else if(d>=4 && d<=6) {
   			
   			System.out.println("your score is 40");
   		}else if(d>=7 && d<=9) {
   			
   			System.out.println("your score is 60");
   		}else if(d>=10 && d<=12) {
   			
   			System.out.println("your score is 80");
   		}else {
   			
   			System.out.println("your score is 100");
   		}
    	   
       }
       
       public void msg() {                  // this method for the massage print
   		System.out.println("Welcome to guess number game........");
   		System.out.println("you have 5 chance to guesses the number .....");
   		System.out.println("if you win then you got more 5 chance...... ");
   	}
}
