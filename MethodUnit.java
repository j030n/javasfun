
public class MethodUnit {
int a;
int b;
int c;
int n; 
int m;

	public static void main(String[] args) {}
	
		// 1 divisible boolean
		boolean isDivisible(){
		if (n % m == 0){
		return true;
		} else {
		return false;
		}
		
	}
		//2 conditional triangle boolean
		boolean isTriangle() {
		    if (a > b + c || b > a + c || c > a + b) {
		        return false;{
		    } else {
		    	return true;
		    }
		    
		//3 output true
		//		   true
		//         ping!
		//         pong!
		    
		//4
	    public static int oddSum(int n) {
	        if (n == 1) { // base case: when n is 1, return 1
	            return 1;
	        } else {
	            int sum = oddSum(n - 2); // recursive call with n-2
	            int result = sum + n; // add n to the sum
	            return result;
	        }
	    }

}

		

