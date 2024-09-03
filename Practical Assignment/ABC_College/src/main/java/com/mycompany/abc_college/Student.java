/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abc_college;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Luke Eybers
 */
public class Student 
{
    private static boolean run = true;
    private ArrayList<String> arrStudentID = new ArrayList<String>();// (GeeksForGeeks, 2021)
    private ArrayList<String> arrStudentName = new ArrayList<String>();
    private ArrayList<String> arrStudentAge = new ArrayList<String>();
    private ArrayList<String> arrStudentEmail = new ArrayList<String>();
    private ArrayList<String> arrStudentCourse = new ArrayList<String>();
    
    //Getter methods for the unit tests
    public ArrayList<String> GetArrStudentID()
    {
        return arrStudentID;
    }
    
    public ArrayList<String> GetArrStudentName()
    {
        return arrStudentName;
    }
    
    public ArrayList<String> GetArrStudentAge()
    {
        return arrStudentAge;
    }
    
    public ArrayList<String> GetArrStudentEmail()
    {
        return arrStudentEmail;
    }
    
    public ArrayList<String> GetArrStudentCourse()
    {
        return arrStudentCourse;
    }
    
    
    
    public void studentMenu()
    {
        Scanner scanner = new Scanner(System.in);
        // while loop that keeps display the menu until exit is selected
        while(run)
        {
            //System.out.println("Please select one of the following menu items:");
            System.out.println("1. Capture a new student");
            System.out.println("2. Search for a student");
            System.out.println("3. Delete a student");
            System.out.println("4. Print student report");
            System.out.println("5. Exit the application");
            //Getting the user's input
            int choice = scanner.nextInt(); 
            
            //Switch statement to handle the menu
            switch(choice)
            {
                case 1: 
                    SaveStudent();
                    break;
                case 2:
                    SearchStudent();
                    break;
                case 3:
                    DeleteStudent();
                    break;
                case 4:
                    StudentReport();
                    break;
                case 5:
                    run= false;
                    System.out.println("Exiting the application");
                    break;
                default:
                    System.out.println("Invalid menu selection! Please enter a valid number.");
                    break;
            }
            
        }  
    }
    
    public void ExitStudentApplication()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 to launch menu or any other key to exit ");
        String value = scanner.nextLine();
                    
        if(value.equals("1"))
        {
            //goes back to the menu
            return;
        }
        else
        {
            //exits the application
            run = false;
        }
    }
    
    
    public void SaveStudent()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CAPTURE A NEW STUDENT");
        System.out.println("**************************");
        // User input
        System.out.print("Enter the student id: ");
        String studentID = scanner.nextLine();
        
        System.out.print("Enter the student name: ");
        String studentName = scanner.nextLine();
        
        
        boolean test = false;
        String studentAge = "";
        // Loop to keep prompting the user to enter a right age.
        while(!test)
        {
            System.out.print("Enter the student age: ");
            studentAge = scanner.nextLine();
            test = checkStudentAge(studentAge);
        
        }
        
        System.out.print("Enter the student email: ");
        String studentEmail = scanner.nextLine();
        
        System.out.print("Enter student course: ");
        String studentCourse = scanner.nextLine();
        System.out.println("The student details has been successfully saved!");
        //Adding to Parallel arraylists
        arrStudentID.add(studentID);// (W3Schools)
        
        arrStudentName.add(studentName);
        
        arrStudentAge.add(studentAge);
        
        arrStudentEmail.add(studentEmail);
        
        arrStudentCourse.add(studentCourse);
     
        ExitStudentApplication();
    }
    
    public boolean checkStudentAge(String studentAge)
    {
        Scanner scanner = new Scanner(System.in);
        int age;
        boolean test = false;
        // try statement for determining if an integer is inputted for the age
        try
        {
            age = Integer.parseInt(studentAge);
            
            if(age>=16)
            {
                test = true;
            }
            else
            {
                System.out.println("You have entered an incorrect age!!!");
                System.out.println("Please re-enter the student age >>");
                test = false;
            }
            // Checks if the number entered is an Integer.

        }catch(NumberFormatException e)//(Open AI, 2024)
        {
            System.out.println("You have entered an incorrect age!!!");
            System.out.println("Please re-enter the student age >>");
            return test;
        }
        return test;
    }
    
    public boolean SearchStudent()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the ID to search: ");
        String searchID = scanner.nextLine();
        System.out.println("-------------------------------");
        
        // Gets the index of the ID
        int index = arrStudentID.indexOf(searchID);
        // if the index is found
        if(index != -1)
        {
            //gets the index of all the indexs that corrospond to the ID.
            System.out.println("STUDENT ID: "+arrStudentID.get(index));//(W3Schools)
            System.out.println("STUDENT NAME: "+ arrStudentName.get(index));
            System.out.println("STUDENT AGE: "+ arrStudentAge.get(index));
            System.out.println("STUDENT EMAIL: "+ arrStudentEmail.get(index));
            System.out.println("STUDENT COURSE: "+ arrStudentCourse.get(index));
            System.out.println("--------------------------------");
            // Option for the user to exit the application
            ExitStudentApplication();
            return true;
        }
        else
        {
            //Message if the ID was not found
            System.out.println("Student with Student ID: "+ searchID + "was not found!");
            System.out.println("---------------------------------");
            ExitStudentApplication();
            return false;
            
        }
    }
    
    public boolean DeleteStudent()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student ID to delete: ");
        String deleteID = scanner.nextLine();
        
        System.out.println("Are you sure you want to delete student "+ deleteID + " from the system? Yes (y) to delete.");
        String choice = scanner.nextLine();
        // if the user decides to delete the student
        if(choice.equals("y"))
        {
            // Storing the deleteID's index in index
            int index = arrStudentID.indexOf(deleteID);
            if(index != -1)
            {
                // Deleting the indexes
                arrStudentID.remove(index);// (GeeksforGeeks, 2023)
                arrStudentName.remove(index);
                arrStudentAge.remove(index);
                arrStudentEmail.remove(index);
                arrStudentCourse.remove(index);
                
                System.out.println("------------------------------------");
                System.out.println("Student with ID: " + deleteID + " WAS deleted!");
                System.out.println("------------------------------------");
            
                ExitStudentApplication();
                return true;
            }
            else
            {
                System.out.println("The ID that you want to delete does not exist.");
                return false;
            }
        }
        else
        {
            ExitStudentApplication();
            return false;
        }
    }
    
    public void StudentReport()
    {
        for(int i=0; i<arrStudentID.size(); i++)
        {
            System.out.println("STUDENT "+ (i+1));
            System.out.println("------------------------------------");
            System.out.println("STUDENT ID: "+ arrStudentID.get(i));
            System.out.println("STUDENT NAME: "+ arrStudentName.get(i));
            System.out.println("STUDENT AGE: "+ arrStudentAge.get(i));
            System.out.println("STUDENT EMAIL: "+ arrStudentEmail.get(i));
            System.out.println("STUDENT COURSE: "+ arrStudentCourse.get(i));
            System.out.println("------------------------------------");
        }
        ExitStudentApplication();
    }
    }

    
    

