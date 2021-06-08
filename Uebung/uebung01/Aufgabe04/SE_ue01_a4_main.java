//package Uebung.uebung01.Aufgabe04;

import java.util.Scanner;

public class SE_ue01_a4_main {

    public static void main(String[] args) {

        Scanner pangramm = new Scanner(System.in);
        System.out.println("Prüfe ob Eingabe ein Pangramm ist: ");
        String check = pangramm.nextLine();//"Jeder wackere Bayer vertilgt bequem zwo Pfund Kalbshaxen.";
        pangramm.close();

        System.out.println(check);

        if (isDirtyPangramm(check)) {
            System.out.println("Der Satz ist ein Pangramm");
            return;
        }

        System.out.println("Der Satz ist kein Pangramm");

    }

    public static boolean isPangramSentence(String txt) {

        if (txt.length() < 28 || !txt.contains(" ")) {
            return false;
        } else if (!Character.isUpperCase(txt.charAt(0))) {
            return false;
        } else if (!(txt.charAt(txt.length() - 1) == '?') && !(txt.charAt(txt.length() - 1) == '!')
                && !(txt.charAt(txt.length() - 1) == '.')) {
            return false;
        }

        return true;
    }

    public static boolean isDirtyPangramm(String txt) {
        if (!isPangramSentence(txt)) {
            return false;
        }

        String alphabetString = new String("abcdefghijklmnopqrstuvwxyz");

        txt = txt.toLowerCase();

        for (int i = 0; i < alphabetString.length(); i++)
        {
            if (!txt.contains(Character.toString(alphabetString.charAt(i))))
            {
                return false;
            }
        }

        return true;
    }

}
