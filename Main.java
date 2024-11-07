//Osmer David Cardona Mejia
//NC:202410050140

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Seleccione la forma que desea crear:");
            System.out.println("1. Circulo");
            System.out.println("2. Linea");
            System.out.println("3. Triangulo");
            System.out.println("4. Cuadrado");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opcion por favor: ");
            int opcion = scanner.nextInt();

            switch (opcion) 
            {
                case 1:
                    System.out.print("Ingrese el radio del circulo: ");
                    double radio = scanner.nextDouble();
                    Formas circulo = new Circulo(radio);
                    circulo.dibujar();
                    System.out.printf("El radio del circulo es:  %.0f " , circulo.getRadio());
                    break;
                case 2:
                    System.out.print("Ingrese el largo de la linea: ");
                    double largo = scanner.nextDouble();
                    Formas linea = new Linea(largo);
                    linea.dibujar();
                    System.out.printf("Lo largo de la linea es:  %.0f " , linea.getLargo());
                    break;
                case 3:
                    System.out.print("Ingrese el area del triangulo: ");
                    double angulo = scanner.nextDouble();
                    Formas triangulo = new Triangulo(angulo);
                    triangulo.dibujar();
                    System.out.printf("El area del triangulo es: %.0f" , triangulo.getAngulo());
                    break;
                case 4:
                    System.out.print("Ingrese el area del cuadrado: ");
                    double area = scanner.nextDouble();
                    Formas cuadrado = new Cuadrado(area);
                    cuadrado.dibujar();
                    System.out.printf(" El area del cuadrado es: %.0f " , cuadrado.getArea());
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    running = false;
                    break;
                default:
                    System.out.println("Opcion no valida. Intente nuevamente por favor.");
            }
            System.out.println(); 
        }

        scanner.close();
    }
}

