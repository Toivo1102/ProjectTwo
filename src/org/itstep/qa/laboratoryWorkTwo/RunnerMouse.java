package org.itstep.qa.laboratoryWorkTwo;

import org.itstep.qa.methods.method.Random;

public class RunnerMouse {
    public static void main (String [] args) {

    /*    Bunsh bunshOne = new Bunsh("Зеленый");
        Bunsh bunshTwo = new Bunsh("Красный");
        Bunsh bunshThree = new Bunsh("Фиолетовый");
        Bunsh bunshFore = new Bunsh("Желтый");
        Bunsh bunshFive = new Bunsh("Черный");
        Bunsh bunshSix = new Bunsh("Коричневый");
        Bunsh bunshSeven = new Bunsh("Бежевый");
        Bunsh bunshEight = new Bunsh("Коралловый");
        Bunsh bunshNine = new Bunsh("Пурпурный");
        Bunsh bunshTen = new Bunsh("Розовый");
        Bunsh bunshEleven = new Bunsh("Голубой");
        Bunsh bunshTwelve = new Bunsh("Оранжевый");
        Bunsh bunshThirteen = new Bunsh("Малиновый");
        Bunsh bunshFourteen = new Bunsh("Серый");
        Bunsh bunshFifteen = new Bunsh("Сиреневый");
        Bunsh bunshSixteen = new Bunsh("Салатовый");
        Bunsh bunshSeventeen = new Bunsh("Бирюзовый");
        Bunsh bunshEighteen = new Bunsh("Серо-буро-малиновый");
  */
        Bunsh [] bunshes = new Bunsh[18];
        bunshes [0] = new Bunsh();
            bunshes [0].coordinateX();
            bunshes [0].coordinateY();
            bunshes [0].setColorBunsh("Зеленый");
        bunshes [0] = new Bunsh();
        bunshes [0].coordinateX();
        bunshes [0].coordinateY();
        bunshes [0].setColorBunsh("Зеленый");




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
