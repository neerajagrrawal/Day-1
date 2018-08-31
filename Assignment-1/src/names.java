import java.io.BufferedReader;
import java.io.InputStreamReader;

public class names {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		//String arr[]=new String[4] ;
		String arr[]= {"neeraj","aman","arpit","anupam","neeraj"} ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name to search" );
		String ser=br.readLine() ;
		int count=0 ;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].compareTo(ser)==0)
				count++ ;
		}
	System.out.println(count);
		
	}

}
