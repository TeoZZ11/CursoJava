import java.util.Scanner;
public class Esvocal {
    public static void main(String[] args) {
        Scanner cap = new Scanner (System.in);
        
        System.out.println("Ingresa una letra: ");
        char letra = cap.next().charAt(0);
        
        if(letra =='a' || letra == 'A'){
            System.out.printf("%s es vocal\n", letra);
        }else if(letra =='e' || letra == 'E'){
            System.out.printf("%s es vocal\n", letra);
        }else if(letra =='i' || letra == 'I'){
            System.out.printf("%s es vocal\n", letra);
        }else if(letra =='o' || letra == 'O'){
            System.out.printf("%s es vocal\n", letra);
        }else if(letra =='u' || letra == 'U'){
            System.out.printf("%s es vocal\n", letra);
        }else{
            System.out.printf("%s no es vocal\n", letra);
        }
    }
}

//Múltiples condiciones