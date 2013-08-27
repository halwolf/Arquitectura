package taller;

public class formato {

	
		int edad, numero;
		String sexo, nombre;
		
		
	formato (String nombre, int edad){
		this.nombre= nombre;
		this.edad= edad;            
			
	}
	
	
	formato (String nombre, int edad, String sexo){  

		this.nombre= nombre;
		this.edad= edad;
		this.sexo= sexo;                          
			
	}

	
	String comprobar () {
		
		if(edad <= 17){
		return "Menor de Edad";	}
	
		else { 
		return "Mayor de Edad";  }
	}
	
	
	public static void main (String N2 [] ) {
		formato N1=new formato ("Edward Martinez",21);
		System.out.println (N1.comprobar());
		N1.comprobar(21,"Edward Martinez");
		
	}
	
		void comprobar (int edad, String nombre){		
		if (edad >=0 && edad <=7);}
	
		
	void comprobar1() {		
		if (edad >=0  && edad <=7){
			
	}
		
		
		
		
		
		
		
	}
	
	
	public static void main1 (String N3 [] ) {
		formato N5=new formato ("Edward Martinez",5);
		System.out.println (N5.comprobar());
	}
	
	
}


