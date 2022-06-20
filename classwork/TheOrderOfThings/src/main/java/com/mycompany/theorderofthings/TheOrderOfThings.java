/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.theorderofthings;

/**
 *
 * @author Ayba
 */
public class TheOrderOfThings {
    public static void main(String[] args) {
        /*
        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;

        number = 5.0;
        opinion = "AWESOME";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        color = "yellow";
        origin = "Martian";
        material = "platinum";
        purpose = "good";

        noun = "dragons";

        // Using the + with strings doesn't add -- it concatenates! (sticks them together)
        System.out.println(number + " " + opinion + " " + size + " " + age + " " + shape
                 + " " + color + " " + origin + " " + material + " " + purpose + " " + noun);
*/
        
        String fname, name, food, whetherHome, origin, material, purpose;
        int numPets=5;
        boolean whistle;
        fname = "Ada";
        name = "Lovelace";
        food = "buttered gnocchi";
        whetherHome = "a pineapple under the sea";
        whistle =true;
               
        System.out.println("My name is " + fname + " " + name + ".");
        System.out.println("My favorite food is " + food+ ".");
        System.out.println("I have " + numPets + "pets.");
        System.out.println("I live in " +whetherHome+", and I love it here.");
        System.out.println("It is " + whistle + "I know how to whistle.");
    }
    
}
