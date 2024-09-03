/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abc_college;
import java.util.Scanner;

/**
 *
 * @author Luke Eybers
 */
public class ABC_College {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        // Creating an instance of the student class
        Student student = new Student();
        
        System.out.println("STUDENT MANAGEMENT APPLICATION");
        System.out.println("*******************************");
        System.out.println("Enter 1 to launch menu or any other key to exit");
        String value = scanner.nextLine();
        
        if(value.equals("1"))
        {
            System.out.println("Please select one of the following menu items:");
            // Calling the studentMenu method
            student.studentMenu();
        }
        else
        {
            System.out.println("You have selected another key, exiting the program");
        }
    }
}

/*
Reference List:
Geeks for Geeks. 2023. How to remove an element from ArrayList in Java?, 10 January 2023. [Online]. Available at: https://www.geeksforgeeks.org/remove-element-arraylist-java/ [Accessed 3 September 2024].
Geeks for Geeks. 2021. Creating an ArrayList with Multiple Object Types in Java, 22 October 2021. [Online]. Available at: https://www.geeksforgeeks.org/creating-an-arraylist-with-multiple-object-types-in-java/ [Accessed 3 September 2024].
W3 Schools. Java ArrayList. [Online]. Available at: https://www.w3schools.com/java/java_arraylist.asp [Accessed 03 September 2024].
Open AI. (2024). ChatGPT (September 3 version) [Large Language model]. https://chat.openai.com/ 
*/
