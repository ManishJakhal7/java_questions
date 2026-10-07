import java.util.Scanner;

public class Type{
	public static int sumOfDigit(int a, int b){
  	return a+b;
  }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    // int x = sc.nextInt();  
	    int a  = 10;
	    int b = 6;
	   int sum = sumOfDigit(a,b);
	   System.out.print(sum);
	}
}
