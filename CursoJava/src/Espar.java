import java.util.Scanner;
public class Espar {
    public static void main(String[] args) {
        Scanner cap = new Scanner (System.in);
        
        System.out.println("Ingrese un número: ");
        int n = cap.nextInt();
        
        if (n != 0){
            if (n > 0){
                if(n % 2 == 0){
                    System.out.printf("El número %d es par positivo\n", n);
                }else{
                    System.out.printf("El número %d es impar positivo\n", n);
                }}
                else{
                        if(n % 2 == 0 ){
                            System.out.printf("El número %d es par negativo\n", n);
                        }else{
                            System.out.printf("El número %d es impar negativo\n", n);
                        }
                        
                        }
                    
    }else{
            System.out.printf("El número %d es neutro\n", n);}
    }
  
}

//Condiciones anidadas