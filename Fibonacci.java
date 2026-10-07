import java.util.*;

public class Fibonacci {
    static void fibonacci(int num) {
        // 0 1 1 2 3 5 8 13 21....
        int first = 0;
        int second = 1;
        for (int i = 0; i < num; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
        sc.close();
    }
}