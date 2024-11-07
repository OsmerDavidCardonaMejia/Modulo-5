//Osmer David Cardona Mejia
//NC:202410050140

public class Linea extends Formas 
{
    private double largo;
    
    public Linea(double largo)
    {
        this.largo = largo;
    }
    
    @Override
    public void dibujar()
    {
        System.out.println("Dibujando una linea.");
    }
    
    @Override
    public double getLargo()
    {
        return largo;
    }
}
