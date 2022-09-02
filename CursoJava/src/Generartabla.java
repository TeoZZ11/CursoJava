import java.util.Scanner;
public class Generartabla {
    public static void main(String[] args) {
        Scanner cap = new Scanner (System.in);
        
        System.out.println("Ingrese un número: ");
        int n = cap.nextInt();
        
        int c = 0;
        while(c <= 10){
            System.out.printf("%d * %d = %d\n", n,c,(n*c));
            c++;
        }
    }
}

//While