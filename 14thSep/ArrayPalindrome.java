import java.util.*;
public class ArrayPalindrome{

	public static boolean isPalindrome(int arr[]){
		int left = 0;
		int right = arr.length-1;
		while(left<right){
			if(arr[left] != arr[right]) return false;
			left++;
			right--;
		}
		return true;
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]  = new int[n];
		int i=0;
		while(i<n){
			arr[i] = sc.nextInt();
			i++;
		}
		if(isPalindrome(arr)) System.out.print("Arrya is palindrome");
		else System.out.print("Arrya is not palindrome");
	}
}