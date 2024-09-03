/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tictactoe_q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Luke Eybers
 */
public class TicTacToe {
    private char[][] grid;
    private ArrayList<Integer> playerPositions = new ArrayList<>();
    private ArrayList<Integer> computerPositions = new ArrayList<>();

    // Method to return the current grid (for testing)
    public char[][] getGrid() 
    {
        return grid;
    }
    // Constructor
    public TicTacToe() {
        // Initialize the 2D array to store the tic tac toe board
        grid = new char[][]{
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}
        };//("see Tic Tac Toe Java Game - Alex Lee 2020")
    }
 
    public void displayGrid() 
    {
        // Displaying the grid
        for (char[] row : grid) 
        {
            for (char i : row) 
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
    public void insertSymbol(int blockNumber, String user) 
    {
        char symbol = ' ';
        // Assigning the correct symbol to the player and the computer opponent
        if (user.equals("player")) 
        {
            symbol = 'X';
            playerPositions.add(blockNumber);
        } 
        else if (user.equals("computer")) 
        {
            symbol = 'O';
            computerPositions.add(blockNumber);
        }

        // Places an X or O accordingly on the grid
        switch (blockNumber) 
        {
            case 1:
                grid[0][0] = symbol;
                break;
            case 2:
                grid[0][2] = symbol;
                break;
            case 3:
                grid[0][4] = symbol;
                break;
            case 4:
                grid[2][0] = symbol;
                break;
            case 5:
                grid[2][2] = symbol;
                break;
            case 6:
                grid[2][4] = symbol;
                break;
            case 7:
                grid[4][0] = symbol;
                break;
            case 8:
                grid[4][2] = symbol;
                break;
            case 9:
                grid[4][4] = symbol;
                break;
            default:
                System.out.println("Invalid input, please enter numbers 1-9");
        }
    }
    
    public String determineWinner() 
    {
        // Putting all the winning conditions in a list
        List<List<Integer>> winner = new ArrayList<>();
        winner.add(Arrays.asList(1, 2, 3));
        winner.add(Arrays.asList(4, 5, 6));
        winner.add(Arrays.asList(7, 8, 9));
        winner.add(Arrays.asList(1, 4, 7));
        winner.add(Arrays.asList(2, 5, 8));
        winner.add(Arrays.asList(3, 6, 9));
        winner.add(Arrays.asList(1, 5, 9));
        winner.add(Arrays.asList(7, 5, 3));

        // Displaying messages for winning, losing, and drawing
        for (List<Integer> i : winner) 
        {
            if (playerPositions.containsAll(i)) 
            {
                displayGrid();
                return "You have won!";
            } else if (computerPositions.containsAll(i)) 
            {
                displayGrid();
                return "The computer won! You lost.";
            }
        }
        if (playerPositions.size() + computerPositions.size() == 9) 
        {
            displayGrid();
            return "DRAW!";
        }
        return "";
    }

    public void playGame() 
    {
        while(true)
        {
            playerPositions.clear();
            computerPositions.clear();
            resetGrid();
        
            displayGrid();

        while (true) 
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter placement of X (1-9): ");
            int playerPos = scanner.nextInt();

            // Ensure you don't place a symbol in an occupied position
            while (playerPositions.contains(playerPos) || computerPositions.contains(playerPos)) 
            {
                System.out.println("Position has been taken! Enter another position");
                playerPos = scanner.nextInt();
            }

            insertSymbol(playerPos, "player");

            String result = determineWinner();
            if (!result.isEmpty()) {
                System.out.println(result);
                break;
            }

            Random random = new Random();
            // Randomly generate a position for the computer
            int computerPos = random.nextInt(9) + 1;
            // Ensure the computer doesn't place a symbol in an occupied position
            while (playerPositions.contains(computerPos) || computerPositions.contains(computerPos)) {
                computerPos = random.nextInt(9) + 1;
            }
            insertSymbol(computerPos, "computer");

            displayGrid();

            result = determineWinner();
            if (!result.isEmpty()) {
                System.out.println(result);
                displayGrid();
                break;
            }
            }
            Scanner scanner = new Scanner(System.in);
            // Asks if the user wants to play again
            System.out.println("Do you want to play again? y/n: ");
            String playAgain = scanner.next();

            if (!playAgain.equals("y")) {
                System.out.println("Thank you for playing TicTacToe!");
                break;//(Open AI, 2024)
            }
        }
    }
    public void resetGrid() 
    {
    // Reset the grid to the initial state
        grid = new char[][]{
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}
    };
    }

    }



