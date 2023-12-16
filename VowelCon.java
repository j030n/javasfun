import java.util.*;
import java.lang.*;

public class VowelCon {

	public static void main(String[] args) {
	Scanner userChar = new Scanner(System.in);
		        
		        	System.out.print("Enter a letter in the alphabet: ");
		        	String input = userChar.nextLine();
		        
		        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
		            System.out.println("Error: Please enter a single alphabetic character.");
		        
		        	for (userChar.isVowel(char c)) {
		        switch (Character.toLowerCase(c);
		            case 'a':
		            case 'e':
		            case 'i':
		            case 'o':
		            case 'u':
		                return true;
		                default:
		                return false;
		            char c = input.charAt(0){
		            if (isVowel(c)) {
		                System.out.println(c + " is a vowel.");
		            } else {
		                System.out.println(c + " is a consonant.");
		            }
		        }
		    
		    
		    
		    //4
		    System.out.print("Enter a number between 1 and 7: ");
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
	        
	        //5
	        System.out.print("Enter an odd integer less than 10: ");
	        int p = userChar.nextInt();
	        
	        if (p % 2 == 0 || p < 1 || p > 9) {
	            System.out.println("Error: Please enter an odd integer less than 10.");
	        } else {
	            int middleRow = p / 2 + 1;
	            
	            for (int i = 1; i <= p; i++) {
	                int numStars = i <= middleRow ? 2 * i - 1 : 2 * (p - i) + 1;
	                int numSpaces = (p - numStars) / 2;
	                
	                for (int j = 1; j <= numSpaces; j++) {
	                    System.out.print(" ");
	                }
	                for (int j = 1; j <= numStars; j++) {
	                    System.out.print("*");
	                }
	                System.out.println();
	            }
	        }
		  }
	        userChar.close();
	}
}
