/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package used;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collection;
import src.Capital;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Ayba
 */
public class StateCapitalsApp {

    public static void main(String[] args) throws Exception {
        Map<String, Capital> map = new HashMap<>();
        Scanner sc = new Scanner(new BufferedReader(new FileReader("MoreStateCapitals.txt")));
        

        while (sc.hasNextLine()) {
            Capital cl = new Capital();
            String currentLine = sc.nextLine();
            // System.out.println(currentLine);
            //part[0] -key part[1]=value
            String[] parts = currentLine.split("::");
            cl.setName(parts[1]);
            cl.setPopulation(Integer.parseInt(parts[2]));
            cl.setSquareMile(Double.parseDouble(parts[3]));

            map.put(parts[0], cl);

        }
        /*
        //get values
        Collection<Capital> capitalValues = map.values();
        for(Capital currentPopulation : capitalValues){
            System.out.println(currentPopulation.getName()+" | Pop: "+currentPopulation.getPopulation()+" | Area: "+currentPopulation.getSquareMile()+ " sq mi");
            
        }
         */
        System.out.println(map.size() + " STATES & CAPITALS ARE LOADED. \n=============================================");

        System.out.println("All the state names \n");
        Set<String> keys = map.keySet();
        for (String currentKey : keys) {
            System.out.println(currentKey + " - " + map.get(currentKey).getName() + " | Pop: " + map.get(currentKey).getPopulation() + " | Area: " + map.get(currentKey).getSquareMile() + " sq mi");
        }
        System.out.println("... \n...\n");

        System.out.println("Please enter the lower limit for capital city population:");
        Scanner inputReader = new Scanner(System.in);
        int valueUser = Integer.parseInt(inputReader.nextLine());
        System.out.println("LISTING CAPITALS WITH POPULATIONS GREATER THAN " + valueUser);
        for (String currentKey : keys) {
            if (valueUser < map.get(currentKey).getPopulation()) {
                System.out.println(currentKey + " - " + map.get(currentKey).getName() + " | Pop: " + map.get(currentKey).getPopulation() + " | Area: " + map.get(currentKey).getSquareMile() + " sq mi");
            }
        }
        System.out.println("... \n...\n");
        System.out.println("Please enter the upper limit for capital city sq mileage:");
        double valueUserD = Double.parseDouble(inputReader.nextLine());
        System.out.println("LISTING CAPITALS WITH AREAS LESS THAN  " + valueUserD+":\n \n");
        
        for (String currentKey : keys) {
            if (valueUserD > map.get(currentKey).getSquareMile()) {
                System.out.println(currentKey + " - " + map.get(currentKey).getName() + " | Pop: " + map.get(currentKey).getPopulation() + " | Area: " + map.get(currentKey).getSquareMile() + " sq mi");
            }
        }
        
    }
}
