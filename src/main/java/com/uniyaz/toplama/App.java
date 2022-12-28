package com.uniyaz.toplama;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
       Scanner scan =new Scanner(System.in);

        System.out.println("Matrix için değer girin");
        int matrixValue = scan.nextInt();

        int firstMatrixOne[][] = new int[matrixValue][matrixValue];
        firstMatrixOne=createMatrix(matrixValue);
        int secondMatrixOne[][] = new int[matrixValue][matrixValue];


        int resultMatrix[][] = new int[matrixValue][matrixValue];
        resultMatrix = addMatrix(firstMatrixOne,secondMatrixOne);

        displayMatrix(resultMatrix);

       /* secondMatrixOne = createMatrix(matrixValue);
        resultMatrix =Matrix.multiplyMatrix(firstMatrixOne,secondMatrixOne);
        displayMatrix(resultMatrix);*/

      //  System.out.println("Matrixin boyutunu belirleyin");
      //  int matrixValue = scan.nextInt();

   /*     int secondtMatrix [][]=  new int[matrixValue][matrixValue];
        int resulttMatrix [][]=  new int[matrixValue][matrixValue];*/

       /* firstMatrix=createMatrix(matrixValue);
        System.out.println("Display 1 matrix");
        displayMatrix(firstMatrix);

        secondtMatrix=createMatrix(matrixValue);
        System.out.println("Display 2 matrix");
        displayMatrix(firstMatrix);

        resulttMatrix = addMatrix(firstMatrix,secondtMatrix);
        System.out.println("Display Add Matrix");
        displayMatrix(resulttMatrix);*/
       /* System.out.println("Matrixin  Rowunu  belirle");
        int matrixRowValue = scan.nextInt();
        System.out.println("Matrixin  Columnu  belirle");
        int matrixColumnValue = scan.nextInt();
        int randomtMatrixOne [][]=  new int[matrixRowValue][matrixColumnValue];
        int randomtMatrixSecond [][]=  new int[matrixRowValue][matrixColumnValue];

        int randomtMatrixResult [][]=  new int[matrixRowValue][matrixColumnValue];
        randomtMatrixOne=createRandomMatrix(matrixRowValue,matrixColumnValue);
        System.out.println("Display 1 matrix");
        displayRandomMatrix(randomtMatrixOne);

        randomtMatrixSecond=createRandomMatrix(matrixRowValue,matrixColumnValue);
        System.out.println("Display 2 matrix");
        displayRandomMatrix(randomtMatrixSecond);

        randomtMatrixResult=addRandomMatrix(randomtMatrixOne,randomtMatrixSecond);
        System.out.println("Display result matrix");
        displayRandomMatrix(randomtMatrixResult);
*/


    }

    /*private  static  void  doMatrix(int matrixValue){
        int firstMatrix [][]=  new int[matrixValue][matrixValue];
        int secondtMatrix [][]=  new int[matrixValue][matrixValue];
        int resulttMatrix [][]=  new int[matrixValue][matrixValue];


        for(int i = 0 ; i<matrixValue; i++){ // birinci matrix için
            for(int j = 0 ; j<matrixValue;j++){
                Scanner scan =new Scanner(System.in);
                System.out.println(" birinci Matrix için değer girin");
                int input = scan.nextInt();
                firstMatrix[i][j]=input;

            }
        }
        for(int i = 0 ; i<matrixValue; i++){ // ikinci değer için value
            for(int j = 0 ; j<matrixValue;j++){
                Scanner scan =new Scanner(System.in);
                System.out.println(" ikinci Matrix için değer girin");
                int input = scan.nextInt();
                secondtMatrix[i][j]=input;

            }
        }
        // toplama için
        for (int i = 0; i<matrixValue;i++){
            for (int j = 0 ; j<matrixValue;j++){
                resulttMatrix[i][j]= firstMatrix[i][j]+secondtMatrix[i][j];
            }
        }


        for(int k = 0 ; k<matrixValue;k++){ // birinci matrix i yazdırmak için
            for (int j = 0 ; j<matrixValue;j++){

                System.out.printf("%5d ", firstMatrix[k][j]);
            }
            System.out.println();
        }
        for(int k = 0 ; k<matrixValue;k++){ // ikinci matrixi yazdırmak için
            for (int j = 0 ; j<matrixValue;j++){

                System.out.printf("%5d ", secondtMatrix[k][j]);
            }
            System.out.println();
        }
        for(int k = 0 ; k<matrixValue;k++){ // ikinci matrixi yazdırmak için
            for (int j = 0 ; j<matrixValue;j++){
                System.out.println("Matrix Toplamaı");
                System.out.printf("%5d ",resulttMatrix[k][j]);
            }
            System.out.println();
        }

    }*/
    private  static int[][] createMatrix(int matrixValue){
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

    private static void displayMatrix(int givenMatrix[][]){
        int col = givenMatrix[0].length;
        for(int k = 0 ; k<col;k++){ // ikinci matrixi yazdırmak için
            for (int j = 0 ; j<col;j++){

                System.out.printf("%5d ", givenMatrix[k][j]);
            }
            System.out.println();
        }
    }
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
