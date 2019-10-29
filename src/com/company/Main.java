package com.company;

public class Main {

    public static void main(String[] args) {
        GameBoard tictac = new GameBoard();

        tictac.DisplayBoard();
        tictac.makeMove('O',0,1);
        tictac.DisplayBoard();
    }




}
