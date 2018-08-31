import java.util.* ;
public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in) ;
		int num=sc.nextInt() ;
		int temp=num ;
		int sum=0 ;
		for(int i=0;num>0;i++)
		{
			sum+=Math.pow(num%10,3) ;
			num=num/10 ;
		}
		if(temp==sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstrong number");
	}

}
