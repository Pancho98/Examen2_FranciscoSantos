
package examen2_francisco;


public class PlayList {
    private String nombre;

    public PlayList() {
    }

    public PlayList(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
