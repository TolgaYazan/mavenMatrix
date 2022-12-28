package com.uniyaz.chess;

import java.util.Scanner;

public class Chess {
    public static  int[][] chessBoard(){
        int chessMatrix[][] = new int[8][8];

        for(int i = 0 ; i<chessMatrix.length;i++){
            for(int j = 0; j<chessMatrix[0].length;j++){
                chessMatrix[i][j] = 1;
            }
        }


        return  chessMatrix;
    }

    public static  void displayChessBoard(int [][]chessBoard){
        int chessMatrix[][] = new int[8][8];

        for(int i = 0 ; i<chessBoard.length;i++){
            for(int j = 0; j<chessBoard()[0].length;j++){
                System.out.printf("%5d ", chessBoard[i][j]);
            }
            System.out.println();
        }



    }

    public static  void gameBoard() {
        Scanner scan = new Scanner(System.in);

        int chessMatrix[][] = new int[8][8];
        chessMatrix = chessBoard();
        System.out.println("--------------------------");
        System.out.println("WELCOME THE GAME");
        boolean devam = true;

        displayChessBoard(chessMatrix);

        /*System.out.println("Select row");
        int rowSelect = scan.nextInt();

        System.out.println("Select Column");
        int columSelect = scan.nextInt();*/

// for make row 0
        /*for (int i = 0; i < chessMatrix.length; i++) {
            chessMatrix[rowSelect - 1][i] = 0;

        }

        // for make column 0
        for (int i = 0; i < chessMatrix[0].length; i++) {
            chessMatrix[i][columSelect - 1] = 0;

        }
        int sub = rowSelect - columSelect;
        // for righ down part
        for (int i = rowSelect; i < chessMatrix.length; i++) {
            for (int j = columSelect; j < chessMatrix[0].length; j++) {
                if (i == j + sub) {
                    chessMatrix[i][j] = 0;
                }
            }
        }



        for (int i= rowSelect, j = columSelect-2 ; i < chessMatrix.length && j >= 0;i++,j--){
            chessMatrix[i][j] = 0;
        }

        for (int i= rowSelect, j = columSelect-2; i >= 0 && j < chessMatrix[0].length;i--,j++){
            chessMatrix[i][j] = 0;
      }

        for(int i  = rowSelect ; i>=0;i--){
         for(int j = columSelect ; j>=0 ; j--){
         if(i ==j+sub){
             chessMatrix[i][j] = 0;
         }
        }
    }*/

     while (devam){

         System.out.println("Select row");
         int rowSelect = scan.nextInt();

         System.out.println("Select Column");
         int columSelect = scan.nextInt();

         if(chessMatrix[rowSelect-1][columSelect-1]==0 || chessMatrix[rowSelect-1][columSelect-1]==99){
             System.out.println("Game over");
             devam=false;
         }
         else{

             // for make row 0
             for (int i = 0; i < chessMatrix.length; i++) {
                 chessMatrix[rowSelect - 1][i] = 0;

             }

             // for make column 0
             for (int i = 0; i < chessMatrix[0].length; i++) {
                 chessMatrix[i][columSelect - 1] = 0;

             }
             int sub = rowSelect - columSelect;
             // for righ down part
             for (int i = rowSelect; i < chessMatrix.length; i++) {
                 for (int j = columSelect; j < chessMatrix[0].length; j++) {
                     if (i == j + sub) {
                         chessMatrix[i][j] = 0;
                     }
                 }
             }



             for (int i= rowSelect, j = columSelect-2 ; i < chessMatrix.length && j >= 0;i++,j--){
                 chessMatrix[i][j] = 0;
             }

             for (int i= rowSelect, j = columSelect-2; i >= 0 && j < chessMatrix[0].length;i--,j++){
                 chessMatrix[i][j] = 0;
             }

             for(int i  = rowSelect ; i>=0;i--){
                 for(int j = columSelect ; j>=0 ; j--){
                     if(i ==j+sub){
                         chessMatrix[i][j] = 0;
                     }
                 }
             }

             chessMatrix[rowSelect-1][columSelect-1] = 99;
             displayChessBoard(chessMatrix);
         }


     }


        /*chessMatrix[rowSelect-1][columSelect-1] = 99;
        displayChessBoard(chessMatrix);*/


    }


}
