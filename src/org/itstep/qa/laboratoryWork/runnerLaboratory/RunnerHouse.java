package org.itstep.qa.laboratoryWork.runnerLaboratory;

import org.itstep.qa.laboratoryWork.laboratory.House;

public class RunnerHouse {
    public static void main (String [] args) {
        House houseOne = new House(3,9, "Дворец");
        House houseTwo = new House(6,5, "Колизей");
        House houseThree = new House(5,1, "Иглу");

        houseOne.move(3,6);
        houseOne.getinformation();

        houseTwo.move(6,8);
        houseTwo.getinformation();

        houseThree.move(5,5);
        houseThree.getinformation();

    }
}
