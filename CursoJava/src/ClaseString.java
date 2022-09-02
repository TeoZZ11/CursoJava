
public class ClaseString {
    public static void main(String[] args) {
        String nombre = "Mateo";
        System.out.println(nombre.charAt(3));
        System.out.println(nombre.length());
        
        for(int i = 0; i<nombre.length(); i++){
            System.out.println(nombre.charAt(i));
        }
        
        System.out.println(nombre.substring(0, 2));
        
        //Minúscula
        System.out.println(nombre.toLowerCase());
        
        //Mayúscula
        System.out.println(nombre.toUpperCase());
        
        //Reemplazo de caracteres
        nombre = "M a t e o";
        System.out.println(nombre.replace(" ", "-"));
        
        //Comparación de caracteres (True-False)
        System.out.println("Perro".equals("perro"));
    }
}
