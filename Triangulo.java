
package herenciaejem1;


public class Triangulo extends BaseAltura
{
    String estilo;
    
    double area()
    {
        //return base*altura/2; sin pedir cambio de datos
       return super.getBase()*super.getAltura()/2; 
    }
    void MostrarEstilo()
    {
        System.out.println("El Triangulo es "+ estilo);
    }
}
    
    
