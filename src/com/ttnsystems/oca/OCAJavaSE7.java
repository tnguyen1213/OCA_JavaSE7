/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttnsystems.oca;

import java.util.*;

/**
 *
 * @author Patrick Nguyen
 */
public class OCAJavaSE7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputText = new Scanner(System.in);
        List<String> enteredNames = new ArrayList<String>();        
        
        int nameCount = 0;
        
        do {
            System.out.println("Please enter a name or press <Enter> to stop.");
            enteredNames.add(nameCount, inputText.nextLine());
            //System.out.println("\n");
            } while (enteredNames.get(nameCount++).length() > 0);
       
        if (enteredNames.size() > 0) {
            int printNameCount = 0;
        
            while (enteredNames.get(printNameCount).length() > 0){
                System.out.println("Hello " + enteredNames.get(printNameCount++) + "!");
            }
        }

        for(int i = 0; i < args.length; i++){
            System.out.println("Hello " + args[i] + "!");
        }
        
        System.out.println("Hello World!\n");
    }
}
