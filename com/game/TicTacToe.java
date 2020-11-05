package com.game;
import java.util.Scanner;

public class TicTacToe {

    public static String computerChoice="";    //Computer choice
    public static String userChoice = "";      //user choice

    //uc1_CreateBoard Method for ten elements
    public static char[] createBoard()
    {
        char[] board = new char[10];
        for (int index = 1; index < board.length; index++)
        {
            board[index] = ' ' ;
        }
        return board;
    }

    //uc2_UserChoice
    public static void setUserChoice()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" \nUser can choice x | 0 ");
        userChoice = sc.nextLine();
        if (userChoice.equals("x")){
            computerChoice="0";
        }
        else if (userChoice.equals("0")){
            computerChoice="x";
        }

        else {
            System.out.println("\nsorry!!! Only Entered (x | 0)");
        }

    }

    //uc3_Displaying Bord
    public static void displayBoard(char[] board)
    {
        System.out.println("\nDisplaying Game Board");
        for (int index = 1; index < board.length; index=index+3)
        {
            System.out.println();
            System.out.println("|" +board[index]  +"\t" +"|"  +board[index+1]  +"\t" +"|"  +board[index+2] );
        }
    }
    
    public static void main(String[] args)
    {
        System.out.println("Welcome to Tic tac Toe...");
        //Creating game board
        char[] gameBoard = createBoard();

        //setting user choice
        setUserChoice();
        System.out.println("User Choice :"+userChoice+" Computer choice :"+computerChoice);

        displayBoard(gameBoard);
    }
}
