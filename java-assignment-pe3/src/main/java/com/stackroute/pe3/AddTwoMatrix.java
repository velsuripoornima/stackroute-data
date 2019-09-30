package com.stackroute.pe3;

public class AddTwoMatrix  //this program represents addition of two matrix
{
    public AddTwoMatrix() //creating constructor to class
    {

    }

    public int[][] matrixAddition(int row, int col, int[][] matrix1, int matrix2[][]) //method takes input as 4 parameters
    {

        try {
            int result[][] = new int[row][col]; //takes multi dimentional array

            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < col; j++)
                {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];  //condition to add to matrix
                }
            }
            return result;
        }

        catch (Exception e)   //handling Exception
        {
            return null;
        }
    }
}