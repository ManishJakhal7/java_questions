import java.util.*;

public class RaplaceZero {

    public static int Replace(int num, int a) {
        // result + remainder*place for reverse reverse = reverse*10+remainder;
        int place = 1;
        int result = 0;
        while (num != 0) {
            int remainder = num % 10;
            if (remainder == 0)
                remainder = a;
            result = result + remainder * place;
            num = num / 10;
            place = place * 10;

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input number:");
        int n = sc.nextInt();
        System.out.print("/n Enter the replacement:");
        int x = sc.nextInt();
        System.out.println("Replace digit: " + Replace(n, x));
        sc.close();
    }
}