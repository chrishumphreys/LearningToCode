package com.example.intro;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloWorldVariables2 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(DateTimeFormatter.ISO_DATE.format(now));

        BigDecimal gross = new BigDecimal("1234.99");
        System.out.println(gross);

        System.out.println("gross: " + currencyFormat(gross));

        BigDecimal vat = gross.multiply(new BigDecimal("0.2"));
        BigDecimal net = gross.subtract(vat);

        System.out.println("vat: " + currencyFormat(vat));
        System.out.println("Net : " + currencyFormat(net));
    }

    public static String currencyFormat(BigDecimal n) {
        return NumberFormat.getCurrencyInstance().format(n);
    }
}
