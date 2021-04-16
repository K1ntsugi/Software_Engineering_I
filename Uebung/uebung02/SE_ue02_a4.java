package Uebung.uebung02;

import java.util.Scanner;

public class SE_ue02_a4 {
   
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String data;

        System.out.println("Bitte Zahl einlesen: ");
        data = read.nextLine();

        System.out.println(isFloat(data));
    }

    /*public static boolean isFloat(String txt)
    {
        
    }*/

}
