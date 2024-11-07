//Osmer David Cradona Mejia
//NC:202410050140

public class Circulo extends Formas
{
    private double radio;

    public Circulo(double radio)
    {
        this.radio = radio;
    }

    @Override
    public double getRadio() 
    {
        return radio;
    }

    @Override
    public void dibujar()
    {
        System.out.println("Dibujando un circulo.");
    }
}

