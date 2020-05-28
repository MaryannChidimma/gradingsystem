/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gradingsystem;

import java.util.Scanner;

/**
 *
 * @author 840g3
 */
public class GradingSystem {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Enter a Score to see you grade");
      int score = input.nextInt();
     
      if(score >=70){
          System.out.println("your grade is A");
      }
      
      else if( score >= 60 && score < 70){
        System.out.println("your grade is B");
      }  
    else if( score >=50 && score < 60){
        System.out.println("your grade is C");
      } 
     else if( score >= 45 && score < 50){
        System.out.println("your grade is D");
      }  
    
      else if( score >= 40 && score < 45){
        System.out.println("your grade is E");
      }  
      if(score <40){
          System.out.println("your grade is F");
       
    }
    
    
}
