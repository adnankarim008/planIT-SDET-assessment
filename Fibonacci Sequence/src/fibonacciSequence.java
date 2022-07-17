import java.util.Scanner;

public class fibonacciSequence {
	public static Scanner userInput = new Scanner(System.in);
	
	static void findNthFibonacci() {
		System.out.print("Enter n to find the nth Fibonacci number\n$");
		String userResponse = userInput.nextLine();
		int n= Integer.parseInt(userResponse);
		System.out.println(fib(n)+"\n");
		
	}
	static int fib (int n) {
		if(n <=1)
			return n;
		return fib(n-1) + fib(n-2);
	
	}
	
	static void findWhetherFibonacci() {
		System.out.print("Enter number to find whether it is a fibonaci sequence. If not, you will get the closest fiboacci number.\n$");
		String userResponse = userInput.nextLine();
		int n= Integer.parseInt(userResponse);
		responseObject output = isFib(n,0,1,1);
		System.out.println(output);
	}
	
	static responseObject isFib(int n,int previousFib,int currentFib, int index ) {
		int nextFib = previousFib + currentFib;
		if(n==0 ||  n<0)
			return new responseObject(false,index);
		else if(n == currentFib )
			return new responseObject(true,index);
		else if(n > currentFib)
			return isFib(n, currentFib, nextFib, index+1);
		else
		{
			int left = n - previousFib;
			int right = currentFib - n;
			if(left>right)
				return new responseObject(false,index);
			return new responseObject(false,index-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userResponse;
	
		System.out.print("Welcome to the Fibonacci program.\n");
		do {
			System.out.print("Type 1 to find the nth Fibonacci number\nType 2 to know whether it is a fibonacci number\nType exit to quit\n$");
			userResponse = userInput.nextLine();
            
            try {
                if (userResponse.equals("1")) {
                	findNthFibonacci();
                    
                } else if (userResponse.equals("2")) {
                    
                    findWhetherFibonacci();
                  
             
                } else if (userResponse.equals("exit"))
                    continue;
                else
                    throw new Exception("'" + userResponse + "'" + " is not a valid command.");
            } catch (Exception e) {
                String message = e.getMessage();
                System.out.println(message);
                System.out.print("\n$");
            }
        }
        while (!userResponse.equals("exit"));
        System.out.println();

	}

}
