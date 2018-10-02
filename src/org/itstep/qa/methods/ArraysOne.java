package org.itstep.qa.methods;

public class ArraysOne {
     /*
Напишите метод, увеличивающий элементы массива на 10%.
 */

    public double[] getArray(double[] first) {
        for (int i = 0; i < first.length; i++) {
            first[i] = first[i] * 1.1;
        }
        return first;
    }

}
