//Iteracíón de datos
public class Iterar {
    public static void main(String[] args) {
        String[] nombres ={"Mateo", "Carolina", "Manuel", "Melissa"}; 
        
        //Con While
        int c=0;
        
        while(c<nombres.length){
            System.out.println(nombres[c]);
            c++;
        }
        
        //Con For
        for(int i = 0; i<nombres.length; i++){
            System.out.println(nombres[i]);
        }
        
        //Con For-Each
        for(String hola : nombres){
            System.out.println(hola);
        }
    }
}
