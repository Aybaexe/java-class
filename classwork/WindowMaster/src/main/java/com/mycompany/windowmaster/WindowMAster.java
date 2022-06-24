/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.windowmaster;

import java.util.*;



/**
 *
 * @author Ayba
 */
public class WindowMAster {
    public static void main(String[] args) {
    // declare variables for height and width
    float height;
    float width;

    /*
    // declare String variables to hold the user's height and
    // width input
    String stringHeight;
    String stringWidth;
*/
    // declare other variables
    float areaOfWindow;
    float cost;
    float perimeterOfWindow;

    /*
    // declare and initialize the Scanner
    Scanner myScanner = new Scanner(System.in);

    // get input from the user
    System.out.println("Please enter window height:");
    stringHeight = myScanner.nextLine();
    System.out.println("Please enter window width:");
    stringWidth = myScanner.nextLine();

    // convert String values of height and width to float values
    height = Float.parseFloat(stringHeight);
    width = Float.parseFloat(stringWidth);
    */
    
    
    height=readValue("Please enter window height:");
    width =readValue("Please enter window width:");
    
    // calculate the area of the window
    areaOfWindow = height * width;

    // calculate the perimeter of the window
    perimeterOfWindow = 2 * (height + width);

    // calculate the total cost - use a hard-coded value
    // for material cost
    cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));

    // display the results to the user
    System.out.println("Window height = " + height);
    System.out.println("Window width = " + width);
    System.out.println("Window area = " + areaOfWindow);
    System.out.println("Window perimeter = " + perimeterOfWindow);
    System.out.println("Total Cost =  " + cost);
        
    }
    public static float readValue(String promt){
        
        boolean isValid = false;   
        String input;
        Scanner sc = new Scanner(System.in);
        do {
        System.out.println(promt);
        isValid=checkFloat(input = sc.nextLine());
        
        }while(!isValid);
        
        float floatVal=Float.parseFloat(input);
        //Make a negative number positive
        return Math.abs(floatVal);
    }
    //check for emptiness and correct float input
    public static boolean checkFloat (String str){
        
        if (str == null || str.isEmpty() || str.trim().isEmpty()) 
        {
            System.out.println("Number is null, empty or blank.");
            return false;
        }
        try {
            float f = Float.parseFloat(str);
            return true;
            } catch (NumberFormatException ex) {
                System.out.println("That not was a whole number!");
           return false;
    }
    }
    
}
