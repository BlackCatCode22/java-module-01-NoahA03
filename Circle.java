// Circle Area //
// 1/26/25 //

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Circle Radius: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;

        System.out.println("The area of a circle with the radius of " + radius + " is " + area);
    }
}