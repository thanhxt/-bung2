package com.company;

public class Main {

    public static void main(String[] args) {

        String[] zeile1 = new String[]{"[x]","[ ]","[ ]"};
        String[] zeile2 = new String[]{"[ ]","[O]","[ ]"};
        String[] zeile3 = new String[]{"[ ]","[O]","[X]"};

        for(int i=0;i<3;i++){
            System.out.print(zeile1[i]);
            System.out.print(zeile2[i]);
            System.out.print(zeile3[i]);
            System.out.print("\n");
        }
    }




}
