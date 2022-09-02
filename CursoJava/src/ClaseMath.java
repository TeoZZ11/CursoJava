
public class ClaseMath {
    public static void main(String[] args) {
        //Valor de pi
        System.out.println(Math.PI);
        
        //Exponentes
        System.out.println((int)(Math.pow(5, 2)));
        
        //Números aleatorios
        System.out.println(Math.random());
        
        //Número random entre 0-100 covertido a entero
        int numeroRandom = (int)(Math.random()*101);
        System.out.println(numeroRandom);
        
        //Raíz cuadrada
        System.out.println((int)(Math.sqrt(64)));
        
        //Número mayor y mínimo
        System.out.println(Math.max(14, 4));
        System.out.println(Math.min(14, 4));
        
        //Redondeo de números
        System.out.println(Math.round(7.8));
        
        //Redondeo de números con decimales
        double moneda = (double)Math.round(3.4287*100d)/100;
        System.out.println(moneda);
    }
}
