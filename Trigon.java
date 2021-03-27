import java.math.*;
import java.util.*;
public class Trigon{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double a,b,c,d;
		System.out.println("Enter a,b");
		a=sc.nextDouble();
		b=sc.nextDouble();
		a=(22.0/(7*180))*a;
		b=(22.0/(7*180))*b;
		c=(int)((Math.tan(a)-Math.tan(b))/(1+(Math.tan(a))*(Math.tan(b))));
		System.out.println("Answer is= "+c);
	}
}