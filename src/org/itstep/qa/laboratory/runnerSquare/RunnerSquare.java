package org.itstep.qa.laboratory.runnerSquare;


import org.itstep.qa.laboratory.square.Square;

public class RunnerSquare {

    public static void main (String [] args) {
        Square square = new Square (2);
        System.out.println(square.getSquare());
        square.largeSquare(2);
        System.out.println(square.getSquare());
    }
}
