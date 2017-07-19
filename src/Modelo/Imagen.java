package Modelo;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class Imagen {
    
    BufferedImage image;
    String rutaBusqueda;
    String rutaAlmacenamiento;
    JFileChooser buscador;
    
    public void mostrarImagen(BufferedImage foto, JLabel imagen){
        ImageIcon icono = new ImageIcon(foto);
        Icon icon = new ImageIcon(icono.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
        imagen.setIcon(icon);
    }
    
    public void abrirImagen(JLabel img) throws IOException{
        buscador = new JFileChooser();
        int valor = buscador.showOpenDialog(null);
        if(valor == JFileChooser.APPROVE_OPTION){       // Se aprueba la busqueda.
            File archivo = buscador.getSelectedFile();  // Se obtiene el archivo Imagen.
            rutaBusqueda=archivo.getAbsolutePath();             // Se Obtiene la ruta.
            image = ImageIO.read(new File(rutaBusqueda));       // Se lee la Imagen.
            mostrarImagen(image, img);
        }
    }
    public void guardarImagen(BufferedImage img, String codNino) throws IOException{
        String rutaRelativa = System.getProperty("user.dir");
        rutaAlmacenamiento = rutaRelativa+"\\src\\imagenes\\"+codNino+".jpg"; //Se toma el codigo de cada niño para guardar la foto de cada uno
        //revisar la ruta al momento de crear el .jar, tal vez noes necesario el src
        ImageIO.write(img, "JPG", new File(rutaAlmacenamiento));
    }
    
    public void mostrarImagenGuardada(JLabel imagen, String ruta) throws IOException{
        BufferedImage imagenMostrar;
        imagenMostrar = ImageIO.read(new File(ruta));
        ImageIcon icono = new ImageIcon(imagenMostrar);
        Icon icon = new ImageIcon(icono.getImage().getScaledInstance(150,220, Image.SCALE_DEFAULT));//Se asigna tamaño por defecto al JLabel
        imagen.setIcon(icon);
    }
    
     public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public String getRutaBusqueda() {
        return rutaBusqueda;
    }

    public void setRutaBusqueda(String rutaBusqueda) {
        this.rutaBusqueda = rutaBusqueda;
    }

    public String getRutaAlmacenamiento() {
        return rutaAlmacenamiento;
    }

    public void setRutaAlmacenamiento(String rutaAlmacenamiento) {
        this.rutaAlmacenamiento = rutaAlmacenamiento;
    }
}


