package org.itstep.qa.constructors.runnerConstructor;

import org.itstep.qa.constructors.constructor.Rectangle;

public class Test {

    public  static void  main (String [] args){
        Rectangle rectangleOne = new  Rectangle (1,5,6,9);
        Rectangle rectangleTwo = new Rectangle(2,6);
        Rectangle rectangleThree = new Rectangle();

        rectangleOne.rectPrint();
        rectangleTwo.rectPrint();
        rectangleThree.rectPrint();

        rectangleOne.move(2,6);
        rectangleThree.move(2,6);
        rectangleTwo.move(2,6);

        rectangleOne.rectPrint();
        rectangleTwo.rectPrint();
        rectangleThree.rectPrint();

        //rectangleOne
    }
}