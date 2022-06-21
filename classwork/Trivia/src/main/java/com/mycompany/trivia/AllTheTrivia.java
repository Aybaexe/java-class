
package com.mycompany.trivia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

/*
  @author Aibek Imanov
 * *email: aybaexe@gmail.com    
 *date: 2022/06/20
 *purpose: Practice Programming #3 - Scanner
 */
public class AllTheTrivia {
    public static void main(String[] args) {
        ///////////////////////////////////////////////////////////////////////////////////////////////        
        /*
        What You Should Do
        Ask the user for several pieces of trivia, but when you display them, mix up the answers.
        */
        
        //For generating Unique Random Numbers
        ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i=0; i<4; i++) {
                list.add(i);
            }
            
            Collections.shuffle(list);
            /*
            for (int i=0; i<4; i++) {
                System.out.println("Random Number= "+list.get(i));
            }*/
           
        
       
        Scanner inputReader = new Scanner(System.in);
        String[] answer = new String[4];
        
        System.out.println("What unit is equivalent to 1,024 Gigabytes?");
                answer[0] = inputReader.nextLine();
        System.out.println("Which planet is the only one that rotates clockwise in our Solar System?");
                answer[1] = inputReader.nextLine();
        System.out.println("The largest volcano ever discovered in our Solar System is located on which planet?");
                answer[2] = inputReader.nextLine();
        System.out.println("What is the most abundant element in the earth's atmosphere?");
                answer[3] = inputReader.nextLine();
        System.out.println();
        
        System.out.println("Wow, 1,024 Gigabytes is a "+answer[list.get(0)]+" !");
        System.out.println("I didn't know that the largest ever volcano was discovered on "+answer[list.get(1)]+" !");
        System.out.println("That's amazing that  "+answer[list.get(2)]+" is the most abundant element in the atmosphere...");
        System.out.println(answer[list.get(3)]+"is the only planet that rotates clockwise, neat!");
        
        
        
    }
    
}
