
package conversormoneda;

import java.util.Scanner;


public class ConversorMoneda {

    
    public static void main(String[] args) {
        EXTERNA:
       while(true){
           System.out.println("CONVERSOR DE MONEDAS");
           System.out.println("1- Pesos Colombianos\n"
                   + "2- Pesos Argentinos\n"
                   + "3- Pesos Mexicanos\n"
                   + "4- Salir");
           System.out.println("INGRESE UNA OPCIÓN: ");
           Scanner leer = new Scanner(System.in);
           char opcion = leer.next().charAt(0);
           
           switch(opcion){
               case '1':
                   convertir(4396.28, "Pesos Colombianos");
                break;
               case '2':
                   convertir(136.02, "Pesos Argentinos");
                break;
                case '3':
                   convertir(20.18, "Pesos Mexicanos");
                break;
                case '4':
                    System.out.println("PROGRAMA FINALIZADO");;
                break EXTERNA;
                default:
                    System.out.println("OPCIÓN INCORRECTA");
                break;    
           }
       }
    }
    
    static void convertir(double valorDolar, String pais){
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de %s: ",pais);
        double cantidadMoneda = leer.nextDouble();
        
        double dolares = cantidadMoneda / valorDolar;
        
        dolares = (double)Math.round(dolares*100d)/100;
        
        System.out.println("----------------------------------------");
        System.out.println("|      Tienes $"+dolares+" Dólares      |");
        System.out.println("-----------------------------------------");
    }
}
