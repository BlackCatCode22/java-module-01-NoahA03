// SimpleInterest.java
// 1/26/25

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Interest Calculator");
        System.out.print("Enter principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter time: ");
        double time = sc.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + simpleInterest);

        sc.close();
    }
}
