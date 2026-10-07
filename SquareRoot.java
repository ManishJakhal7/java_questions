import java.util.Scanner;

public class SquareRoot {

    static float squareRoot(float n) {
        // float i = 1;
        if (n == 0)
            return 0;
        float sqrt = 0;
        while (sqrt * sqrt <= n) {
            sqrt = sqrt + 1;
        }
        sqrt = sqrt - 1;
        sqrt = (float) (sqrt + 0.1);
        while (sqrt * sqrt <= n) {
            sqrt = (float) (sqrt + 0.1);
        }
        sqrt = (float) (sqrt - 0.1);
        sqrt = (float) (sqrt + 0.01);
        while (sqrt * sqrt <= n) {
            sqrt = (float) (sqrt + 0.01);
        }
        sqrt = (float) (sqrt - 0.01);

        sqrt = (float) (sqrt + 0.001);
        while (sqrt * sqrt <= n) {
            sqrt = (float) (sqrt + 0.001);
        }
        sqrt = (float) (sqrt - 0.001);

        return sqrt;
    }

    public static void main(String[] args) {

        System.out.print("Enter the number for square root:");
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        float result = squareRoot(n);
        System.out.println("Square root of the number is: " + result);
        sc.close();
    }
}