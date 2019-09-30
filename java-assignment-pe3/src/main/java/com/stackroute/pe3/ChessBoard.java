package com.stackroute.pe3;

public class ChessBoard  //this programe to create a chess board
{
    public ChessBoard() //create constructor for class
    {

    }
    public String[][] createChessBoard(int row,int col)  //method takes two parameter
    {

        if(row !=8 || col !=8)  //contion to check number should be in 8
        {
            return null;
        }
        String chessBoard[][]=new String[row][col];

        for(int i=0;i<row;i++)  //this for loop repeates the rows
        {
            for(int j=0;j<col;j++)  //this for loop for repeates the cols
            {
                if((i+j) % 2 == 0)
                {
                    chessBoard[i][j]="WW|";
                }

                else{
                    chessBoard[i][j]="BB|";
                }
            }

        }
        return chessBoard;
    }
}
