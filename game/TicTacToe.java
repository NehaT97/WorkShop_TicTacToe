package com.game;
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


        public static void main(String[] args)
        {
        System.out.println("Welcome to Tic tac Toe...");
        char[] board = createBoard(); //declaring createboard method;
        }
}
