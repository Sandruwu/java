import java.util.Scanner;

public class entrada1
{
    public static void main(String[] args)
    {
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Introduzca un número entero: ");
        numero = entrada.nextInt();

        if (numero % 2 == 0)
        {
            System.out.printf("El número es par");
        }
        else
        {
            System.out.printf("El número es impar");
        }
    }
}
