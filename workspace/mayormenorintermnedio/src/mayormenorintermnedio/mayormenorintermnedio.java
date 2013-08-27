package mayormenorintermnedio;

public class mayormenorintermnedio {
static double a=10,b=8,c=15,n;
public static void main (String m[]){
	if(a%2==0)
		System.out.println(a+" es par ");
	if (b%2==0)
		System.out.println(b+" es par ");
	if(c%2==0)
		System.out.println(c+" es par ");
			if(a>b)
		if(a>c)
			if(b>c)
				System.out.println(""+a+" "+b+" "+c);
			else
				System.out.println(""+a+" "+c+" "+b);
		else 
			System.out.println(""+c+" "+a+" "+b);
	else
		if(b>c)
			if(a>c)
				System.out.println(""+b+" "+a+" "+c);
			else
				System.out.println(""+b+" "+c+" "+a);
			
		else
			System.out.println(""+c+" "+b+" "+a);
			
			if()
}

}