package org.itstep.qa.methods.method;

public class Circle {
    private int rad;

    public Circle(int rad) {
        this.rad = rad;
    }

    public double getCircle(int rad) {
        return 2 * Math.PI * rad;  // узнать длину окружности
    }
}

