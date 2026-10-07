import java.util.Scanner;
public class Hello{    // This is a hello class which we can name anything just remember that your dot class file
	            // name will be created by this name
	
	public static void main(String[] args){  // public is an accessmodifier
		                                     // static keyword is used because we don't want to create object for this method
											// void since we don't want to return anyting
											// main is the method name (can't be changed)
											// String[] args is command line arguments (args can be named anything),
										   // these arguments are a array of String 

	//  System.out.println("Hello");   
	// System.out.print(5+5+"Hello");
	// System.out.print("Hello"+5);
	
	Scanner sc = new Scanner(System.in); // we have created a object of scanner class
	                                     // sc can be named anything, it is a vairable
	                                     // first Scanner keyword means data type 
	                                     // second Scanner keywords is used to call the constructor of
	                                     // class Scanner 
	                                     // new keyword is used to create object of that class and allocate memory
	                                     // System.in is associated with taking input values from input devices
    System.out.println("Enter the digit:");
    int x = sc.nextInt();               // we have called method nextInt() to take integer value as input
    System.out.print(x);
	} 

}