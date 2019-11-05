package com.company;

public class Main {

    public static void main(String[] args) {
        GameBoard tictac = new GameBoard();

       // tictac.DisplayBoard();
        //tictac.makeMove('O',0,1);
        tictac.DisplayBoard();
        int counter = 1;
        while(tictac.gameActive() && counter < 10){
            if(counter % 2 == 0)
                tictac.askComputer('O');
            else
                //tictac.askPlayer('O');
                tictac.askPlayer('X');
            counter++;
            tictac.DisplayBoard();
            tictac.status();
            if (counter == 10)
                System.out.println("STALEMATE");


        }
    }




}
