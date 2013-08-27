package clase1;

public class clase {
    static int A=7,B=15;
public static void main (String X[]) {
	int p;
	p=A; 
	A=B;		
    B=p;
    System.out.println(A+"valor de A");
    System.out.println(B+"valor de B");
    if(A>B)
    	System.out.println("mayor A");
    else
    	System.out.println("mayor B");
    
}

}
