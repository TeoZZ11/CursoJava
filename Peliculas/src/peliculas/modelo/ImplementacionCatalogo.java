
package peliculas.modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ImplementacionCatalogo implements ICatalogoPeli{
    private final ArrayList<String> listaPeliculas;
    
    @Override
    public void insertaPeli(Pelicula nombrePelicula) {
        this.listaPeliculas.add(nombrePelicula.toString());
    }

    public ImplementacionCatalogo() {
        this.listaPeliculas = new ArrayList<>();
    }

    @Override
    public void listarPelicula() {
        JOptionPane.showMessageDialog(
                null,
                this.listaPeliculas,
                "LISTA DE PELÍCULAS",
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void buscarPelicula(String nombrePelicula) {
        String resultado = null;
        for(var pelicula: this.listaPeliculas){
            if(pelicula.equals(nombrePelicula)){
                resultado=pelicula;
                break;
            } else{
                resultado=pelicula;
            }
        }
        
        if(nombrePelicula.equals(resultado)){
            JOptionPane.showMessageDialog(
                    null, 
                    "Resultado -> " + resultado,
                    "BUSCAR PELÍCULA",
                    JOptionPane.QUESTION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(
                    null, 
                    "No se encontró la película ->" + nombrePelicula,
                    "BUSCAR PELÍCULA",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
