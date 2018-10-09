package org.itstep.qa.laboratoryWork.laboratory;

import org.itstep.qa.methods.method.Random;

public class FieldDream {
    private int[] field;

    public FieldDream (int [] field) {
        this.field = field;
    }
    public int [] getField() {
       return field;
    }

    public int getRandom() {

        java.util.Random random = new java.util.Random();
        int randomIndex = random.nextInt(field.length);
        return field[randomIndex];

    }


}
