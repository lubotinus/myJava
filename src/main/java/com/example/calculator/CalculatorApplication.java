package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class Calculator {
    int a;
    int b;

    public Calculator (int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void adDition() {
      System.out.println("a + b = " + (a+b));
    }
    public void suBstraction(){
        System.out.println("a - b = " + (a-b));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(2,4);
        calculator.adDition();
        calculator.suBstraction();
    }

}
