
package peliculas.modelo;


public interface ICatalogoPeli {
    void insertaPeli(Pelicula nombrePelicula);
    void listarPelicula();
    void buscarPelicula(String nombrePelicula);
}
