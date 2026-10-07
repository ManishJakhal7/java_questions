public class PeakElement{
	
	  public static int findPeakElement(int[] arr){
          for(int i=0; i<arr.length; i++){
          	if((i==0 || arr[i]<arr[i-1]) && (i == arr.length-1 || arr[i]>arr[i+1])){
          		return i;
          	}
          }
          return -1;
	  }


	 public static void main(String[] args) {
		int arr1[] = {1, 2, 4, 5, 7, 8, 3};
		int arr2[] = {10, 20, 15, 2, 23, 90, 80};
		int arr3[] = {3,2,1};
		int arr4[] = {1,2,3};
		System.out.println(findPeakElement(arr1));
		System.out.println(findPeakElement(arr2));
		System.out.println(findPeakElement(arr3));
		System.out.println(findPeakElement(arr4));
	}
}