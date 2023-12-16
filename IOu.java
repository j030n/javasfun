import java.util.Scanner;
import java.lang.Math;


public class IOu {

	public static void main(String[] args) {
		Scanner hEar = new Scanner(System.in);

	
		//1
		System.out.println("Enter circle radius:");
	    int r = hEar.nextInt();
	    
	    double pi = Math.PI;
	    double cir = (2*pi*r);
	    double area = pi*r;
	    
	    System.out.println("Circumference: " + cir + "\n" + "Area: " + area);
	

	
		//2
	    System.out.println("Provide 3 numbers: ");
	    double a = hEar.nextInt();
	    double b = hEar.nextInt();
	    double c = hEar.nextInt();
	    
	    double s = (a+b+c)/2;
	    double triArea = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	    
	    System.out.println(triArea);
	


		 //3
	    System.out.println("Enter Celsius: ");
	    double y = hEar.nextInt();
	    double fah = 1.8*y + 32;
	    
	    System.out.println(y + " degrees in Celsius is equilavent to " + fah + " degrees in Fahrenheit");
	

	    
		//4
	    System.out.println("How much sq footage needs paint? What is the width?");
	    int d = hEar.nextInt();
	    System.out.println("Height?");
	    int e = hEar.nextInt();
	    System.out.println("Length?");
	    int f = hEar.nextInt();
	    System.out.println("How many doors?");
	    int doors = hEar.nextInt()*20;
	    System.out.println("How many windows?");
	    int windows = hEar.nextInt()*15;
	    int noFloor = ((d*e*f)/4)*3;
	    int total = (noFloor - (doors+windows)); 
	    int paint = total/350;
	    
	    System.out.println("You should need " + paint + " gallons of paint.");
	    
	    //5
	    System.out.print("Enter seconds: ");
        int sec = hEar.nextInt();
        
        int hours = sec / 3600;
        int minutes = (sec % hours) / 60;
        int oSec = sec % 60;
        
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + oSec);
	
	    hEar.close();
	
	}
}
