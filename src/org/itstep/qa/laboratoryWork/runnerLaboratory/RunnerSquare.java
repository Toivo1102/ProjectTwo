package org.itstep.qa.laboratoryWork.runnerLaboratory;


import org.itstep.qa.laboratoryWork.laboratory.Square;

public class RunnerSquare {

    public static void main (String [] args) {
        Square square = new Square (2);
        System.out.println(square.getSquare());
        square.largeSquare(2);
        System.out.println(square.getSquare());
    }
}
