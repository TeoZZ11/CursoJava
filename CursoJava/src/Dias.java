//Switch
import java.util.Scanner;
public class Dias {
    public static void main(String[] args) {
        Scanner cap = new Scanner (System.in);
        
        System.out.println("Ingresa un número que concuerde con un día de la semana: ");
        int dia = cap.nextInt();
        String nombreDia = null;
        
        switch(dia){
            case 1:
                nombreDia="Lunes";
            break;
            case 2:
                nombreDia="Martes";
            break;
            case 3:
                nombreDia="Miércoles";
            break;
            case 4:
                nombreDia="Jueves";
            break;
            case 5:
                nombreDia="Viernes";
            break;
            case 6:
                nombreDia="Sábado";
            break;
            case 7:
                nombreDia="Domingo";
            break;
            default:
                System.out.printf("El número %d no concuerda con un día de la semana\n", dia);
        }
        
        System.out.println("El día de la semana es: "+nombreDia);
        
    }
}
