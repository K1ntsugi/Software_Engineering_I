package Uebung.uebung05.Exkurs_Betreutes_Programmieren;

public class BeerDrunkardApp {
    public static void main(String[] args) {
        fillCrate(10);
    }

    public static Crate fillCrate(int howMany) {
        Crate newCrate = new Crate(howMany);
        for (int i = 0; i < howMany; i++) {
            Bottle bot = new Bottle();
            newCrate.putIn(bot);
        }
        return newCrate;
    }

}
