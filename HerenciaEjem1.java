
package herenciaejem1;


public class HerenciaEjem1 {

   
    public static void main(String[] args)
    {
       Triangulo t1 = new Triangulo();
       Triangulo t2 = new Triangulo();
       
       //Asignando datos 
        /*t1.base = 4.0;
        t1.altura = 4.0;
        t1.estilo = "Estilo T1";
        
        t2.base = 8.0;
        t2.altura = 12.0;
        t2.estilo = "Estilo T2";*/
        
        //Pidiendo datos
        t1.setBase(5.0);
        t1.setAltura(4.0);
        t1.estilo = "Estilo T1";
        
        t2.setBase(8.0);
        t2.setAltura(12.0);
        t2.estilo = "Estilo T2";
        
        System.out.println("Informacion del Triangulo 1: ");
        t1.MostrarEstilo();
        t1.MostrarDimension();
        System.out.println("El area es: " + t1.area());
        System.out.print("");
        
        System.out.println("Informacion del Triangulo 2: ");
        t2.MostrarEstilo();
        t2.MostrarDimension();
        System.out.println("El area es: " + t2.area());
        System.out.print("");
         
       
    }
    
}
