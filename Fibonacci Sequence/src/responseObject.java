
public class responseObject {
	boolean isFibonacci;
	int closestFibonacciIndex;
	
	responseObject(boolean isFibonacci,int closestFibonacci){
		this.closestFibonacciIndex = closestFibonacci;
		this.isFibonacci = isFibonacci;
	}
	
	public String toString() {
		
		if(isFibonacci) {
			return "Yes it's a Fibonacci number\n";
		}
		else
			return "No,it's not a fiboacci number and the closest number is in index "+ closestFibonacciIndex + "\n";
	
	}
	
}
