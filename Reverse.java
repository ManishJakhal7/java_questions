public class Reverse {
    public static void main(String[] args) {
        int x = 4567;
        int reverse = 0;
        System.out.println(x % 10);
        reverse = reverse * 10 + x % 10;
        x = x / 10;
        System.out.println(x % 10);
        reverse = reverse * 10 + x % 10;
        x = x / 10;
        System.out.println(x % 10);
        reverse = reverse * 10 + x % 10;
        x = x / 10;
        System.out.println(x % 10);
        reverse = reverse * 10 + x % 10;
        // System.out.println(x/10);
        // System.out.println(x % 10);
        System.out.println("Reversed number: " + reverse);
    }
}