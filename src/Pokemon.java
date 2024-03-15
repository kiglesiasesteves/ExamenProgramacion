import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import static javax.swing.JOptionPane.showInputDialog;


public class Pokemon extends Ataques{

    private String nombre;
    private String tipo;
    private int nivel;
    ArrayList <Ataques> listaAtaques = new ArrayList<>();

    String infoAdicional;

    public String getInfoAdicional() {
        return infoAdicional;
    }

    public void setInfoAdicional(String infoAdicional) {
        this.infoAdicional = infoAdicional;
    }

    public Pokemon(String nombre, String tipo, int nivel, String infoAdicional) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.infoAdicional=infoAdicional;
    }
    public Pokemon() {
    }

    public Pokemon(String nombre, String tipo, int nivel) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList<Ataques> getListaAtaques() {
        return listaAtaques;
    }

    public void setListaAtaques(ArrayList<Ataques> listaAtaques) {
        this.listaAtaques = listaAtaques;
    }



    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", tipo=" + tipo + ", nivel=" + nivel + ", listaAtaques=" + listaAtaques + '}';
    }

    public void registrarAtaques (Ataques ataques){
        listaAtaques.add(ataques);

    }

}



