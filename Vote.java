import java.util.Scanner;
import java.time.LocalDate;
public class Vote {

	public static void main(String[] args) {
		//
		Scanner ageScan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = ageScan.nextInt();

        LocalDate bDay = LocalDate.now().minusYears(age);
        LocalDate canVote = LocalDate.of(2020, 3, 11);

        if (bDay.isBefore(canVote)){
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        ageScan.close();
     }
}
