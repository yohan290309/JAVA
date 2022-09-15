
package herenciaejem1;


public class BaseAltura 
{
    private double base;
    private double altura;
    
    void MostrarDimension()
    {
        System.out.println("La base y la altura son: "+ base +" y "+ altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
