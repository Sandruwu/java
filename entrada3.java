import java.util.Scanner;

public class entrada3
{
    public static void main(String[] args)
    {
        int numero1, numero2;
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Introduzca el primer número: ");
        numero1 = entrada.nextInt();
        System.out.printf("Introduzca el segundo número: ");
        numero2 = entrada.nextInt();

        if(numero1 % numero2 == 0){
            System.out.println("El número " + numero2 + " es multiplo de " + numero1);  
          }
          else{
            System.out.println("El número " + numero2 + " no es multiplo de " + numero1);
          }
    }
}
