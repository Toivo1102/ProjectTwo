package org.itstep.qa.constructor.one;

public class Test {

    public  static void  main (String [] args){
        Rectangle rectangleOne = new  Rectangle (1,5,6,9);
        Rectangle rectangleTwo = new Rectangle(2,6);
        Rectangle rectangleThree = new Rectangle();

        System.out.println(rectangleOne);
        System.out.println(rectangleTwo);
        System.out.println(rectangleThree);
    }
}
