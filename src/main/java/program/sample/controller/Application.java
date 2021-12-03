package program.sample.controller;

import java.util.*;

class Calculator {

    public int add(int i, int j) {
        System.out.println("Addition of " + i + "," + j + " is: " + (i + j));
        return i + j;
    }

    public int mul(int i, int j) {
        System.out.println("Multiplication of " + i + "," + j + " is: " + (i * j));
        return i * j;
    }

    public int sub(int i, int j) {
        System.out.println("Subtraction of " + i + "," + j + " is: " + (i - j));
        return i - j;
    }

    public double div(double i, double j) {
        if (j != 0) {
            System.out.println("Division of " + i + "," + j + " is: " + (i / j));
            return i / j;
        } else {
            System.out.println("Division with 0 is not possible");
            return 0;
        }
    }
}

public class Application {
    public static void main(String[] args) {
    	char operator;
        System.out.println("Simple Calculator");
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Choose an operator: +, -, *, or /");
        operator = sc.next().charAt(0);
        
        switch (operator) {

          // performs addition between numbers
          case '+':
        	  cal.add(a, b);
            break;

          // performs subtraction between numbers
          case '-':
        	  cal.sub(a, b);
            break;

          // performs multiplication between numbers
          case '*':
        	  cal.mul(a, b);
            break;

          // performs division between numbers
          case '/':
        	  cal.div(a, b);
            break;

          default:
            System.out.println("Invalid operator!");
            break;
        }
         sc.close();
    }
}
