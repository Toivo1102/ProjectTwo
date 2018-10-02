package org.itstep.qa.methods;

public class Random {
    /*
Создать метод, который будет принимать два  целочисленных параметра a и b, будет
возвращать случайное целое число из отрезка [a;b]
 */
    public int getNumberFromInterval(int a, int b) {
        int result;
        java.util.Random random = new java.util.Random();

        result = random.nextInt(b - a) + a;

        return result;
    }

}
