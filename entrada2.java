// Importa la utilidad Scanner que sirve para almacenar una cantidad introducida por teclado a una variable.
import java.util.Scanner;

// Clase llamada Sandra. Este programa indicará la actividad más adecuada según la temperatura que se introduzca.
public class Sandra {
// Inicia la ejecución del programa
    public static void main(String[] args)
    {
       // Crea la variable de tipo entero llamada temperatura 
        int temperatura;
       //Crea un objeto llamado "entrada" haciendo uso de la clase Scanner asociado al dispositivo de entrada.
        Scanner entrada = new Scanner(System.in);
       //Hace aparecer un texto en pantalla y además permite la introducción de un dato, por eso se usa "printf" ya que utiliza una cadena de formato
        System.out.printf("Introduzca la temperatura: ");
       //Define la variable anteriormente creada "temperatura" con el dato introducido que ha sido leido por el objeto creado anteriormente usando la clase Scanner "entrada" de un número entero (por eso "entrada.nextInt"):
        temperatura = entrada.nextInt();

       // Inicia una condicional. En caso que el valor de la variable "temperatura" sea mayor a 30 dará el siguiente resultado
        if(temperatura > 30){
          // Hace aparecer en pantalla un texto que incluye el valor de la variable "temperatura". Se usa printIn porque es una variable de tipo entero.
            System.out.println("La actividad más apropiada para la temperatura introducida (" + temperatura + "ºC) es: Natación");  
          }
       // En caso contrario se iniciará otra condicional. En caso de que 20 sea menor al valor de la variable "temperatura" se hará un segundo calculo que comprobará si el valor de la variable "temperatura" es menor o igual a 30, y en caso afirmativo dará el siguiente resultado:
        else if(20 < temperatura && temperatura <= 30){
          // Hace aparecer en pantalla un texto que incluye el valor de la variable "temperatura". Se usa printIn porque es una variable de tipo entero.
            System.out.println("La actividad más apropiada para la temperatura introducida (" + temperatura + "ºC) es: Tenis");
          }
       // En caso contrario se iniciará otra condicional. En caso de que 10 sea menor al valor de la variable "temperatura" se hará un segundo calculo que comprobará si el valor de la variable "temperatura" es menor o igual a 20, y en caso afirmativo dará el siguiente resultado: 
        else if(10 < temperatura && temperatura <= 20){
          // Hace aparecer en pantalla un texto que incluye el valor de la variable "temperatura". Se usa printIn porque es una variable de tipo entero.
            System.out.println("La actividad más apropiada para la temperatura introducida (" + temperatura + "ºC) es: Golf");
          }
       // En caso contrario se iniciará otra condicional. En caso de que 5 sea menor al valor de la variable "temperatura" se hará un segundo calculo que comprobará si el valor de la variable "temperatura" es menor o igual a 10, y en caso afirmativo dará el siguiente resultado:   
        else if(5 < temperatura && temperatura <= 10){
          // Hace aparecer en pantalla un texto que incluye el valor de la variable "temperatura". Se usa printIn porque es una variable de tipo entero.
            System.out.println("La actividad más apropiada para la temperatura introducida (" + temperatura + "ºC) es: Esquí");
          }
       // En caso contrario se iniciará otra condicional. En caso de que la temperatura sea menor o igual a 5 dará el siguiente resultado:
        else if(temperatura <= 5){
          // Hace aparecer en pantalla un texto que incluye el valor de la variable "temperatura". Se usa printIn porque es una variable de tipo entero.
            System.out.println("La actividad más apropiada para la temperatura introducida (" + temperatura + "ºC) es: Parchis");
          }
    }
    //Cierra la clase y con ello el programa. Fin
}
