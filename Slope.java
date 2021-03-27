import java.util.*;
public class Slope{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int x1,y1,x2,y2;
		double m;
		System.out.println("Enter x1,y1,x2,y2");
		x1=sc.nextInt();
		y1=sc.nextInt();
		x2=sc.nextInt();
		y2=sc.nextInt();
		m=(y2-y1)/(x2-x1);
		System.out.println("Slope= "+(int)m);
		
		
	}
}