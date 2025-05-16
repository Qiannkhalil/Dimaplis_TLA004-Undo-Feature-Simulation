/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.kiann1;

import java.util.*;

/**
 *
 * @author Students Account
 */
public class Kiann1 {

    public static void main(String[] args) {

        Scanner can = new Scanner(System.in);
        Stack<String> actionStack = new Stack<>();

        System.out.println("Enter an action (type 'undo' to undo, 'exit' to stop):");

        while (true) {
            String input = can.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program. Goodbye!");
                break;
            } else if (input.equalsIgnoreCase("undo")) {
                if (actionStack.isEmpty()) {
                    System.out.println("Nothing to undo.");
                } else {
                    String undoneAction = actionStack.pop();
                    System.out.println("You undid \"" + undoneAction + "\"");
                }
            } else if (!input.isEmpty()) {
                actionStack.push(input);
                System.out.println("You " + input);
            } else {
                
                System.out.println("Please enter an action or command.");
            }
        }

    }
}


