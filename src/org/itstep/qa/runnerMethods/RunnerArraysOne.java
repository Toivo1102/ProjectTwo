package org.itstep.qa.runnerMethods;

import org.itstep.qa.methods.ArraysOne;

import java.util.Arrays;

public class RunnerArraysOne {
    public static void main(String[] args) {
        double[] first = {1, 2, 3, 4};
        ArraysOne arraysOne = new ArraysOne();
        System.out.println(Arrays.toString(arraysOne.getArray(first)));
    }

}
