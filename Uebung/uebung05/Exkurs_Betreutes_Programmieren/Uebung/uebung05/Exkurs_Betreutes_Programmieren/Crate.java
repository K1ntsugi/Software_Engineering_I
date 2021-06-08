package Uebung.uebung05.Exkurs_Betreutes_Programmieren;

import java.util.ArrayDeque;

public class Crate {

    private int quantity;
    private ArrayDeque<Bottle> bottles;

    public Crate(int quantity) {
        switch (quantity) {
            case 6:
                this.quantity = 6;
                break;
            case 10:
                this.quantity = 10;
                break;
            case 20:
                this.quantity = 20;
                break;
            default:
                this.quantity = 20;
                System.out.println("Quantity not in Range. Default quantity set to 20");
        }

        System.out.println("A crate for " + this.quantity + "bottles of beer!");
        bottles = new ArrayDeque<Bottle>();
    }

    public boolean isEmpty() {
        return bottles.isEmpty();
    }

    public int howMuchLeft() {
        return bottles.size();
    }

    public Bottle takeOut() {
        if (bottles.isEmpty()) {
            return null;
        } else {
            return bottles.pop();
        }

    }

    public boolean putIn(Bottle b) {
        if (bottles.size() == this.quantity) {
            return false;
        } else {
            bottles.push(b);
            return true;
        }
    }

}
