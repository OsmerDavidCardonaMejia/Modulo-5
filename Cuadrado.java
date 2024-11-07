//Osmer David Cardona Mejia
//NC:202410050140

public class Cuadrado extends Formas 
{
    private double area;

    public Cuadrado(double area) 
    {
        this.area = area;
    }
    
    @Override
    public double getArea()
    {
        return area;
    }

    @Override
    public void dibujar()
    {
        System.out.println("Dibujando un cuadrado.");
    }
}

