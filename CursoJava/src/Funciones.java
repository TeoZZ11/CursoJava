
public class Funciones {
    public static void main(String[] args) {
        //Estos son...
        saludar("Mateo", 18);
        sumar(15, 10);
        System.out.println("El resultado de la resta es: "+restar(4, 2));
        System.out.println(hola("Maria"));
        System.out.println(mas(45, 50)); //O System.out.println(mas(4.5, 4.5));
        //Argumentos 
    }
                        //Estos son parámetros
    static void saludar(String nombre, int edad){
        System.out.printf("Hola %s, tu edad es %d\n",nombre,edad);
    }
    
    static void sumar(int a, int b){
        int sumar = a + b;
        System.out.println("El resultado de la suma es: "+sumar);
    }
    
    //Funciones retornables tipo int y String
    static int restar(int c, int d){
        return c - d;
    }
    
    static String hola (String nombre){
        return "Muy buenos días "+nombre;
    }
    
    //Sobrecarga de funciones
    static int mas(int e, int f){
        return e + f;
    }
    
    static double mas(double e, double f){
        return e +  f;
    }
}
