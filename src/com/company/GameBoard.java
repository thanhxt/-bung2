package com.company;

import java.util.Arrays;

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

}
