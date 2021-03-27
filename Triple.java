import java.util.*;
public class Triple{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double n,m, sr, cr;
		System.out.println("Enter a number");
		n=sc.nextDouble();
		m=2*n;
		sr=n*n-1;
		cr=n*n+1;
		System.out.println(m+", "+sr+", "+cr+" are Pythagorean Triplet");
	}
}