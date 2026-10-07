import java.util.Scanner;

public class SwitchCase {
    // switch case statement in java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
        switch (s) {
            case "Monday":
                System.out.println("Today is Monday");
                break;

            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;

            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;

            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;

            default:
                System.out.println("Today is not a valid day");
        }
    }
}
