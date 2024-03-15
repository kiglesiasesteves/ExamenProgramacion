import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        PokedexImpl pokedex = new PokedexImpl();
        Pokemon pokemon = new Pokemon();
        Ataques ataques = new Ataques();
        Scanner sc = new Scanner(System.in);

        final String REGISTRARPOKEMON = "REGISTRAR POKEMON";
        final String REGISTRARATAQUE = "REGISTRAR ATAQUE";
        final String MOSTRAR = "MOSTRAR";
        final String BUSCAR = "BUSCAR";
        final String SALIR = "SALIR";

        String opcion;
        do {
            opcion = JOptionPane.showInputDialog("Registrar Pokemon \n Registrar ataque \n Mostrar  \n Buscar  \n Salir ");

            switch (opcion.toUpperCase()) {
                case REGISTRARPOKEMON:
                    String info = JOptionPane.showInputDialog("Deseas añadir información adicional?");

                    if (info.equalsIgnoreCase("SI")) {
                        RegistrarPokemonInfoAdicional(pokedex);

                    } else {
                        RegistrarPokemon(pokedex);

                    }

                    break;
                case REGISTRARATAQUE:
                    RegistrarAtaque();
                    String registrado= JOptionPane.showInputDialog("A que pokemon quieres registrar el ataque?");
                    if(registrado.equals(pokemon.getNombre())){
                        JOptionPane.showMessageDialog(null, "El pokemón ahora tiene este ataque");
                    }else{
                        JOptionPane.showMessageDialog(null, "EL pokemon no está registrado.");
                    }

                    break;


                case MOSTRAR:
                    pokedex.mostrar();
                    break;
                case BUSCAR:
                    BuscarPokemon(pokedex);
                    break;

                case SALIR:
                    break;
            }
        } while (!opcion.equalsIgnoreCase(SALIR));

    }

    private static void BuscarPokemon(PokedexImpl pokedex) {
        String busqueda = JOptionPane.showInputDialog("Qué nombre deseas buscar?");
        pokedex.buscar(busqueda);
    }

    private static void RegistrarAtaque() {
        String nombreAtaque = JOptionPane.showInputDialog("Introduce el nombre: ");
        String tipoAtauqe = JOptionPane.showInputDialog("Introduce el tipo: ");
        int Poder = Integer.parseInt(JOptionPane.showInputDialog("Introduce el poder"));
        Ataques nuevoAtaque = new Ataques(nombreAtaque, tipoAtauqe, Poder);
    }

    private static void RegistrarPokemon(PokedexImpl pokedex) {
        CrearPOkemon result = getCrearPokemon();


        Pokemon nuevoPokemon = new Pokemon(result.nombre(), result.tipo(), result.nivel());
        pokedex.agregar(nuevoPokemon);
    }



    private static void RegistrarPokemonInfoAdicional(PokedexImpl pokedex) {
        CrearPOkemon result = getCrearPokemon();
        String infoadicional=JOptionPane.showInputDialog("Añade la info adicional");

        Pokemon nuevoPokemon = new Pokemon(result.nombre(), result.tipo(), result.nivel(), infoadicional);
        pokedex.agregar(nuevoPokemon);
    }

    private static CrearPOkemon getCrearPokemon() {
        String nombre = JOptionPane.showInputDialog("Nombre del POkemon:");
        String tipo = JOptionPane.showInputDialog("Tipo del POkemon:");
        int nivel = 0;
        try {
            nivel = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nivel:"));
        }
        catch( ArithmeticException e ) {
            System.out.println( "Matemáticas locas!" );
        }
        catch( Exception e ) {
            System.out.println( "Se ha producido un error" );
        }
        CrearPOkemon result = new CrearPOkemon(nombre, tipo, nivel);
        return result;
    }

private record CrearPOkemon(String nombre, String tipo, int nivel) {
    }
}
