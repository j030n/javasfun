import java.util.Scanner;

public class Car {
	
	public static void main(String[] args) {
		// Reader
		Scanner goHome = new Scanner(System.in);
		
		//Question
		System.out.println("How many miles per hour is too many?");
		
		//Input
		int poPo = goHome.nextInt();
			
		//Determine speed trap miles
		if (poPo <= 75){
			
			//Output
			System.out.println("You might want to slow down a bit...");
			} else {
				System.out.println(poPo + " MPH??? *squints*...the sheriff is right there!?");
			}
		
	}

}