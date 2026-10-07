import java.util.*;
public class Test{
    public static void main(String[] manish){  
      Scanner sc = new Scanner(System.in);

    // ArrayList<Integer> arr = new ArrayList<>();

      System.out.println(manish[0]);
      System.out.println(manish[1]);
      
      int n  = sc.nextInt();
      int [] arr = new int[n];
      for(int i=0; i<arr.length; i++){
         arr[i] =  sc.nextInt();
      }

      for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);  
      }
      
  }
}