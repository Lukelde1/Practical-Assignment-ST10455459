/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tictactoe_q2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luke Eybers
 */
public class TicTacToeTest {
    
    public TicTacToeTest() {
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
    
     @Test
    // Test to see if the tictactoe symbol appears for the user
    public void testInsertSymbolPlayer() 
    {
        TicTacToe game = new TicTacToe();
        // position 1 for the user
        game.insertSymbol(1, "player");
        char[][] expectedGrid = {
            {'X', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}
        };
        assertArrayEquals(expectedGrid, game.getGrid());
    }
    @Test
    // Test to see if the tictactoe symbol appears for the computer opponent
    public void testInsertSymbolComputer() 
    {
        TicTacToe game = new TicTacToe();
        // position 5 for the computer
        game.insertSymbol(5, "computer");
        char[][] expectedGrid = {
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', 'O', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}
        };
        assertArrayEquals(expectedGrid, game.getGrid());
    }
    
    @Test
    // Test that checks if the player wins
    public void testDetermineWinnerPlayerWins() 
    {
        TicTacToe game = new TicTacToe();
        // Positions on the grid that would allow the player to win
        game.insertSymbol(1, "player");
        game.insertSymbol(2, "player");
        game.insertSymbol(3, "player");
        assertEquals("You have won!", game.determineWinner());
    }
    
    @Test
    // Test that checks if the computer wins
    public void testDetermineWinnerComputerWins() 
    {
        TicTacToe game = new TicTacToe();
        // Positions that will allow the computer to win
        game.insertSymbol(1, "computer");
        game.insertSymbol(4, "computer");
        game.insertSymbol(7, "computer");
        assertEquals("The computer won! You lost.", game.determineWinner());
    }

    @Test
    // Test to see if determining a draw works
    public void testDetermineWinnerDraw() 
    {
        TicTacToe game = new TicTacToe();
        // Conditions for the game to be a draw
        game.insertSymbol(1, "player");
        game.insertSymbol(2, "computer");
        game.insertSymbol(3, "player");
        game.insertSymbol(4, "player");
        game.insertSymbol(5, "computer");
        game.insertSymbol(6, "player");
        game.insertSymbol(7, "computer");
        game.insertSymbol(8, "player");
        game.insertSymbol(9, "computer");
        assertEquals("DRAW!", game.determineWinner());
    }
    
    @Test
    //Test to see if the grid will reset
    public void testResetGrid() {
        TicTacToe game = new TicTacToe();
        game.insertSymbol(1, "player");
        game.insertSymbol(5, "computer");
        game.resetGrid();
        char[][] expectedGrid = {
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}
        };
        assertArrayEquals(expectedGrid, game.getGrid());
    }
    /**
     * Test of displayGrid method, of class TicTacToe.
     */
    @Test
    public void testDisplayGrid() {
       
    }

    /**
     * Test of playGame method, of class TicTacToe.
     */
    @Test
    public void testPlayGame() {
        System.out.println("playGame");
        TicTacToe instance = new TicTacToe();
        instance.playGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
