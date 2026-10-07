import java.util.Scanner;
public class Building {

    // define a method to find the maximum number in an array
    static int findmax(int[] arr){
        int max = -1;
        for(int i=0; i<arr.length; i++){
              if(arr[i] > max){
                max = arr[i];
        }
    }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int max = findmax(arr);
       for(int i=0; i<max; i++){
        for(int j=0; j<n; j++){
            if(arr[j]>=max-i) System.out.print("*");
            else System.out.print(" ");
        }
        System.out.println();
       }

    }
}
