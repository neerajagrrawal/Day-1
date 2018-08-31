import java.util.* ;
import java.lang.*;

public class diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{ 7,3,1,4,2,8,9,6};
		 Arrays.sort(arr);
		 int k=4 ;
		 int i=0,j=arr.length ;
		 //int plus,search ;
		 for(int t=0;t<arr.length;t++)
		 {
			 
			 int l=Arrays.binarySearch(arr,arr[t]-k);
			 if(l<0)
				 continue ;
			 else {
				 System.out.println("Pair->"+arr[t]+"-"+arr[l]) ;
			 }
		 }
		 
		// System.out.println(l) ;
		 
	}

}
