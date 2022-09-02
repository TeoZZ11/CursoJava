
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        OUTER:
       while(true){
           System.out.println("  JUEGO - ADIVINA EL NÚMERO  \n");
           System.out.println("1- Nivel fácil\n"
                   + "2- Nivel intermedio\n"
                   + "3- Nivel difícil\n"
                   + "4- Salir");
           System.out.println("INGRESE UNA OPCIÓN: ");
           Scanner leer = new Scanner(System.in);
           int opcion = leer.nextInt();
           
           switch(opcion){
               case 1:
                   jugar(10);
                break;
               case 2:
                   jugar(7);
                break;
                case 3:
                   jugar(5);
                break;
                case 4:
                    System.out.println("PROGRAMA FINALIZADO");;
                break OUTER;
                default:
                    System.out.println("OPCIÓN INCORRECTA");
                break;    
           }
       }
    }
    
    static void jugar(int vidas){
        int numeroRandom = (int)(Math.random()*101);
        int numeroElegido = -1;
        
        Scanner leer = new Scanner(System.in);
        
        while(numeroElegido != numeroRandom){
            System.out.print("Digite un número que esté entre 1 y 100: ");
            numeroElegido = leer.nextInt();
            
            if(numeroRandom < numeroElegido){
                System.out.println("El número es más pequeño");
                vidas--;
            }else if(numeroRandom > numeroElegido){
                System.out.println("El número es más grande");
                vidas--;
            }
            
            if(vidas==0){
                System.out.println("----------------------");
                System.out.println("|    GAME OVER :(    |");
                System.out.println("----------------------");
                break;
            }
            System.out.println("-------------------------");
            System.out.printf("|    Te quedan %d vidas   |\n",vidas);
            System.out.println("-------------------------");
        }
        if(numeroElegido==numeroRandom){
            System.out.println("------------------------------");
            System.out.println("   ¡FELICIDADES, HAS GANADO!   ");
            System.out.println("------------------------------");
        }
    }
    
}
