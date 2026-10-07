import java.util.*;

public class SumOfNaturalCubes {

    static int calculateSumOfNaturalCubes(int num) {
        int i = 1;
        int result = 0;
        while (i <= num) {
            System.out.print(i * i * i + " ");
            result = result + (i * i * i);
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // this will take input, Integer only
        System.out.println(calculateSumOfNaturalCubes(n)); // this is method calling,
    } // name of the method, passing the n as parameter
}