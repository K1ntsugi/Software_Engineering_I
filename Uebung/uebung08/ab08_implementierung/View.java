import java.util.Scanner;

public class View{
    public int getInput(){
        Scanner read = new Scanner(System.in);
        System.out.println("Bitte Ganzzahl zur Quadrierung eingeben: ");
        return read.nextInt();
    }

    public void userOutput(int i) {
        System.out.println("Das Quadrat ihrer Zahl lautet: " + i);
    }
}