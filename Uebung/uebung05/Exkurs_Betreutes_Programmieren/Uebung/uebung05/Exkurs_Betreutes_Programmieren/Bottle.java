package Uebung.uebung05.Exkurs_Betreutes_Programmieren;

public class Bottle {

    private String brand;
    private boolean uncapped = false;
    private double volume = 0.5;

    public Bottle() {
        this.brand = "Guinness";
        System.out.println("Freshly tapped beer! Cheers!");
    }

    public Bottle(String brand) {
        super();
        this.brand = brand;
    }

    public boolean isUncapped() {
        return this.uncapped;
    }

    public double howMuchLeft() {
        return this.volume;
    }

    public void uncap() {
        if (this.uncapped == false) {
            this.uncapped = true;
            System.out.println("Uncapping good fresh " + this.brand);
        }

    }

    public boolean isEmpty() {
        if (this.volume == 0.0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean takeSip() {
        if (isUncapped() && isEmpty()) {
            this.volume -= 0.1;
            System.out.println("Swig !");
            return true;
        } else {
            System.out.println("Bottle is either capped or empty.");
            return false;
        }
    }

}