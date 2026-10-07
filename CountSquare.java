import java.util.Scanner;

// methods in java

// return type method/function name(paremeter list){   data type of paremeter paremeter nam, formal parameter
//
// body of our method

//}

public class CountSquare {

    static int perfectSquare(int n) {
        int cnt = 0;
        int i = 1;
        while (i * i < n) {
            cnt++;
            System.out.print(i * i + " ");
            i++;
        }
        return cnt;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        short count = perfectSquare(n); // actual parameter
        System.out.println("Perfect square less than: " + n);
        System.out.println("Count: " + count);
    }
}
