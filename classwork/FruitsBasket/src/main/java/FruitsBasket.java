/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayba
 */
public class FruitsBasket {
    
    public static void main(String[] args) {
    
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
            "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
            "Dragonfruit", "Apple", "Orange", "Orange"};

        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;

        // Fruit counting code goes here!
       for(String fruit : fruitBasket){
           if(fruit=="Orange" ){
               numOranges++;
           }
           else if (fruit=="Apple" ){
               numApples++;}
           else
               numOtherFruit++;
           
       }
        // Print The Results!
        System.out.println("\nTotal# of Fruit in Basket: "+fruitBasket.length+"\n Oranges- "+ numOranges + "\n Apples- "+ numApples+ "\n Other fruits- "+ numOtherFruit);
    }
        
}
