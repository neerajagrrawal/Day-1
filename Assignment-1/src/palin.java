import java.util.Scanner;

public class palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in) ;
		System.out.print("Input:") ;
		int num = in.nextInt() ;
		int sum = 0,r ;
		int temp = num ;
		while(num>0)
		{
			r = num%10 ;
			sum=(sum*10)+r;
			num=num/10;
		}
		System.out.print("Output:") ;
		if(temp==sum)
			System.out.println("true") ;
		else
			System.out.println("false") ;
	}

}
