/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectgutenberg;

/**
 *
 * @author Ayba
 */
public class ProjectGutenburg {
    public static void main(String[] args) {
        // Comments are written to explain code in an easily
       // understandable way
        // Basically for single lines
       // anything after // is considered a comment
       /* 
       System.out.println("Normal code is compiled and runs ...");
        System.out.println("Comments however ... ");// do not execute!

        // Comments can be on their own line
        System.out.println("..."); // or they can share like this
*/
        // However if you put the // BEFORE a line of code
        // System.out.println("Then it is considered a comment");
        // System.out.println("and it won't execute!");

        /*     
               This is an example of a multi-line comment, which is useful if
               you want to comment out multiple lines of code quickly.
               Console.WriteLine("Java ignores everything inside the comment markers.");    
        */
        /*
        System.out.print("1 + 2 is: ");
        System.out.println(1 + 2);

        System.out.print("42001 modulus 5 is: ");
        System.out.println(42001 % 5);

        System.out.print("5565.0 divided by 22.0 is : ");
        System.out.println(5565.0 / 22.0);

        System.out.print("223 times 31 - 42: ");
        System.out.println(223 * 31 - 42);

        System.out.print("Is 4 greater than -1? ");
        System.out.println(4 > -1);

        System.out.println("\n****** Now make the computer do some harder math!");

        System.out.print("8043.52 minus 4.2 plus 23.0 divided by 56.0 times -76.13 is: ");
        System.out.println("???");

        System.out.print("11111 modulus 3 minus 67 minus 1 plus 9 is: ");
        System.out.println("???");

        System.out.print("44 minus 22 minus 11 minus 66 minus 88 minus 76 minus 11 minus 33 is : ");
        System.out.println("???");

        System.out.print("22 times 3 minus 1 plus 4 times 6 minus -9 is : ");
        System.out.println("???");

        System.out.print("Is 67 greater than 4 * 5? ");
        System.out.println("???");

        System.out.print("Is 78 less than 4 * 5? ");
        System.out.print("???");
        */
        /*
        String walrus;
        double piesEaten;
        float weightOfTeacupPig;
        int grainsOfSand;

        // But declaring them just sets up the space for data
        // to use the variable, you have to put data IN it first!
        walrus = "Sir Leroy Jenkins III";
        piesEaten = 42.1;

        System.out.println("Meet my pet walrus, " + walrus);
        System.out.print("He was a bit hungry today, and ate this many pies : ");
        System.out.println(piesEaten);
        */
        // Declare ALL THE THINGS
        // (Usually it's a good idea to declare them at the beginning of the program)
        int butterflies, beetles, bugs;

        // Now give a couple of them some values
        butterflies = 5;
        beetles = 9;

        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are " + bugs + " bugs in all.");

        System.out.println("Uh oh, my dog ate one.");
        butterflies--;
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        System.out.println("But there are still " + bugs + " bugs left...");
        System.out.println("Wait a minute!");
        System.out.println("... maybe my computer can't do math, after all!");
    
    }
    
}
