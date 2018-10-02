package org.itstep.qa.runnerMethods;

import org.itstep.qa.methods.Arrays;

public class RunnerArrays {
    public static void  main (String[] args) {
        Arrays arrays = new Arrays();
        int [] a = {9, 2, 1, 4};
        System.out.println(java.util.Arrays.toString(a));
        System.out.println(java.util.Arrays.toString(arrays.sortArray (a)));
    }


}
