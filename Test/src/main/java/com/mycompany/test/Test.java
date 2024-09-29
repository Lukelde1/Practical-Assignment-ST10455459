/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.Option;

/**
 *
 * @author lukeeybers
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("Hello there");
        System.out.println("Hi how are you?");
        Scanner scanner = new Scanner(System.in);
        String state = scanner.nextLine();
        
        System.out.println("The user is currently feeling: " + state);
        
        if(state.equalsIgnoreCase("good"))
        {
            System.out.println("That's good that you are feeling good! Keep it up!");
        }
        else if(state.equalsIgnoreCase("bad") || state.equalsIgnoreCase("sad")|| state.equalsIgnoreCase("unhappy"))
        {
            System.out.println("Don't worry I'm sure things will get better for you just keep your chin up!");
        }
    }
}
