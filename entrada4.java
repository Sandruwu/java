// Importa la utilidad Scanner que sirve para almacenar una cantidad introducida por teclado a una variable.
import java.util.Scanner;

// Clase pública llamada Sandra. Este programa calculará el número de la suerte haciendo uso del día, mes y año de nacimiento.
public class SandraC {
// Inicia la ejecución del programa
    public static void main(String[] args)
    {
      // Crea varias variables de tipo entero
        int dia, mes, anio, suma, digito1, digito2, digito3, digito4, sumafinal;
        //Crea un objeto llamado "entrada" haciendo uso de la utilidad Scanner asociado al dispositivo de entrada.
        Scanner entrada = new Scanner(System.in);
        //Hace aparecer un texto en pantalla y además permite la introducción de un dato, por eso se usa "printf" ya que utiliza una cadena de formato
        System.out.printf("Introduzca su día de nacimiento: ");
        //Define la variable anteriormente creada "dia" con el dato introducido que ha sido leido por el objeto creado anteriormente usando la clase Scanner "entrada" de un número entero (por eso "entrada.nextInt")
        dia = entrada.nextInt();
        //Hace aparecer un texto en pantalla y además permite la introducción de un dato, por eso se usa "printf" ya que utiliza una cadena de formato
        System.out.printf("Introduzca su mes de nacimiento: ");
        //Define la variable anteriormente creada "mes" con el dato introducido que ha sido leido por el objeto creado anteriormente usando la clase Scanner "entrada" de un número entero (por eso "entrada.nextInt")
        mes = entrada.nextInt();
        //Hace aparecer un texto en pantalla y además permite la introducción de un dato, por eso se usa "printf" ya que utiliza una cadena de formato
        System.out.printf("Introduzca su año de nacimiento: ");
        //Define la variable anteriormente creada "anio" con el dato introducido que ha sido leido por el objeto creado anteriormente usando la clase Scanner "entrada" de un número entero (por eso "entrada.nextInt")
        anio = entrada.nextInt();
        //Define la variable anteriormente creada "suma" con la suma de todos los datos introducidos anteriormente
        suma = dia + mes + anio;
        
        //Define la variable anteriormente creada "digito1" con un calculo de la suma para poder obtener el primer digito
        digito1 = suma / 1000;
        //Define la variable anteriormente creada "digito2" con un calculo de la suma para poder obtener el segundo digito
        digito2 = suma / 100 % 10;
        //Define la variable anteriormente creada "digito3" con un calculo de la suma para poder obtener el tercer digito
        digito3 = suma / 10 % 10;
        //Define la variable anteriormente creada "digito4" con un calculo de la suma para poder obtener el cuarto digito
        digito4 = suma % 10;
        //Define la variable anteriormente creada "sumafinal" sumando todos los digitos.
        sumafinal = digito1 + digito2 + digito3 + digito4;
        // Hace aparecer en pantalla un texto que incluye el valor de la variable "sumafinal". Se usa printf porque es una cadena de formato.
        System.out.printf("Su número de la suerte es: " + sumafinal);
    }
//Cierra la clase y con ello el programa. Fin
}
