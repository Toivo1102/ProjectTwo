package org.itstep.qa.laboratoryWork.runnerLaboratory;

import org.itstep.qa.laboratoryWork.laboratory.FieldDream;

import java.util.Arrays;

public class RunnerFieldDream {
    public static void main(String[] args) {
        int[] number = {100, 250, 500, 750, 1000, 1250, 1500, 1750, 2000, 2250};
        FieldDream fieldDream = new FieldDream(number);
        System.out.println(Arrays.toString(fieldDream.getField()));

        for (int i = 0; i < 3; i++) {
            System.out.println(fieldDream.getRandom());
        }
    }

}
