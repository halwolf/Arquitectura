package trabajo;
  import java.util.Scanner;
public class sumatoria {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner x= new Scanner(System.in);
     int r= x.nextInt();
     int y=x.nextInt();
     int f=x.nextInt();
     int e= suma(r,y);
     System.out.println("el valor es"+e);
     int p;
     p=r;
     r=y;
     y=p;
     if(r>y){
    	
         System.out.println("el resultado de la potencia es "+ Math.pow(r, y));
     }   
         else{
         Math.pow(y,r);
          System.out.println("el resultado de la potencia es "+ Math.pow(y, r));
         }   
     if(r%3==0)
    	 System.out.println("r es multiplo de 3");
     else 
    	 System.out.println("r no es multiplo de 3");
     if(y%3==0)
    	 System.out.println("y es multiplo de 3");
     else
    	 System.out.println("y no es multiplo de 3");
     if(f%3==0)
    	 System.out.println("f es multiplo de 3");
     else 
    	 System.out.println("f no es multiplo de 3"); 
     double u=(-r-Math.sqrt(Math.pow(r, 2)-4*f*r))/(2*f);
     System.out.println(u);
     double v=(-r+Math.sqrt(Math.pow(r, 2)-4*f*r))/(2*f);
    	 System.out.println(v);
	}
	static int suma(int r,int t){
		return r+t;
	}
    
}

