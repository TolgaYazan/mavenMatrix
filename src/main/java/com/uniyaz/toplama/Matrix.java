package com.uniyaz.toplama;

import java.util.Scanner;

public class Matrix {

    private static int[][] addMatrix(int givenMatrixOne[][], int givenMatrixTwo[][]){
        int col = givenMatrixOne[0].length;
        int resulttMatrix[][]=new int[col][col];
        for(int i = 0 ; i<col;i++){ // ikinci matrixi yazdırmak için
            for (int j = 0 ; j<col;j++){

                resulttMatrix[i][j]= givenMatrixOne[i][j]+givenMatrixTwo[i][j];
            }
            System.out.println();
        }
        return resulttMatrix;
    }
    private static void displayMatrix(int givenMatrix[][]){
        int col = givenMatrix[0].length;
        for(int k = 0 ; k<col;k++){ // ikinci matrixi yazdırmak için
            for (int j = 0 ; j<col;j++){

                System.out.printf("%5d ", givenMatrix[k][j]);
            }
            System.out.println();
        }
    }
    private   static int[][] createMatrix(int matrixValue){
        int matrix [][]=  new int[matrixValue][matrixValue];
        for(int i = 0 ; i<matrixValue; i++){ // birinci matrix için
            for(int j = 0 ; j<matrixValue;j++){
                Scanner scan =new Scanner(System.in);
                System.out.println(" Matrix için değer girin");
                int input = scan.nextInt();
                matrix[i][j]=input;

            }
        }
        return  matrix;
    }
    public static int[][] multiplyMatrix(int givenMatrixOne[][], int givenMatrixTwo[][]){
        int col = givenMatrixOne[0].length;
        int mul = 0;
        int top = 0;
        int resultMatrix[][]=new int[col][col];
        for(int i=0;i<col;i++){
            for(int j=0;j<col;j++){
                resultMatrix[i][j]=0;
                for(int k=0;k<col;k++)
                {
                    resultMatrix[i][j]+=givenMatrixOne[i][k]*givenMatrixTwo[k][j];
                }
            }
            System.out.println();
        }
        return  resultMatrix;
    }
}
