//Osmer David Cardona Mejia
//NC:202410050140

public class Triangulo extends Formas
{
    private double angulo;

    public Triangulo(double angulo) 
    {
        this.angulo = angulo;
    }
    
    @Override
    public double getAngulo()
    {
        return angulo;
    }

    @Override
    public void dibujar() 
    {
        System.out.println("Dibujando un triangulo.");
    }
}


