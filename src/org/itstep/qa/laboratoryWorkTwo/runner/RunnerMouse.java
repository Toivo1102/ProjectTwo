package org.itstep.qa.laboratoryWorkTwo.runner;

import org.itstep.qa.laboratoryWorkTwo.player.Bunsh;
import org.itstep.qa.laboratoryWorkTwo.player.Mouse;

import java.util.Arrays;

public class RunnerMouse {
    public static void main (String [] args) {

        String [] color = {"Зеленый", "Красный", "Фиолетовый", "Желтый", "Черный",
        "Коричневый", "Бежевый", "Коралловый", "Пурпурный", "Розовый", "Голубой",
        "Оранжевый", "Малиновый", "Малиновый", "Серый", "Сиреневый", "Салатовый",
        "Бирюзовый", "Серо-буро-малиновый"};

        Bunsh [] bunshes = new Bunsh[18];
        for (int i = 0; i < 18; i++) {
            bunshes[i].coordinateX();
            bunshes[i].coordinateY();
            bunshes[i].color();
        }


        System.out.println(Arrays.toString(bunshes));

        Mouse mouseOne = new Mouse(2, 6, "Апокалиптина");
        Mouse mouseTwo = new Mouse(5, 18 , "Варвара");

        mouseOne.getRun();
        mouseTwo.getRun();
/*
     while (true) {
                if ( ) {

                System.out.println("Победа");
                break;
            } else {
                if (inputValue < r && i < 5) {

                    System.out.println("Мало");

                } else if (inputValue > r && i < 5) {

                    System.out.println("Много");

                } else System.out.println("Проигрыш");


            }


        }
        */

    }
}
