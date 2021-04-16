package Vrl.sandbox;

import java.util.function.IntBinaryOperator;

public class TestLambda {

    public static void main(String[] args) {

        MyInterface s1 = () -> "Hello";
        System.out.println(s1.sayHello());

        s1 = () -> "Geh weg";
        System.out.println(s1.sayHello());

        MyInterface s2 = () -> {return "Test";};
        System.out.println(s2.sayHello());

        MyMath m1 = x -> {return 2*x;};
        System.out.println(m1.compute(8));

        //##############################################//

        IntBinaryOperator op;
        op = (x, y) -> {return x+y;};
        fancyOutput(op, 4, 6); 
        
    }

    public static void fancyOutput(IntBinaryOperator op, int x, int y)
    {
        System.out.println(op.applyAsInt(x, y));
    }



}
