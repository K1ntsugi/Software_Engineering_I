import java.util.Scanner;

public class UserInput {

    private static final Automat automat = new Automat();

    public static void main(String[] args) {

        System.out.println("Willkommen an Ihrem Ticketautomaten im Freizeitpark XYZ");
        System.out.println("0: Drücke Cancel");
        System.out.println("1: Drücke Kettenkarussell");
        System.out.println("2: Drücke Achterbahn");
        System.out.println("3: Drücke Extrarunde");
        System.out.println("4: Werfe 50 Cent ein");
        System.out.println("5: Werfe 1 Euro ein");
        System.out.println("9: Programm beenden");
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Welche Aktion wollen Sie ausführen?");

            int choice = scanner.nextInt();
            switch (choice) {
            case 0:
                automat.pressCancel();
                break;
            case 1:
                automat.pressKettenkarusell();
                break;
            case 2:
                automat.pressAchterbahn();
                break;
            case 3:
                automat.pressExtrarunde();
                break;
            case 4:
                automat.insert50Cent();
                break;
            case 5:
                automat.insert1Euro();
                break;
            case 9:
                System.exit(0);
                break;
            default:
            }

        }

    }

}
