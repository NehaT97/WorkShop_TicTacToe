package com.game;

import java.util.Scanner;

public class TicTacToe {

        //CreateBoard Method for ten elements
        public static char[] createBoard()
        {
            char[] board = new char[10];
            for (int index = 1; index < board.length; index++)
            {
                board[index]=0 ;
            }
            return board;
        }

        public static String UserChoice()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println(" User can choice x | 0 ");
            return sc.nextLine();
        }

        public static void main(String[] args)
        {
            Scanner sc =new Scanner(System.in);
            System.out.println("Welcome to Tic tac Toe...");

            String Computerchoice="";    //Computer choice
            String Userchoice = UserChoice(); //user choice

            if (Userchoice.equals("x")){
                Computerchoice="0";
            }

            else{
                Computerchoice="0";
            }


        }


}
