package com.microservices.credit.account;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class CreditService {
    private static final BigDecimal minValue = new BigDecimal(BigInteger.ONE); 
    private static final BigDecimal maxValue = new BigDecimal(BigInteger.TEN); 

    public List<Credit> list() {
        int numberOfCredit = new Random().nextInt(10) + 1;
        List<Credit> creditList = new ArrayList<Credit>(10);
        for (int i = 0; i < numberOfCredit; i++) {
            BigDecimal randomValue = minValue.add(
                new BigDecimal(Math.random()).multiply(maxValue.subtract(minValue))
                ).setScale(1, BigDecimal.ROUND_HALF_UP);
            Credit credit = new Credit(randomValue);
            creditList.add(credit);
        }
        System.out.println("creditList: " + creditList);
        return creditList;
    }
}
