import java.util.*;
public class Root{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double n, sr, cr;
		System.out.println("Enter a number");
		n=sc.nextDouble();
		sr=Math.sqrt(n);
		cr=Math.cbrt(n);
		System.out.println("Square root of "+n+"= "+sr);
		System.out.println("Rounded Form= "+(int)sr);
	System.out.println("Cube root of "+n+"= "+cr);
		System.out.println("Rounded Form= "+(int)cr);
	}
}