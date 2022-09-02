
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra=cap.nextLine();
        
        if(esPalindromo(palabra)){
            System.out.println("Es un palíndromo");
        }else{
            System.out.println("No es un palíndromo");
        }
    }
    
    static boolean esPalindromo(String palabra){
        palabra = palabra.replace(" ", "");
        palabra = palabra.toLowerCase();
        
        StringBuilder palabraInvertida = new StringBuilder();
        
        for(int i = palabra.length()-1; i>=0; i--){
            palabraInvertida.append(palabra.charAt(i));
        }
        return palabra.equals(palabraInvertida.toString());
    }
}
