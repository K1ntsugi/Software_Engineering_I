package Uebung.uebung01.Aufgabe01;

public class SE_ue01_a1_main {
    public static void main(String[] args) {

        try {
            int[] case01 = { 1, 1, -1, 2 }; // false
            int[] case02 = { 21, 21, 0, 1, -1, 42 }; // true
            int[] case03 = { 21, -42, 21, 0 }; // true
            int[] case04 = { 21, -42, 0, 21 }; // false

            boolean c1 = canDevideArray(case01);
            System.out.println("Case 1 gibt " + c1 + " zurück.");

            boolean c2 = canDevideArray(case02);
            System.out.println("Case 2 gibt " + c2 + " zurück.");

            boolean c3 = canDevideArray(case03);
            System.out.println("Case 3 gibt " + c3 + " zurück.");

            boolean c4 = canDevideArray(case04);
            System.out.println("Case 4 gibt " + c4 + " zurück.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static boolean canDevideArray(int[] arr) throws Exception {

        if (arr == null) {
            throw new Exception("Array ist Null");
        }

        if (arr.length <= 1) {
            throw new Exception("Der Array enthält kein oder nur 1 Element");
        }

        for (int marker = 0; marker < arr.length - 1; marker++) {
            int leftsum = 0;
    
            for (int j = 0; j <= marker; j++) {
                leftsum += arr[j];
            }
            int rightsum = 0;
            for (int j = marker + 1; j < arr.length; j++) {
                rightsum += arr[j];
            }
            if (leftsum == rightsum) {
                return true;
            }
        }

        return false;

    }
}