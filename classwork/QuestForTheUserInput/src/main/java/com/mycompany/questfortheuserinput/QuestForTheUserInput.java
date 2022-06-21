/*
  @author Aibek Imanov
 * *email: aybaexe@gmail.com    
 *date: 2022/06/20
 *purpose: Practice Programming #3 - Scanner
 */
package com.mycompany.questfortheuserinput;

import java.util.Scanner;

/**
 *
 * @author Ayba
 */
public class QuestForTheUserInput {
    public static void main(String[] args) {
///////////////////////////////////////////////////////////////////////////////////////////////        
        //Class Name: QuestForTheUserInput
        //Take the code below and type it into a Java class file named QuestForTheUserInput.java.
        /*
        Scanner inputReader = new Scanner(System.in);

        String yourName;
        String yourQuest;
        double velocityOfSwallow;

        // We can use the Scanner's readLine to assign value to our strings
        // because its return type is string
        System.out.println("What is your name?? ");
        yourName = inputReader.nextLine();

        System.out.println("What is your quest?! ");
        yourQuest = inputReader.nextLine();

        // When we get to our double data type, we can use Scanner's nextDouble method
        // or we can use the Double.parseDouble to convert the nextLine's String

        System.out.println("What is the airspeed velocity of an unladen swallow?!?! ");
        velocityOfSwallow = Double.parseDouble(inputReader.nextLine());
        System.out.println();
        System.out.println("How do you know " + velocityOfSwallow + " is correct, " + yourName + "?");
        System.out.println("You didn't even know if the swallow was African or European!");
        System.out.println("Maybe skip answering things about birds and instead go " + yourQuest + ".");
*/
    ///////////////////////////////////////////////////////////////////////////////////////////////
        /*
        What You Should Do
        Class Name: DontForgetToStoreIt
        Create a new class with the following code. Make it work!
        Change the code so that the appropriate input is stored in the right variable.
        When you think you've got that done, uncomment the last 2 lines in your main method to test it out.
        */
    /*    int meaningOfLifeAndEverything; // = 42;
        double pi; //= 3.14159;
        String cheese, color;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Give me pi to at least 5 decimals: ");
        pi = Double.parseDouble(inputReader.nextLine());

        // We've used Double.parseDouble but meaningOfLifeAndEverything is an INT
        // so we'll have to use Integer.parseInt

        System.out.println("What is the meaning of life, the universe & everything? ");
        meaningOfLifeAndEverything = Integer.parseInt(inputReader.nextLine());

        System.out.println("What is your favorite kind of cheese? ");
        cheese = inputReader.nextLine();

        System.out.println("Do you like the color red or blue more? ");
        color = inputReader.nextLine();

        System.out.println("Ooh, " + color + " " + cheese +" sounds delicious!");
        System.out.println("The circumference of life is " +( 2 * pi * meaningOfLifeAndEverything));
*/
    ///////////////////////////////////////////////////////////////////////////////////////////////
    /*
    Create a new class that uses user input in a conversation, with the following steps:

    Ask the user for their name.
    Display that name and tell them yours (or your AI's name!).
    Ask them for their favorite color.
    Display the color they enter in a conversational way.
    Do the same thing with favorite food and number, and then say goodbye!
    Make sure you use the right variable with the right user input!
    */
    Scanner inputReader = new Scanner(System.in);
    String name, color, fruit, num;
    int sum;
    boolean isValid = false;
       
    System.out.println("Hello there!");
    do {
        System.out.println("What's your name?");
        name = inputReader.nextLine();
        isValid = checkStrin(name);  
    }while(!isValid);
    System.out.println();
    System.out.println("Hi, "+name+"!  I'm Alice.");
    isValid = false;    
    
    do {
        System.out.println("What's your favorite color?");
        color = inputReader.nextLine();
        isValid = checkColor(color);  
    }while(!isValid);
    
    System.out.println("Huh, "+color+"? Mine's Electric Lime.");
    System.out.println();
    isValid = false;    
    
    System.out.println("I really like limes. They're my favorite fruit, too.");
    do {
        System.out.println("What's YOUR favorite fruit, " + name +" ?");
        fruit = inputReader.nextLine();
        isValid = checkFruit(fruit);  
    }while(!isValid);
    System.out.println();
    System.out.println("Really? "+fruit+"? That's wild!");
    isValid = false;    
    do {
        System.out.println("Speaking of favorites, what's your favorite number?");
        num=(inputReader.nextLine());
        isValid = checkNumber(num);  
    }while(!isValid);
    System.out.println();
    System.out.println(num + " is a cool number. Mine's -7");
    sum = Integer.parseInt(num);
    System.out.println("Did you know " + num +" * -7 is "+sum *(-7)+"?  That's a cool number too!");
    System.out.println();
    System.out.println("Well, thanks for talking to me, "+name+"!");
    
    
    }
    
    public static boolean checkStrin(String str){
        if (str == null || str.isEmpty() || str.trim().isEmpty()) 
        {
            System.out.println("String is null, empty or blank.");
            return false;
        }
        try {
            double d = Double.parseDouble(str);
            System.out.println("That was a whole number!");
            return false;
            } catch (NumberFormatException ex) {
           return true;
        }
        
        
    }
    public static boolean checkColor (String str){
        if (str == null || str.isEmpty() || str.trim().isEmpty()) 
        {
            System.out.println("Number is null, empty or blank.");
            return false;
        }
    String colors=",black,silver,gray,white,maroon,red,purple,fuchsia,green,lime,olive,yellow,navy,blue,teal,aqua, ";
    
    return colors.matches(".*,"+str.toLowerCase()+",.*");
    }
    public static boolean checkFruit (String str){
        if (str == null || str.isEmpty() || str.trim().isEmpty()) 
        {
            System.out.println("Number is null, empty or blank.");
            return false;
        }
    String fruits=",apples,pears,oranges,pawpaws,grapefruits,mandarins,limes,nectarines,apricots,peaches,plums,bananas,mangoes,strawberries,raspberries,blueberries,watermelons,rockmelons,honeydew melons,";
    return fruits.matches(".*,"+str.toLowerCase()+",.*");
    }
    public static boolean checkNumber (String str){
        
        if (str == null || str.isEmpty() || str.trim().isEmpty()) 
        {
            System.out.println("Number is null, empty or blank.");
            return false;
        }
        try {
            double d = Double.parseDouble(str);
            return true;
            } catch (NumberFormatException ex) {
                System.out.println("That not was a whole number!");
           return false;
    }
    }
}
