import java.util.ArrayList;
import java.util.List;

public interface Pokedex {

    public default void agregar(Pokemon pokemon) {


    }

    public default Pokemon buscar(String nombre) {

        return null;
    }



    public default void mostrar() {

    }
}
