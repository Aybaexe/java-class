
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayba
 */
public class ExeMethods {
   
////////////////////////////////////////////////////////////////////////////////
// After making sure it works, add the second method call needed to print out the rest of the code.
    /*
    public static void main(String[] args) {
        eatMe();
        drinkMe();
        System.out.println("\n - Lewis Carroll, Alice in Wonderland");
    }
    
    static void eatMe(){
        System.out.println(" 'But I don’t want to go among mad people,' Alice remarked.");
        System.out.println(" 'Oh, you can’t help that,' said the Cat.");
        System.out.print(" 'We’re all mad here. I’m mad. You’re mad.'");
    }

    static void drinkMe(){
        System.out.println(" 'How do you know I’m mad?' said Alice.");
        System.out.println(" 'You must be,' said the Cat, 'or you wouldn’t have come here.' ");
    }
*/
////////////////////////////////////////////////////////////////////////////////
//Return To Sender Fix the type definitions to match the return types of the called methods.
   /*
    public static void main(String[] args) {

        char aMystery = mystery();
        String totallyUnexpected = unexpected();
        double aSurprise = surprise();
        boolean itsClassified = classified();
        int aSecret = secret();

        System.out.println("The methods have returned! Their results...\n");
        System.out.println("Mysterious: " + aMystery);
        System.out.println("    Secret: " + aSecret);
        System.out.println("Surprising: " + aSurprise);
        System.out.println("Classified: " + itsClassified);
        System.out.println("Unexpected: " + totallyUnexpected);

    }

    public static int secret(){
        return 42;
    }

    public static double surprise(){
        return 3.14;
    }

    public static char mystery(){
        return 'X';
    }

    public static boolean classified(){
        return true;
    }

    public static String unexpected(){
        return "Spanish Inquisition";
    }
*/
////////////////////////////////////////////////////////////////////////////////
//Match Work Fix the method calls by changing the ??? to the correct number of literal values.
    /*
    public static void main(String[] args) {

        System.out.println(" The word Cart should come before Horse alphabetically : " + comesBefore("Com", "Compare"));
        System.out.println(" Half of 42 = " + halfOf(42.0d));
        System.out.println(" (short) Pi = " + pi());
        System.out.println(" The first letter of the word Llama is: " + firstLetter("Letter"));
        System.out.println(" 1337 x 1337 = " + times1337(1337));

    }

    public static double pi(){
        return 3.14;
    }

    public static int times1337(int x){
        return x * 1337;
    }

    public static double halfOf(double y){
        return y / 2;
    }

    public static String firstLetter(String word){
        return word.substring(0, 1);
    }

    public static boolean comesBefore(String a, String b){
        return a.compareToIgnoreCase(b) < 0;
    }
*/
////////////////////////////////////////////////////////////////////////////////
//Barely Controlled Chaos
    
    public static void main(String[] args) {

        String color = returnColor(); // call color method here
        String animal = returnAnimal(); // call animal method again here
        String colorAgain = returnColor(); // call color method again here
        int weight = returnNum(5, 200); // call number method,
            // with a range between 5 - 200
        int distance = returnNum(10, 20); // call number method,
            // with a range between 10 - 20
        int number = returnNum(1000, 2000); // call number method,
            // with a range between 10000 - 20000
        int time = returnNum(2, 6); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");

        
    }
    // returnColor Method returning a random color from an array colors
    public static String returnColor(){
        Random rng = new Random();
        String [] colors ={"black","silver","gray","white","maroon","red","purple","fuchsia","green","lime","olive","yellow","navy","blue","teal","aqua"};
        int randomNumber = rng.nextInt(colors.length);
        return colors[randomNumber];
    }
    
    // returnAnimal Method returning a random color from an array animals
    public static String returnAnimal(){
        Random rng = new Random();
        String [] animals ={"cat","chicken","cow","dog","elephant","fish","fox","horse"};
        int randomNumber = rng.nextInt(animals.length);
        return animals[randomNumber];
    }
    // ??? Method 3 ???
    public static int returnNum(int min, int max){
        Random rng = new Random();
        int x= rng.nextInt(max+1) + min;
        return x;
    }
}   

