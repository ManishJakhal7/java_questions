import java.util.Scanner;
public class DecimalConversion{
    // A B C D E ...  10
       static int DecimalConversion(int num, int b){
       int result = 0;
       int base = 1;
       while(num > 0){
           int remainder = num % 10; 
           result = result + remainder * base;
           num = num / 10;
           base = base * b;
       }
       return result;
       }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary value");
        int n = sc.nextInt();
        System.out.println("Enter the base value");
        int b = sc.nextInt();    
       int result = DecimalConversion(n,b);
        System.out.println(result);
    }
}