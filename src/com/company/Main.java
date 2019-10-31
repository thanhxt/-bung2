package com.company;

public class Main {

    public static void main(String[] args) {
        GameBoard tictac = new GameBoard();

       // tictac.DisplayBoard();
        //tictac.makeMove('O',0,1);
        tictac.DisplayBoard();
        int counter = 1;
        while(tictac.gameActive()){
            if(counter % 2 == 0)
                tictac.askPlayer('X');
            else
                tictac.askPlayer('O');
            counter++;
            tictac.DisplayBoard();
        }



    }




}
