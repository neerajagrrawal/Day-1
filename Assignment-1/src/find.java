import java.util.* ;
import java.lang.*;

public class find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{ 7,3,1,4,2,8,9,6,0};
		 Arrays.sort(arr);
		 //int k=4 ;
		 int i=0,j=arr.length ;
		 //int plus,search ;
		 for(int t=0;t<arr.length;t++)
		 {
			 
			 int l=Arrays.binarySearch(arr,t);
			 if(l<0)
				 {
				 System.out.println(t) ;
				 break ;
				 }
			 else {
				 continue ;
			 }
		 }
		 
		// System.out.println(l) ;
		 
	}

}
