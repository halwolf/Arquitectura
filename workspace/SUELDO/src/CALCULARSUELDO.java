import java.util.Scanner;
public class CALCULARSUELDO{
    
    float pd=20000, sb=600000,Total;
    public void Calcular(int n){
               
        Total=n*pd;
        System.out.println("El salario total es: "+Total);
        }
    
    public static void main(String[] args){
          CALCULARSUELDO sueldo=new CALCULARSUELDO();
          float hef=5000, noc=30000, domin=28000;
          System.out.println("Precio por dia:"+sueldo.pd+"\nsalario basico:"+sueldo.sb);
          Scanner leer=new Scanner(System.in);
          System.out.println("Escribe los dias trabajados");
          int dias=leer.nextInt();
          dias= (int) (dias*20000);
          System.out.println("Escribe las horas extras trabajadas");
          int he=leer.nextInt();
          he= (int) (he*hef);
          System.out.println("Escribe los dias nocturnos trabajados");
          int dn=leer.nextInt();
          dn= (int) (dn*noc);
          System.out.println("Escribe los dias domingos trabajados");
          int dd=leer.nextInt();
          dd= (int) (dd*domin);
          int ST=dias+he+dn +dd;
          System.out.println("su sueldo total es :" + ST);
          
    }
}