
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
    ArrayList<Albums> albums = new ArrayList();
    ArrayList<Usuarios> usuarios = new ArrayList();
    File archivo;

    public AdminUsuarios() {
    }

    public AdminUsuarios(String path) {
        archivo= new File(path);
    }

    public ArrayList<Albums> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Albums> albums) {
        this.albums = albums;
    }

    public ArrayList<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void cargarArchivoUsuarios() throws ClassNotFoundException{
        try {
            albums = new ArrayList();
            Albums temp;
            usuarios = new ArrayList();
            Usuarios temp2;
            if (archivo.exists()) {
                FileInputStream entrada=new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp=(Albums)objeto.readObject())!=null){
                        albums.add(temp);
                    }
                    while((temp2=(Usuarios)objeto.readObject())!=null){
                        usuarios.add(temp2);
                    }
                } catch (IOException ex) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (IOException ex) {
        }
    }
    
    public void escribirArchivoUsuarios(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw= new FileOutputStream(archivo);
            bw=new ObjectOutputStream(fw);
            for (Albums t : albums) {
                bw.writeObject(t);
            }
            for (Usuarios t : usuarios) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
