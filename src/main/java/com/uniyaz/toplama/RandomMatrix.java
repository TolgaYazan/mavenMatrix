package com.uniyaz.toplama;

import java.util.Random;

public class RandomMatrix {

    private static void displayRandomMatrix(int givenMatrix[][]){
        int row = givenMatrix.length;
        int col = givenMatrix[0].length;
        for(int k = 0 ; k<row;k++){ // ikinci matrixi yazdırmak için
            for (int j = 0 ; j<col;j++){

                System.out.printf("%5d ", givenMatrix[k][j]);
            }
            System.out.println();
        }
    }
    private static int[][] addRandomMatrix(int givenMatrixOne[][], int givenMatrixTwo[][]){
        int row = givenMatrixTwo.length;
        int col = givenMatrixOne[0].length;//coloumn
        int resulttMatrix[][]=new int[row][col];
        for(int i = 0 ; i<row;i++){ // ikinci matrixi yazdırmak için
            for (int j = 0 ; j<col;j++){

                resulttMatrix[i][j]= givenMatrixOne[i][j]+givenMatrixTwo[i][j];
            }
            System.out.println();
        }
        return resulttMatrix;
    }

    private  static int[][] createRandomMatrix(int matrixRow, int matrixColumn){
        int matrix [][]=  new int[matrixRow][matrixColumn];
        for(int i = 0 ; i<matrixRow; i++){ // birinci matrix için
            for(int j = 0 ; j<matrixColumn;j++){
                Random rand = new Random();
                matrix[i][j]=rand.nextInt(50);

            }
        }
        return  matrix;
    }

}
