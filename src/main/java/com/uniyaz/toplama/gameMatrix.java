package com.uniyaz.toplama;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class gameMatrix {

    static Random rand = new Random();

    public   static int[][] createGameMatrix(int matrixValue){
        int matrix [][]=  new int[matrixValue][matrixValue];
        for(int i = 0 ; i<matrixValue; i++){ // birinci matrix için
            for(int j = 0 ; j<matrixValue;j++){
                matrix[i][j]=1;

            }
        }
        return  matrix;
    }
    public static void displayGameMatrix(int givenMatrix[][]){
        int col = givenMatrix[0].length;
        for(int k = 0 ; k<col;k++){ // ikinci matrixi yazdırmak için
            for (int j = 0 ; j<col;j++){

                System.out.printf("%5d ", givenMatrix[k][j]);
            }
            System.out.println();
        }
    }

    public  static  int[] rowBomb(){
        int[] rowBomb = new int [2];

        for(int i = 0 ; i<rowBomb.length;i++){
            rowBomb[i]=rand.nextInt(3);
        }
        return rowBomb;

    }
    public  static  int[] rowColumn(){
        int[] rowColumn = new int [2];

        for(int i = 0 ; i<rowColumn.length;i++){
            rowColumn[i]=rand.nextInt(3);
        }
        return rowColumn;

    }
/*    public static int[][] selectBombAreaa(int row , int col) {

        int bombarea[][] = new int[row][col];

        for(int i = 0 ; i<row; i++){
            for(int j = 0 ; j<col; j++){
                bombarea[i][j] = rand.nextInt(5);
            }

        }
        return bombarea;
    }*/
    public static void displayBombAreaMatrix(int givenMatrix[][]){
        int row = givenMatrix.length;
        int col = givenMatrix[0].length;
        for(int k = 0 ; k<row;k++){ // ikinci matrixi yazdırmak için
            for (int j = 0 ; j<col;j++){

                System.out.printf("%5d ", givenMatrix[k][j]);
            }
            System.out.println();
        }
    }

     public static  void selectArea(){

         Scanner scann = new Scanner(System.in);

         System.out.println("Row seç");
         int rowSelected = scann.nextInt();

         System.out.println("Colum Seç");
         int column = scann.nextInt();


     }


     public static void gameArea(){
        Scanner scan = new  Scanner(System.in);
        boolean winnder = false;
        final int [] bombRow = rowBomb();
        final int [] bombColum = rowColumn();
        boolean selected = false;

         System.out.println("Choose Game Board Size");

         int gameSize = scan.nextInt();

        final int gameBoard [][] = gameMatrix.createGameMatrix(gameSize);
         displayGameMatrix(gameBoard);


      while(!selected) {
          System.out.println("Row Seçin");

          int selectedRow = scan.nextInt();

          System.out.println("Colum Seçin");
          int selectedColumn = scan.nextInt();

          for (int i = 0; i < bombRow.length; i++) {
              if (bombRow[i] == selectedRow && bombColum[i] == selectedColumn) {
                  System.out.println("Kazandınız");
                  selected = true;
                  return;
              }

          }
          System.out.println("Seçime Devam edin");
          displayGameMatrix(gameBoard);

      }


     }

   /* public  static  void selectArea(int gameBoard[][],int bombeArea[][],int sayi1 , int sayi2){
        int row = bombeArea.length;
        int col = bombeArea[0].length;
        int select[][] = new int[1][2];
        select[0][0] = sayi1;
        select[0][1] = sayi2;

        boolean seçildi = false;
        Scanner scann = new Scanner(System.in);
        System.out.println("Row seç");
        int rowSelected = scann.nextInt();

        System.out.println("Colum Seç");
        int column = scann.nextInt();

        for(int i = 0 ; i<row;i++){
            for (int j = 0 ; j<col; j++){
                if(row = bombeArea[])
            }
        }

        if(seçildi == true){
            System.out.println("Oyunu Kazandınız");

        }
        else {
            gameBoard[sayi1][sayi2]= 1;
            displayGameMatrix(gameBoard);
        }


    }*/

}
