
import javax.swing.*;
import java.util.ArrayList;

public class PokedexImpl extends Pokemon implements Pokedex {

    ArrayList<Pokemon> listaPokemon = new ArrayList<>();

    @Override
    public void agregar(Pokemon pokemon) {
        listaPokemon.add(pokemon);
    }

    @Override
    public Pokemon buscar(String nombre) {
        for (Pokemon pokemon : listaPokemon) {
            if (pokemon.getNombre().equals(nombre)) {
                JOptionPane.showMessageDialog(null, "Nombre "+ pokemon.getNombre());
                                JOptionPane.showMessageDialog(null, "Tipo "+ pokemon.getTipo());
                                JOptionPane.showMessageDialog(null, "Nivel "+ pokemon.getNivel());
            }

            }
        return null;
    }

    @Override
    public void mostrar() {
        for (Pokemon pokemon : listaPokemon) {
            JOptionPane.showMessageDialog(null, "Nombre: "+ pokemon.getNombre());
            JOptionPane.showMessageDialog(null, "Tipo: "+ pokemon.getTipo());
            JOptionPane.showMessageDialog(null, "Nivel: "+ pokemon.getNivel());
            if (pokemon.infoAdicional.isEmpty()){

            }else{
                JOptionPane.showMessageDialog(null, "Info adicional: "+ pokemon.getInfoAdicional());

            }
        }
    }

}
