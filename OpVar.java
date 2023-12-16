
public class OpVar {
	
	public static void main(String[] args) {
		VarOp myOp = new VarOp();
		VarABCs varOops = new VarABCs(); 
		// public change name
		
		int j = 3;
		int k = 4 + j;
		int lmN = k + 5;
		float o = 12.266f - lmN;
		boolean peep = false;
		
		myOp.hI = 0;
		peep = (o > myOp.hI); 
		
		//Variables operations
		myOp.opEr();
		myOp.iClose();
		System.out.println("Oh, I didn't know how this would look -> " + o);
		System.out.println("hi" + 5 + 10);
		
	
	}

}
