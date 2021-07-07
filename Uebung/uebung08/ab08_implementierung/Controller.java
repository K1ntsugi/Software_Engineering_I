public class Controller {

    public void run() {
        View v = new View();
        Modell m = new Modell();
        int returnGetInput = v.getInput();
        int outputVal = m.quadrieren(returnGetInput);
        v.userOutput(outputVal);
    }

    
}

