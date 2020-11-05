package com.game;

import java.util.Scanner;

public class TicTacToe {

    public static String computerChoice="";    //Computer choice
    public static String userChoice = ""; //user choice

        //uc1_CreateBoard Method for ten elements
        public static char[] createBoard()
        {
            char[] board = new char[10];
            for (int index = 1; index < board.length; index++)
            {
                board[index]=0 ;
            }
            return board;
        }

        //uc2_UserChoice
        public static void setUserChoice()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println(" User can choice x | 0 ");
            userChoice = sc.nextLine();
            if (userChoice.equals("x")){
                computerChoice="0";
            }
            else{
                computerChoice="x";
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
        }


}
