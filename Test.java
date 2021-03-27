import java.util.*;
public class Test{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		double s,a,b,c;
		System.out.println("Enter values of a,b,c");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		s=(int)((1.0/(a*a))+(2.0/(b*b))+(3.0/(c*c)));
		System.out.println("Sum= "+s);
	}
}	