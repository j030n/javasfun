
public class VarABCs {
	int C;
	int A;
	int B = 50;
	String variaBle;
	String variNotable;
	String noM = "not avail";
	  
	public void variaBle() {
		if (C > 3) {
		        //addition
		C = A + B;
		System.out.print("I'm ");
		}
				//subtraction
		C = A - B;{
			System.out.print("Very ");
		}
				//multiplication
		C = A * B ;{
			System.out.print("T");
		}
				//division float variable
	    C = A  / B ;{
	    	System.out.print("I");
	    }
	    		//modulus
		C = A % B ;{
			System.out.print("R");
		}
				//exponential
		C = A ^ B ;{
			System.out.print("E");
		}
				//increment
	    C = A++;{
	    	System.out.print("D");
	    }
	    		//decrement
		C = B--;{
			System.out.print("!");
		}
		
	System.out.println("it works if true");
	}
	
	public void variNotable() {
		if (C < 30) {
		}
	}
	
	public static void main(String[] args) {
		VarABCs printThem = new VarABCs();
		printThem.A = 5;
		printThem.variaBle();
		printThem.variNotable();
	}

}
