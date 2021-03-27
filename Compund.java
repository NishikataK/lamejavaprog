import java.util.*;
public class Compound{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int p;
		double ci,a;
		System.out.println("Enter Principal");
		p=sc.nextInt();
		a=p*Math.pow((1.0/(6.0/100.0)),3)*Math.pow((1.0/(8.0/100.0)),3)*Math.pow((1.0/(10.0/100.0)),3);
		ci=a-p;
		System.out.println("Amount after 3 years= "+a);
		System.out.println("Compound Interest= "+ci);
		
		
	}
}