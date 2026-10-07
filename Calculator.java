import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter the operation you want to perform(+,-,*,/): ");
        Scanner sc = new Scanner(System.in);
        // + - * /
        char operation = sc.next().charAt(0);
        // switch case
        // switch(operation){
        //     case '+':
        //         System.out.println("Enter two numbers: ");
        //         int a = sc.nextInt();
        //         int b = sc.nextInt();
        //         System.out.println("Result: " + (a + b));
        //         break;
        //     case '-':
        //         System.out.println("Enter two numbers: ");
        //         int c = sc.nextInt();
        //         int d = sc.nextInt();
        //         System.out.println("Result: " + (c - d));
        //         break;
        //     case '*':
        //         System.out.println("Enter two numbers: ");
        //         int e = sc.nextInt();
        //         int f = sc.nextInt();
        //         System.out.println("Result: " + (e * f));
        //         break;
        //     case '/':
        //         System.out.println("Enter two numbers: ");
        //         int g = sc.nextInt();
        //         int h = sc.nextInt();
        //         System.out.println("Result: " + (g / h));
        //         break;
        //     default:
        //         System.out.println("Invalid operation");
        // }


       System.out.print("Enter First number:");
       float a = sc.nextFloat();
       float b = sc.nextFloat();

        if(operation=='+'){
            System.out.println("Addition of two numbers is: "+ (a+b));
        }else if(operation == '-'){
             System.out.println("Subtraction of two numbers is: "+ (a-b));
        }else if(operation == '*'){
            System.out.println("Multiplication of two numbers is: "+ (a*b));
        }else if(operation == '/'){
            System.out.println("Division of two numbers is: "+ (a/b));
        }else{
            System.out.println("Invalid operation");
        }
        sc.close();
    }
}