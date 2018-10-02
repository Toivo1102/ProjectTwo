package org.itstep.qa.methods.runnerMethods;

import org.itstep.qa.methods.method.Random;

public class RunnerRandom {
    public static void  main (String[] args) {
        Random random = new Random();
        System.out.println(random.getNumberFromInterval(-5, 10));
    }

}
