public class Automat {

    enum State {
        State0, State1, State2, State3, State4, State5, State6
    }

    private State state;

    public Automat() {
        state = State.State0;
    }

    public void pressKettenkarusell() {
        switch (state) {
        case State0:
            state = State.State1;
            System.out.println("KettenKarusell");
            break;
        case State1:
        case State2:
        case State3:
        case State4:
        case State5:
        case State6:
        default:
            System.err.println("Error: Zustand undefiniert");
            break;

        }
    }

    public void pressAchterbahn() {
        switch (state) {
        case State0:
            state = State.State2;
            System.out.println("Achterbahn");
            break;
        case State1:
        case State2:
        case State3:
        case State4:
        case State5:
        case State6:
        default:
            System.err.println("Error: Zustand undefiniert");
            break;

        }
    }

    public void pressExtrarunde() {
        switch (state) {
        case State0:
        case State1:
            break;
        case State2:
            state = State.State3;
            System.out.println("KettenKarusell + Achterbahn");
            break;
        case State3:
        case State4:
        case State5:
        case State6:
        default:
            System.err.println("Error: Zustand undefiniert");
            break;

        }
    }

    public void insert50Cent() {
        switch (state) {
        case State0:
            System.out.println("Ausgabe Karusell: 50 Cent Rückgabe");
            break;
        case State1:
            state = State.State0;
            System.out.println("Rückgabeticket KettenKarusell");
            break;
        case State2:
            state = State.State4;
            break;
        case State3:
            state = State.State5;
            break;
        case State4:
            state = State.State0;
            System.out.println("Ticket Achterbahn");
            ;
            break;
        case State5:
            state = State.State6;
            break;
        case State6:
            state = State.State0;
            System.out.println("Ticket Extrarunde");
            ;
            break;
        default:
            System.err.println("Error: Zustand undefiniert");
            break;

        }
    }

    public void insert1Euro() {
        switch (state) {
        case State0:
            System.out.println("Ausgabe Karusell: 50 Cent Rückgabe");
            break;
        case State1:
            state = State.State0;
            System.out.println("Ausgabe: Karuesell + 50 Cent");
            break;
        case State2:
            state = State.State0;
            System.out.println("Ausgabe: Achterbahn, 1€");
            break;
        case State3:
            state = State.State6;
            break;
        case State4:
            state = State.State0;
            System.out.println("Ausgabe: Karuesell + 50 Cent");
            break;
        case State5:
            state = State.State0;
            System.out.println("Ausgabe: Extrarunde");
        case State6:
            state = State.State0;
            System.out.println("Ausgabe: Extrarunde + 50 Cent");
        default:
            System.err.println("Error: Zustand undefiniert");
            break;

        }
    }

    public void pressCancel() {
        switch (state) {
        case State0:
            break;
        case State1:
        case State2:
        case State3:
            state = State.State0;
            System.err.println("Abbruch");
            break;
        case State4:
        case State5:
            state = State.State0;
            System.err.println("Abbruch + 50 Cent Rückgeld");
            break;
        case State6:
            state = State.State0;
            System.err.println("Abbruch + Rückgabe 1€");
            break;
        default:
            System.err.println("Error: Zustand undefiniert");
            break;

        }
    }

}
