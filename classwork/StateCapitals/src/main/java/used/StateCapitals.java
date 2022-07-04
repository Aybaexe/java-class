/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package used;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Ayba
 */
public class StateCapitals {
    public static void main(String[] args) {
        Map<String, String> stateCapitals = new HashMap<>();
        stateCapitals.put("Alabama", "Montgomery");
        stateCapitals.put("Alaska", "Juneau");
        stateCapitals.put("Arizona", "Phoenix");
        stateCapitals.put("Arkansas", "Little Rock");
        stateCapitals.put("California", "Sacramento");
        System.out.println("STATES: \n ============== ");
        Set<String> keys = stateCapitals.keySet();
        for(String currentKey : keys){
            System.out.println(currentKey);
        }
        System.out.println("... \n ... ");
        System.out.println("STATE/CAPITAL PAIRS: \n ============== ");
        for(String currentKey : keys){
            String currentCapitals = stateCapitals.get(currentKey);
            System.out.println(currentKey+" - "+currentCapitals);
        }
    }
    
}
