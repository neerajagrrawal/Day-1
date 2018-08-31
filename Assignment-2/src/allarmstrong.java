import java.util.* ;
public class allarmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in) ;
		//int num=sc.nextInt() ;
		//int temp=num ;
		
		for(int j=100;j<=999;j++)
		{
			int sum=0 ;
			int num=j ;
			int temp=num ;
		for(int i=0;num>0;i++)
		{
			sum+=Math.pow(num%10,3) ;
			num=num/10 ;
		}
		
		if(temp==sum)
			System.out.println(temp);
//		else
//			System.out.println("Not Armstrong number");
		}
	}

}
