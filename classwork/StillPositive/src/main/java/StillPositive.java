
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
public class StillPositive {

    public static void main(String[] args) {
////////////////////////////////////////////////////////////////////////////////
//Write a program that prints out all positive numbers 
/*
        int[] numbers = { 389, -447, 26, -485, 712, -884, 94, -64, 868, -776, 227, -744, 422, -109, 259, -500, 278, -219, 799, -311};
        System.out.println("Gotta stay positive ...!");
        for(int num : numbers){
        if(num>0){
            System.out.print(num+" ");
        }
        
        }
         */
////////////////////////////////////////////////////////////////////////////////
//Combine the following 2 arrays into one large array. Then print out the whole new array.
        /*
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49}; // 12 numbers
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100}; // also 12!
        int[] wholeNumbers = new int[24];
        int j=0;
        
        // Combining code should go here!
       //ver 1
        // for(int i=0; i<firstHalf.length;i++){
        //    wholeNumbers[j]=firstHalf[i];
        //    j=j+1;
        //    wholeNumbers[j]=secondHalf[i];
        //    j=j+1;
            
        //}
       
        //ver2
       for(int i=0; i<firstHalf.length;i++){
            wholeNumbers[i]=firstHalf[i];            
        }
       
       for(int i=0; i<secondHalf.length;i++){
            wholeNumbers[i+secondHalf.length]=secondHalf[i];            
        }
        // Printing code should go here
        for(int num : wholeNumbers){
            System.out.print(num+" ");
        }
         */
////////////////////////////////////////////////////////////////////////////////
//Fruit Salad
/*
According to your research, the best kind of fruit salad has:

As many berries as possible
No more than three kinds of apples
No more than two kinds of orange
Definitely no tomatoes
No more than twelve kinds of fruit
         */
/*
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato",
            "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry",
            "Navel Orange", "Pink Pearl Apple", "Raspberry", "Blood Orange", "Sungold Tomato",
            "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple",
            "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad;
        int apple = 0, orange = 0, count = 0;
        fruitSalad = new String[12];

        // Code Recipe for fruit salad should go here!
        for (int i = 0; i < fruit.length; i++) {
            if (!fruit[i].matches(".*Tomato.*") && count < fruitSalad.length) {
                if (fruit[i].matches(".*Apple.*") && apple < 3) {
                    fruitSalad[count] = fruit[i];
                    count++;
                    apple++;
                } else if (fruit[i].matches(".*Orange.*") && orange < 2) {
                    fruitSalad[count] = fruit[i];
                    count++;
                    orange++;
                } else {
                    fruitSalad[count] = fruit[i];
                    count++;
                }

            }
        }
        System.out.println("Total: "+ fruitSalad.length);
        System.out.println("Apple: "+ apple);
        System.out.println("Orange: "+ orange);
        System.out.println("berries : "+ (fruitSalad.length - apple - orange)+"\n");
        for(String fru : fruitSalad){
            System.out.println(fru+" ");
        }
        */
////////////////////////////////////////////////////////////////////////////////
//Hidden Nuts
/*
Using the code snippet below as a base, iterate through the hiding spaces and find out where the squirrel put his nut and print it to the screen.
*/
        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");

        // Nut finding code should go here!
        for(int i=0; i<hidingSpots.length;i++){
         if (hidingSpots[i] != null){
              System.out.println("Found it! It's in spot# "+i);
        } 
        }
        
    }

}
