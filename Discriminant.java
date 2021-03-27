import java.math.*;
import java.util.*;
public class Discriminant{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double a,x,b,c,d;
		System.out.println("Enter a,b,c ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		d=b*b-(4*a*c);
		d=(int)d;
		System.out.println(d);
		
	}
}