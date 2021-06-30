public class Controller extends MVC implements Modell{

    public void runController() {
        int x;
        View v = new View();
        x = v.getInput();
        int outputVal = quadrieren(x);
        v.userOutput(outputVal);
    }

    @Override
    public int quadrieren(int i) {
        return i*i;
    }
}

