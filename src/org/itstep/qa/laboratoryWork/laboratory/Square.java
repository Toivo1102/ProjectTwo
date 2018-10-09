package org.itstep.qa.laboratoryWork.laboratory;


public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
        this.side = 0;
    }


    public double getSquare() {
        return side * side;
    }

    public void largeSquare(int factor) {
              side = Math.sqrt(factor);
    }

}
