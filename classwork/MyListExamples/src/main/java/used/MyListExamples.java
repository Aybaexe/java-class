/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package used;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Ayba
 */
public class MyListExamples {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        
       // System.out.println("List size: "+ stringList.size());
        stringList.add("The first string.");
        System.out.println("List size: "+ stringList.size());
        stringList.add("The second string.");
        stringList.add("The third string.");
        stringList.add("The fourt string.");
        //System.out.println("List size: "+ stringList.size());
        //stringList.remove(1);
        //System.out.println("List size: "+ stringList.size());
        //stringList.remove(0);
        System.out.println("List size: "+ stringList.size());
        for(String currentString : stringList){
            System.out.println(currentString);
        }
        Iterator<String> iterator =stringList.iterator();
        
        while(iterator.hasNext()){
            String currentString=iterator.next();
            System.out.println(currentString);
        }
    }
    
}
