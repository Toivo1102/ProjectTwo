package org.itstep.qa.constructors.runnerConstructor;

import org.itstep.qa.methods.method.Circle;

public class RunnerCircle {
    public static void main (String [] args) {
        Circle circle = new Circle (1);
        System.out.println(circle.getCircle(5));
    }
}
