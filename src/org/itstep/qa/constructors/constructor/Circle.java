package org.itstep.qa.constructors.constructor;

public class Circle {
    private int rad;

    public Circle(int rad) {
        this.rad = rad;
    }

    public double getCircle() {
        return 2 * Math.PI * rad;  // узнать длину окружности
    }
}
