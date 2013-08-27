package programacion;

public class operacion {

int x,y; 
public static void main (String m []) {    
	operacion t=new operacion ();
	t.x=7;
	t.y=8;
	t.suma();
	t.resta();
	t.multiplicacion();
	t.division();
}
public void suma (){
	int r;
	r= x+y;
	System.out.println("la suma es" +r);
}	
public void resta (){
	int p;
	p= x-y;
	System.out.println("la resta es" +p);
}	
public void multiplicacion (){
	int k;
	k= x*y;
	System.out.println("la multiplicacion  es" +k);
}	
public void division (){
	int w;
	w= x/y;
	System.out.println("la division es" +w);
}	
}