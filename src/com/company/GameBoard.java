package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class GameBoard {
    private char [][] gameboard;
    private boolean ongoinggame = true;

    /**
     * Creating GameBoard via Constructor
     */
    public GameBoard(){
        gameboard = new char[3][3];
        for(int row=0;row<gameboard.length;row++){
            Arrays.fill(gameboard[row],' ');
        }
    }

    /**
     * GameBoard will be Displayed with this method
     */
    void DisplayBoard() {
        System.out.print('[');
        for (int row = 0; row < gameboard.length; row++) {
            for (int col = 0; col < gameboard[0].length; col++) {
                System.out.print(gameboard[row][col]);
                if (col == 0 || col == 1) {
                    System.out.print("][");
                } else {
                    System.out.print(']');
                }
            }
            if(row==0 || row==1){
                System.out.print("\n[");
            }
            else
                System.out.println();
        }
        System.out.println('\n');
    }

    /**
     * validate if a player move is allowed and return true
     * otherwise it returns false
     * @param player
     * @param row
     * @param col
     * @return
     */
    boolean makeMove(char player, int row, int col){
        if(row>=0 && row<=2 && col>=0 && col<=2){
            if(gameboard[row][col] != ' '){
                return false;
            }
            else{
                gameboard[row][col] = player;
                return true;
            }
        }
        else
            return false;
    }

    /**
     * method will return true if game is on going.
     * @return
     */
    public boolean gameActive(){
        return ongoinggame;
    }

    /**
     * method will ask player for row and column, validate the inputs and call the makeMove()
     * method.
     * @param player
     */
    void askPlayer(char player){
        Scanner sc = new Scanner(System.in);
        int row, col;
        do{
            System.out.printf("Player %s Please enter a row (1-3): ", player);
            row = sc.nextInt();

            System.out.printf("Player %s Please enter a column (1-3): ", player);
            col = sc.nextInt();
        }
        while(notValid(row,col));

        makeMove(player,row-1,col-1);
    }

    /**
     * this method will validate if the row and the column are between 1-3 and if the
     * position is currently empty;
     * @param row
     * @param col
     * @return
     */
    public boolean notValid(int row, int col){
        if(row>3 || row<1 || col>3 || col<1 || !isEmpty(row, col))
            return true;
        return false;
    }

    /**
     * this methos will check if a position is empty.
     * @param row
     * @param col
     * @return
     */
    boolean isEmpty(int row, int col){
        if(gameboard[row-1][col-1] == ' ')
            return true;
        else{
            System.out.print("That position is taken \n");
            return false;
        }
    }

    /**
     * NICHT FERTIG
     * this method will check if there is a winner in between the rows or not
     * @param row
     * @param col
     * @return
     */
    boolean status(int row, int col){
        for(row=0;row<3;row++){
            for(col=0;col<3;col++){
                if(gameboard[row-1][col-1] == 'X' || gameboard[row-1][col-1] == 'O')
                   return true;
                else
                    return false;
            }
        }
    }
    void gameStatus(char player){
        if(status() = true)
            System.out.printf( "%Player %s has won." , player );
    }




}
