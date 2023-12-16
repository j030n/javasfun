import java.util.Scanner;

public class Floats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double numS = sc.nextDouble();

        if (numS == 0) {
            System.out.println("zero");
        } else if (numS > 0) {
            System.out.print("positive");
            if (Math.abs(numS) < 1) {
                System.out.print(" small");
            } else if (numS > 1000000) {
                System.out.print(" large");
            }
            System.out.println();
        } else {
            System.out.print("negative");
            if (Math.abs(numS) < 1) {
                System.out.print(" small");
            } else if (Math.abs(numS) > 1000000) {
                System.out.print(" large");
            }
            System.out.println();
        }
        	sc.close();
	}

}
