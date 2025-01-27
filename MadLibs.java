// MadLibs.java
// 1/26/25

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] words = new String[3];

        System.out.println("Give me a noun.");
        words[0] = sc.next();

        System.out.println("Give me a verb.");
        words[1] = sc.next();

        System.out.println("Give me an adjective.");
        words[2] = sc.next();

        System.out.println("The " + words[0] + " " + words[1] + " in a way that seemed " + words[2] + ".");


    }
}