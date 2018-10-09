package org.itstep.qa.constructors.runnerConstructor;

import org.itstep.qa.constructors.constructor.Box;

public class RunnerBox {

    public  static void  main (String [] args){
       Box boxOne = new Box(3,5,9);
       Box boxTwo = new Box(5);
        System.out.println(boxOne.getDepth());
        System.out.println(boxOne.getVolume());
        System.out.println(boxTwo.getVolume());
    }
}
