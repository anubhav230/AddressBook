package interview;

public class BinarySearch {
	
	public static int binarySearch(int[] arr, int data) {
		
		int l=0;
		int r=arr.length-1;
		while (l<=r) {
			
			int mid=(l+r)/2;
			if (data==arr[mid]) 
				return arr[mid];
			else if (data<arr[mid]) 
				r=mid-1;
			else
				l=mid+1;
				
			
		}
		return -1;
		
		
	}

	public static void main(String[] args) {
		int[] arr= {1,5,6,10,26,28,30,50,60,90};
		
		int res=binarySearch(arr,28);
		if (res!=-1)
			System.out.println("element is present in array: "+res);
		else
			System.out.println("element is not present in array: ");
		
	}

}
