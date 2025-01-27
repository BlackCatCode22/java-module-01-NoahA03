// Char Details //
// 1/26/25 //

import java.util.Scanner;

public class CharDetails {
    public static void main(String[] args) {
        System.out.println("Give me any character:");
        Scanner sc = new Scanner(System.in);
        char character = sc.next().charAt(0);
        int unicode = (int) character;

        boolean letter = Character.isLetter(character);
        boolean digit = Character.isDigit(character);

        if (letter) {
            System.out.println("This character is a letter, the unicode is " + unicode);
        }
        else if (digit) {
            System.out.println("This character is a digit, the unicode is " + unicode);
        }
        else {
            System.out.println("This character is neither, the unicode is " + unicode);
        }

    }
}