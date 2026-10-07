import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     System.out.print("Enter the year: ");
      int year = sc.nextInt();
    
    if((year %4==0 && year %100 != 0) || year%400 == 0){
      System.out.println("The entered year is a Leap Year");
    }else{
      System.out.println("The entered year is not a leap Year");
    }
      
    }
}