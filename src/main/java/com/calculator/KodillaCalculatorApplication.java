package com.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCalculatorApplication {

    public static void main(String[] args) {
//        SpringApplication.run(KodillaCalculatorApplication.class, args);

        Calculator calculator = new Calculator();
        calculator.addAtoB(3, 39);
        calculator.divideAfromB(97, 494);
    }
}
