
package examen2_francisco;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Francisco Santos
 */
public class AdminUsuarios {
    
    private ArrayList<Albums> albumes = new ArrayList();
    private ArrayList<Usuarios> usuarios = new ArrayList();

    private File archivo = new File("./Usuarios.cmb");
    
    public AdminUsuarios(ArrayList<Albums> albumes, ArrayList<Usuarios> usuarios) {
        this.albumes = albumes;
        this.usuarios = usuarios;
    }
    
    public void cargar(){
        FileInputStream f = null;
        ObjectInputStream a = null;
        try {
            f = new FileInputStream(archivo);
            a = new ObjectInputStream(f);
            a.readObject();
        } catch (Exception e) {
        }
        try {
            f.close();
            a.close();
        } catch (Exception e) {
        }
    }
    
    public void escribirArchivo(){
        FileOutputStream o = null;
        ObjectOutputStream a = null;
        try {
            o = new FileOutputStream(archivo);
            a = new ObjectOutputStream(o);
            a.writeObject(this);
        } catch (Exception e) {
        }
        try {
            o.close();
            a.close();
        } catch (Exception e) {
        }
    }
    
}
