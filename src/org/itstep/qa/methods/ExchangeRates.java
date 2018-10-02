package org.itstep.qa.methods;

public class ExchangeRates {
   private int byn;
   private double course;


    public double getUSD(int byn, int course) {

        return byn * course;
    }
}

