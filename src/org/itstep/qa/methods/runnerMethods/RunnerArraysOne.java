package org.itstep.qa.methods.runnerMethods;

import org.itstep.qa.methods.method.ArraysOne;

import java.util.Arrays;

public class RunnerArraysOne {
    public static void main(String[] args) {
        double[] first = {1, 2, 3, 4};
        ArraysOne arraysOne = new ArraysOne();
        System.out.println(Arrays.toString(arraysOne.getArray(first)));
    }

}
