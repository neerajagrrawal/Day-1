import java.util.* ;
import java.io.* ;


public class multi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in) ;
		
		int[][] arr =new int[2][2] ;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=sc.nextInt() ;
			}
		}
		int flag=0 ;
		System.out.print("Enter number to find" );
		int key=sc.nextInt() ;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(arr[i][j]==key)
				{
					System.out.println("Present" );
					flag=1 ;
					break ;
				}
			}
		}
		if(flag==0)
		System.out.println("Not Present" );	
}
}
