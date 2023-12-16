import java.util.*;

public class VowelConstants {
		

    public static void main(String[] args) {
        Scanner userChar = new Scanner(System.in);

        System.out.print("Enter a letter in the alphabet: ");
        String input = userChar.nextLine();

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Please enter a single alphabetic character.");
        } else {
            char c = input.charAt(0);
            if (isVowel(c)) {
                System.out.println(c + " is a vowel.");
            } else {
                System.out.println(c + " is a consonant.");
            }
        }

        System.out.println("Enter a number between 1 and 7: ");
        int n = userChar.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.print("Enter an odd integer less than 10: ");
        int p = userChar.nextInt();

        if (p % 2 == 0 || p < 1 || p > 9) {
            System.out.println("Error: Please enter an odd integer less than 10.");
        } else {
            int middleRow = p / 2;
            for (int i = 0; i < p; i++) {
                int numSpaces = Math.abs(middleRow - i);
                int numStars = p - 2 * numSpaces;
                for (int j = 0; j < numSpaces; j++) {
                    System.out.println(" ");
                }
                for (int j = 0; j < numStars; j++) {
                    System.out.println("*");
                }
                System.out.println();
            }
        }

        userChar.close();
    }

	private static boolean isVowel(char c) {
		return false;
	}

}
