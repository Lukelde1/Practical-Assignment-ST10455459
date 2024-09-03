/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.abc_college;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 *
 * @author Luke Eybers
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    @BeforeEach
    public void setUp1() {
        // Initialize the Student object before each test
        Student student = new Student();
        
    }
    
    @Test
    public void TestSaveStudent() 
    {
        Student student = new Student();
        // Simulate user input for saving a student
        String studentID = "123";
        String studentName = "Luke";
        String studentAge = "18";
        String studentEmail = "luke@gmail.com";
        String studentCourse = "bcad";

        // adds the student data to the ArrayLists
        student.GetArrStudentID().add(studentID);
        student.GetArrStudentName().add(studentName);
        student.GetArrStudentAge().add(studentAge);
        student.GetArrStudentEmail().add(studentEmail);
        student.GetArrStudentCourse().add(studentCourse);

        // verifies that the student was correctly added to the ArrayLists
        assertTrue(student.GetArrStudentID().contains(studentID));
        assertTrue(student.GetArrStudentName().contains(studentName));
        assertTrue(student.GetArrStudentAge().contains(studentAge));
        assertTrue(student.GetArrStudentEmail().contains(studentEmail));
        assertTrue(student.GetArrStudentCourse().contains(studentCourse));
    }

    /**
     * Test of GetArrStudentID method, of class Student.
     */
    @Test
    public void testGetArrStudentID() {
        
    }

    /**
     * Test of GetArrStudentName method, of class Student.
     */
    @Test
    public void testGetArrStudentName() {
       
    }

    /**
     * Test of GetArrStudentAge method, of class Student.
     */
    @Test
    public void testGetArrStudentAge() {
       
    }

    /**
     * Test of GetArrStudentEmail method, of class Student.
     */
    @Test
    public void testGetArrStudentEmail() {
    
    }

    /**
     * Test of GetArrStudentCourse method, of class Student.
     */
    @Test
    public void testGetArrStudentCourse() {
       
    }

    /**
     * Test of studentMenu method, of class Student.
     */
    @Test
    public void TestStudentMenu() 
    {
        Student student = new Student();
        // Simulate user input for saving a student and then exit
        String input = "1\n123\nLuke\n18\nluke@gmail.com\nBCAD\n5\n"; 
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Call the studentMenu method
        student.studentMenu();

        // Restore the original System.in
        System.setIn(originalIn);

        // Verify that the student was saved
        assertTrue(student.GetArrStudentID().contains("123"), "Student ID list should contain the saved ID.");
        assertTrue(student.GetArrStudentName().contains("Luke"), "Student name list should contain the saved name.");
        assertTrue(student.GetArrStudentAge().contains("18"), "Student age list should contain the saved age.");
        assertTrue(student.GetArrStudentEmail().contains("luke@gmail.com"), "Student email list should contain the saved email.");
        assertTrue(student.GetArrStudentCourse().contains("BCAD"), "Student course list should contain the saved course.");
    }
    
    

    /**
     * Test of ExitStudentApplication method, of class Student.
     */
    @Test
    public void testExitStudentApplication() {
        System.out.println("ExitStudentApplication");
        Student instance = new Student();
        instance.ExitStudentApplication();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SaveStudent method, of class Student.
     */
    @Test
    public void testSaveStudent() 
    {
        Student student = new Student();
         // Expected
        String studentID = "123";
        String studentName = "Luke";
        String studentAge = "18";
        String studentEmail = "luke@gmail.com";
        String studentCourse = "bcad";

        // Actual
        student.GetArrStudentID().add(studentID);
        student.GetArrStudentName().add(studentName);
        student.GetArrStudentAge().add(studentAge);
        student.GetArrStudentEmail().add(studentEmail);
        student.GetArrStudentCourse().add(studentCourse);

        // verifies that the student was correctly added to the ArrayLists
        assertTrue(student.GetArrStudentID().contains(studentID));
        assertTrue(student.GetArrStudentName().contains(studentName));
        assertTrue(student.GetArrStudentAge().contains(studentAge));
        assertTrue(student.GetArrStudentEmail().contains(studentEmail));
        assertTrue(student.GetArrStudentCourse().contains(studentCourse));
    }

    /**
     * Test of SearchStudent method, of class Student.
     */
    @Test
    public void testSearchStudent() 
    {
        Student student = new Student();
        //Actual
        student.SaveStudent(); 
        boolean actual = student.SearchStudent();
        //Expected
        boolean expected = true;
        //Test
        assertEquals(expected, actual);     
    }
    
    @Test
    public void TestSearchStudent_StudentNotFound() 
    {
        Student student = new Student();
        //Actual
        student.SaveStudent();
        boolean actual = student.SearchStudent();
        
        //Expected
        boolean expected = false;
        
        //Test
        assertEquals(expected, actual);
    }

    /**
     * Test of DeleteStudent method, of class Student.
     */
    @Test
    public void TestDeleteStudent() 
    {
         //Actual
        Student student1 = new Student();
        student1.SaveStudent();
        boolean actual = student1.DeleteStudent();
        
        //Expected
        boolean expected = true;
        
        //Test
        assertEquals(expected, actual);
    }
    
    @Test
    public void TestDeleteStudent_StudentNotFound()
    {
        //Actual
        Student student1 = new Student();
        student1.SaveStudent();
        boolean actual = student1.DeleteStudent();
        
        //Expected
        boolean expected = false;
        
        //Test
        assertEquals(expected, actual);
        
    }
    
    @Test
    public void TestStudentAge_StudentAgeValid()
    {
        //Actual
        Student student1 = new Student();
        boolean actual = student1.checkStudentAge("18");
        
        //Expected
        boolean expected = true;
        
        //Test
        assertEquals(expected, actual);
    }
    
    @Test
    public void TestStudentAge_StudentAgeInvalid()
    {
        //Actual
        Student student1 = new Student();
        boolean actual = student1.checkStudentAge("15");
        
        //Expected
        boolean expected = false;
        
        //Test
        assertEquals(expected, actual);
    }
    
    @Test
    public void TestStudentAge_StudentAgeInvalidCharacter()
    {
        //Actual
        Student student1 = new Student();
        boolean actual = student1.checkStudentAge("u");
        
        //Expected
        boolean expected = false;
        
        //Test
        assertEquals(expected, actual);
    }

    /**
     * Test of StudentReport method, of class Student.
     */
    @Test
    public void testStudentReport() {
        System.out.println("StudentReport");
        Student instance = new Student();
        instance.StudentReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
