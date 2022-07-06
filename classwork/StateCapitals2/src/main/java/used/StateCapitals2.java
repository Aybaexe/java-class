/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package used;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import src.UserIO;
import src.UserIOImpl;

/**
 *
 * @author Ayba
 */
public class StateCapitals2 {

    public static void main(String[] args) throws Exception {
        Map<String, String> stateCapitals = new HashMap<>();
        Random r = new Random();

        //read file
        Scanner sc = new Scanner(new BufferedReader(new FileReader("StateCapitals.txt")));

        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            // System.out.println(currentLine);
            //part[0] -key part[1]=value
            String[] parts = currentLine.split("::");
            stateCapitals.put(parts[0], parts[1]);

        }

        System.out.println(stateCapitals.size() + " STATES & CAPITALS ARE LOADED. \n=============================================");
        /*
        System.out.println("All the state names \n");
        Set<String> keys = stateCapitals.keySet();
        for (String currentKey : keys) {
            System.out.println(currentKey);
        }
         */
        while (true) {
            Scanner inputReader = new Scanner(System.in);
            int choice = choiseMenu();
            switch (choice) {

                case 1:
                    String capitalGues;
                    /*for values 
                    //Object[] values = stateCapitals.values().toArray();
                    // String randomValue =(String) values[r.nextInt(values.length)];
                    //System.out.println(randomValue);
                     */
                    //for key
                    Object[] allKeys = stateCapitals.keySet().toArray();
                    Object key = allKeys[r.nextInt(allKeys.length)];
                    boolean isValid = true;
                    while (isValid) {
                        System.out.println("READY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPITAL OF ' " + key + "'?");
                        capitalGues = inputReader.nextLine();
                        if (capitalGues.toLowerCase().equals(stateCapitals.get(key).toLowerCase())) {
                            System.out.println("NICE WORK!  " + capitalGues + " IS CORRECT!");
                            isValid = false;
                        } else {
                            System.out.println(" Try again ");
                        }
                    }

                    break;
                case 2:
                    int score = 0;
                    String capitalGues2;
                    UserIO userIO = new UserIOImpl();
                    Map<String, String> stateCapitalsRandom = new HashMap<>();
                    //Object[] allKeys2 = stateCapitals.keySet().toArray();
                    List<String> allKeys2 = new ArrayList<String>(stateCapitals.keySet());

                    System.out.println(" How many times do you want to guess");
                    int i = 0,
                     t = userIO.readInt("Enter a number between! 1-" + stateCapitals.size() + " : ", 0, stateCapitals.size());

                    while (i < t) {
                        //get random value with list
                        String key2 = allKeys2.get(r.nextInt(allKeys2.size()));
                        stateCapitalsRandom.put(key2, stateCapitals.get(key2));
                        //remove this value with list
                        allKeys2.remove(key2);
                        i++;
                    }
                    Set<String> keys = stateCapitalsRandom.keySet();

                    /* // print hashmap
                    for (String currentKey : keys) {
                        String currentCapital = stateCapitalsRandom.get(currentKey);
                        System.out.println("The state  " + currentKey + " - " + currentCapital);
                    }
                     */
                    System.out.println("HERE ARE THE STATES :");
                    boolean isValid2 = true;

                    for (String currentKey : keys) {
                        String currentCapital = stateCapitalsRandom.get(currentKey);
                        System.out.print(currentKey + " , ");
                    }
                    System.out.println("...");

                    for (String currentKey2 : keys) {
                        isValid2 = true;
                        String currentCapital = stateCapitalsRandom.get(currentKey2);
                        System.out.println("READY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPITAL OF ' " + currentKey2 + "'?");
                        do {

                            capitalGues2 = inputReader.nextLine();
                            if (capitalGues2.toLowerCase().equals(currentCapital.toLowerCase())) {
                                System.out.println("NICE WORK! " + capitalGues2 + " IS CORRECT!");
                                score++;
                                isValid2 = false;
                            } else {
                                System.out.println(" Try again ");
                                score--;
                                
                            }
                        } while (isValid2);

                    }
                    System.out.println("Your total score: "+ score);
                    break;
                case 3:
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Thank you very much for using our game and have a good day");
                    //for pause
                    scan.nextLine();
                    ;
                    System.exit(0);
            }
        }
    }

    public static int choiseMenu() {
        int choise = 0;
        UserIO userIO = new UserIOImpl();
        while (choise < 1 || choise > 3) {
            System.out.println("--------------------------------");
            System.out.println("welcome to game guess capital of state \n");
            System.out.println("Make your choice from this menu");
            System.out.println("1. Small knowledge game");
            System.out.println("2. Stretch goal");
            System.out.println("3. For exit");

            choise = userIO.readInt("Enter a number between! 1-3 : ", 0, 3);
        }
        return choise;
    }
}
