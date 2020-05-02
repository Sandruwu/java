// Importa la utilidad Scanner que sirve para almacenar una cantidad introducida por teclado a una variable.
import java.util.Scanner;

// Clase pública llamada Sandra. Este programa calculará el número de la suerte haciendo uso del día, mes y año de nacimiento.
public class Sandra{

    // Inicia la ejecución del programa.
    public static void main(String[] args){

        // Crea varias variables de tipo entero.
        int operacion, num1, num2;

        //Crea un objeto llamado "entrada" haciendo uso de la utilidad Scanner asociado al dispositivo de entrada.
        Scanner entrada = new Scanner(System.in);

        //Hace aparecer en pantalla un conjunto de textos, separados en diferentes líneas gracias a "\n".
        System.out.printf("1. + (Suma) \n");
        System.out.printf("2. - (Resta) \n"); 
        System.out.printf("3. * (Multiplicación) \n");
        System.out.printf("4. / (División) \n"); 

        //Hace aparecer un texto en pantalla y además permite la introducción de un dato, por eso se usa "printf" ya que utiliza una cadena de formato.
        System.out.printf("Introduce el número correspondiente a la operación que desea realizar: ");

        //Define la variable anteriormente creada "operación" con el dato introducido que ha sido leido por el objeto creado anteriormente usando la clase Scanner "entrada" de un número entero (por eso "entrada.nextInt")
        operacion = entrada.nextInt();

        // Esto es un pequeño sistema de error que he creado para que el programa no se rompa al introducir algo no programado.
        // Condicional de que en caso de que el número introducido en la selección de operación sea mayor a 4 se active.
        if(operacion > 4){
        // Hace aparecer en pantalla un texto informativo sobre que el número introducido no es valido.
        System.out.println("Debes de introducir una de las cuatro opciones. Vuelva a iniciar el programa para reintentarlo.");
        // Finaliza el programa.
        System.exit(0);
        }

        // Esto es un pequeño sistema de error que he creado para que el programa no se rompa al introducir algo no programado.
        // Condicional de que en caso de que el número introducido en la selección de operación sea menor a 1 se active.
        if(operacion < 1){
        // Hace aparecer en pantalla un texto informativo sobre que el número introducido no es valido.
        System.out.println("Debes de introducir una de las cuatro opciones. Vuelva a iniciar el programa para reintentarlo.");
        // Finaliza el programa.
        System.exit(0);
        }

        //Hace aparecer un texto en pantalla y además permite la introducción de un dato, por eso se usa "printf" ya que utiliza una cadena de formato.
        System.out.printf("Introduce el primer número: ");

        //Define la variable anteriormente creada "num1" con el dato introducido que ha sido leido por el objeto creado anteriormente usando la clase Scanner "entrada" de un número entero (por eso "entrada.nextInt")
        num1 = entrada.nextInt();

        //Hace aparecer un texto en pantalla y además permite la introducción de un dato, por eso se usa "printf" ya que utiliza una cadena de formato.
        System.out.printf("Introduce el segundo número: ");

        //Define la variable anteriormente creada "num2" con el dato introducido que ha sido leido por el objeto creado anteriormente usando la clase Scanner "entrada" de un número entero (por eso "entrada.nextInt")
        num2 = entrada.nextInt();

        // Condicional, si el número introducido en la selección de operación (es decir, el valor de la variable "operacion") es 1 se activará.
        if(operacion == 1){

        // Hace aparecer en pantalla un texto que incluye el valor de la variables "num1" y "num2" y hace aparecer la suma de ambas variables. Se usa printIn porque contiene variables de tipo entero.
        System.out.println("La suma de " + num1 + " y " + num2 + " es = " + (num1 + num2));
        }

        // Condicional, si el número introducido en la selección de operación (es decir, el valor de la variable "operacion") es 2 se activará.
        if(operacion == 2){

        // Hace aparecer en pantalla un texto que incluye el valor de la variables "num1" y "num2" y hace aparecer la resta de ambas variables. Se usa printIn porque contiene variables de tipo entero.
        System.out.println("La resta de " + num1 + " y " + num2 + " es = " + (num1 - num2));
        }

        // Condicional, si el número introducido en la selección de operación (es decir, el valor de la variable "operacion") es 3 se activará.
        if(operacion == 3){

        // Hace aparecer en pantalla un texto que incluye el valor de la variables "num1" y "num2" y hace aparecer la multiplicación de ambas variables. Se usa printIn porque contiene variables de tipo entero.
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es = " + (num1 * num2));
        }

        // Condicional, si el número introducido en la selección de operación (es decir, el valor de la variable "operacion") es 4 se activará.
        if(operacion == 4){

        // Hace aparecer en pantalla un texto que incluye el valor de la variables "num1" y "num2" y hace aparecer la división de ambas variables. Se usa printIn porque contiene variables de tipo entero.
        System.out.println("La división de " + num1 + " y " + num2 + " es = " + (num1 / num2));
        }
    }
}
