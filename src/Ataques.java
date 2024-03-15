
public class Ataques {
    private String nombre;
    private String tipo;
    private int poder;

    public Ataques() {
    }

    public Ataques(String nombre, String tipo, int poder) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.poder = poder;
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

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Ataques{" + "nombre=" + nombre + ", tipo=" + tipo + ", poder=" + poder + '}';
    }


}



