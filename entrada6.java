// Importa la utilidad Scanner que sirve para almacenar una cantidad introducida por teclado a una variable.
import java.util.Scanner;
// Clase pública llamada Sandra. Este programa calculará el número de la suerte haciendo uso del día, mes y año de nacimiento.
public class SandraC{
    // Inicia la ejecución del programa.
    public static void main(String[] args){
        // Crea una variable de tipo entero.
        int num;
        //Crea un objeto llamado "entrada" haciendo uso de la utilidad Scanner asociado al dispositivo de entrada.
        Scanner entrada = new Scanner(System.in);
        //Hace aparecer un texto en pantalla y además permite la introducción de un dato, por eso se usa "printf" ya que utiliza una cadena de formato.
        System.out.printf("Introduce un número: ");
        //Define la variable anteriormente creada "num" con el dato introducido que ha sido leido por el objeto creado anteriormente usando la clase Scanner "entrada" de un número entero (por eso "entrada.nextInt")
        num = entrada.nextInt();
        // Esto es un pequeño sistema de error que he creado para que el programa no se rompa al introducir algo que no esta permitido o no programado, como por ejemplo introducir números demasiado grandes.
        // Condicional de que en caso de que el número introducido en la selección de operación sea menor a 0 se active.
        if(num < 0){
            // Hace aparecer en pantalla un texto informativo sobre que el número introducido no es valido.
            System.out.printf("No estan permitidos los números negativos.");
            // Finaliza el programa.
            System.exit(0);
        }
        // Condicional de que en caso de que el número introducido en la selección de operación sea mayor a 10.000.000 se active.
        if(num > 10000000){
            // Hace aparecer en pantalla un texto informativo sobre que el número introducido no es valido.
            System.out.printf("El número es demasiado grande :S, sin embargo, tiene más de 7 dígitos.");
            // Finaliza el programa.
            System.exit(0);
        }
        // Condicional de que en caso de que el número introducido en la selección de operación sea menor a 10 se active.
        if(num < 10){
            // Hace aparecer en pantalla un texto informativo sobre la cantidad de dígitos del número, en este caso 1 dígito.
            System.out.printf("El número " + num + " tiene 1 dígito.");
        }
        // Condicional de que en caso de que el número introducido en la selección de operación sea menor a 100 se active.
        else if(num < 100){
            // Hace aparecer en pantalla un texto informativo sobre la cantidad de dígitos del número, en este caso 2 dígito.
            System.out.printf("El número " + num + " tiene 2 dígitos.");
        }
        // Condicional de que en caso de que el número introducido en la selección de operación sea menor a 1000 se active.
        else if(num < 1000){
            // Hace aparecer en pantalla un texto informativo sobre la cantidad de dígitos del número, en este caso 3 dígito.
            System.out.printf("El número " + num + " tiene 3 dígitos.");
        }
        // Condicional de que en caso de que el número introducido en la selección de operación sea menor a 10000 se active.
        else if(num < 10000){
            // Hace aparecer en pantalla un texto informativo sobre la cantidad de dígitos del número, en este caso 4 dígito.
            System.out.printf("El número " + num + " tiene 4 dígitos.");
        }
        // Condicional de que en caso de que el número introducido en la selección de operación sea menor a 100000 se active.
        else if(num < 100000){
            // Hace aparecer en pantalla un texto informativo sobre la cantidad de dígitos del número, en este caso 5 dígito.
            System.out.printf("El número " + num + " tiene 5 dígitos.");
        }
        // Condicional de que en caso de que el número introducido en la selección de operación sea menor a 1000000 se active.
        else if(num < 1000000){
            // Hace aparecer en pantalla un texto informativo sobre la cantidad de dígitos del número, en este caso 6 dígito.
            System.out.printf("El número " + num + " tiene 6 dígitos.");
        }
        // Condicional de que en caso de que el número introducido en la selección de operación sea menor a 10000000 se active.
        else if(num < 10000000){
            // Hace aparecer en pantalla un texto informativo sobre la cantidad de dígitos del número, en este caso 7 dígito.
            System.out.printf("El número " + num + " tiene 7 dígitos.");
        }
    }
}
