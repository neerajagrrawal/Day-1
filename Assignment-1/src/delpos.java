import java.util.* ;
import java.io.* ;


public class delpos {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String inp=br.readLine();
//		String words[]=inp.split(" ") ;
//		String words2[]=inp.split("") ;
//		String words1[]=new String[words2.length] ;
//		char finn[]=new char[words2.length] ;
//		String fin="" ;
//		int count=0 ;
//		int flag=0 ;
//		int ctspace=0 ;
//		for(int i=0;i<words2.length;i++)
//		{
//			
//			
//				if(Character.isWhitespace(words2[i].charAt(0)))
//				{
//					flag=1 ;
//				}
//				//System.out.println(words2[i].charAt(0));
//				if(flag!=1)
//				{
//					words1[i]=words2[i] ;
//					finn[count]=words2[i].charAt(0) ;
//					count++ ;
//				}
//				if(flag==1)
//				{
//					if(Character.isWhitespace(finn[count-1]))
//					{
//						flag=0 ;
//						continue ;
//					}
//					else
//					{
//						words1[i]=words2[i] ;
//						finn[count]=words2[i].charAt(0) ;
//						count++ ;
//					}
//				}
//				flag=0 ;
//		}
//		
//		for(int k=0;k<count;k++)
//		{
//			fin+=finn[k] ;
//			System.out.print(finn[k]) ;
//		}
//		System.out.println(); 
Scanner sc=new Scanner(System.in) ;
System.out.print("Input: ");
String find=br.readLine();
String rem[]=find.split(" ") ;
System.out.println("write word to delete");
String find1=br.readLine();
System.out.println("write word position");
int pos=sc.nextInt() ;
int ind=pos ;
//for(int r=0;r<rem.length;r++)
//{
//	if(rem[r].compareTo(find)==0)
//	{
//		ind=r ;
//		break ;
//	}
//}
String sup="" ;
for(int k=0;k<rem.length;k++)
{
	if(k!=ind)
	sup+=rem[k]+" " ;
	//System.out.print(find); ;
}


System.out.print(sup) ;
			
}
}
