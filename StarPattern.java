import java.util.Scanner;
public class StarPattern{
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
         n = sc.nextInt();
         for(int i=0; i<n; i++){
         	for(int space =0; space<i; space++){
         		System.out.print("  ");
         	}
         	for(int j = (n+2)-2*i; j>0; j--){
         		System.out.print("* ");
         	}
         	System.out.println();
         }
	}
}