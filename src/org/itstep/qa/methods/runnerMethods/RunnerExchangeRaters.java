package org.itstep.qa.methods.runnerMethods;

import org.itstep.qa.methods.method.ExchangeRates;

public class RunnerExchangeRaters {

    public static void main(String[] args) {

        ExchangeRates exchangeRates = new ExchangeRates();

        System.out.println(exchangeRates.getUSD(6,9));
        System.out.println(exchangeRates.getUSD( 2, 8));
    }
}
