import java.util.Scanner;
public class interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,t,r,sim,com ;
		Scanner sc=new Scanner(System.in);
		System.out.println("amount");
		a=sc.nextDouble() ;
		System.out.println("time");
		t=sc.nextDouble() ;
		System.out.println("rate");
		r=sc.nextDouble() ;
		sim=(a*t*r)/100 ;
		com=a*Math.pow(1.0+r/100.00,t)-a;
		System.out.println("SI=" +sim);
		System.out.println("CI="+com);
	}

}
