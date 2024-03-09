package org.campus02;

public class ExceptionSyntax {

    public static void main(String[] args) {

        // Code
        System.out.println("code vor dem Exception Handling");
        try {
            // codeteil
            System.out.println("Bin im Try");
            doSomething();
        } catch (Exception e) {
            // Catch Block
            // reagiere auf Exception/Ausnahmesituation
            System.out.println("bin im catch");
        } finally {
            // wird immer ausgeführt
            System.out.println("finally -> immer da");
        }
        // Code
        System.out.println("Code nach dem Handling");

    }

    public static double divide(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception("division by 0 not allowed");
        }
        return a / b;
    }

    public static void doSomething() throws Exception {
        // weiterer programmcode
        System.out.println("doSomething");
        throw new Exception();
    }
}
