// Simple Calculator //
// 1/26/25 //

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter First Number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter Second Number: ");
        double num2 = scanner.nextDouble();

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;

        System.out.println("Your calculations for " + num1 + " and " + num2 + " are:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }
}