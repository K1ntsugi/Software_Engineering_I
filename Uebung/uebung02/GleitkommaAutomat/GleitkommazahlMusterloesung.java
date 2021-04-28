package GleitkommaAutomat;

import java.util.ArrayList;
import java.util.List;

public class Gleitkommazahl {
    enum State {
        State0, State1, State2, State3, State4, State5, State6, State7, State8, State9;
    }
    private State state;
    public Gleitkommazahl() {
        state = State.State0;
    }
    public void reset() {
        state = State.State0;
    }
    public static void main(String[] args) {
        Gleitkommazahl g = new Gleitkommazahl();
        List<String> inputs = new ArrayList<>();
        inputs.add("-1.0");
        inputs.add("+0");
        inputs.add("0e0");
        inputs.add("-23425.244e4");
        inputs.add("0.001e-2");
        inputs.add("-345.67e5");
        inputs.add("-0.000990e5");
        inputs.add("7e-5");
        inputs.add("-5.0.0");
        inputs.add("+.e4");
        inputs.add("+8.0e0");
        inputs.add(".4");
        for(String input: inputs) {
            for(int i = 0; i < input.length(); i++) {
                char read = input.charAt(i);
                switch (read) {
                    case '0':
                        g.read0();
                        break;
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        g.read1to9();
                        break;
                    case '+':
                    case '-':
                        g.readSign();
                        break;
                    case 'E':
                    case 'e':
                        g.readE();
                        break;
                    case '.':
                        g.readDot();
                        break;
                    default:
                        g.readOther();
                        break;
                }
            }
            if(g.acceptingState()) {
                System.out.println("Gültig: " + input);
            } else {
                System.out.println("Ungültig: " + input);
            }
            g.reset();
        }
    }

    public void read0() {
        //TODO
    }
    public void read1to9() {
        //TODO
    }
    public void readSign() {
        //TODO
    }
    public void readE() {
        //TODO
    }
    public void readDot() {
        //TODO
    }
    public void readOther() {
        //TODO
    }
    public boolean acceptingState() {
        return false;
        //TODO
    }
}