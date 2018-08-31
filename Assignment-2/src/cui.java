import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cui {

	public static void main (String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count=0 ;
		String username="neeraj" ;
		String pass="nee" ;
		
		
		String tri="" ;
		String tri1="" ;
		int flag=0 ;
		for(;;)
		{
			System.out.println("Enter username");
			tri=br.readLine() ;
			System.out.println("Enter password");
			tri1=br.readLine() ;
			if(pass.equals(tri1) && username.equals(tri)) 
			{
				//System.out.println(pass+"---"+tri1);
				System.out.println("Welcome");
				flag=1 ;
				
			}
			if(count>2)
			{
				System.out.println("Contact Admin");

			}
			if(count<2 && flag==0)
			{
				System.out.println("Try Again");

			}
			
				if(count>2 || flag==1)
				{
					break ;
				}
				flag=0 ;
		}
	}

}
