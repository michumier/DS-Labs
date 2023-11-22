package model;

import google.maps.Coordenadas;
import google.maps.Marcador;
import google.maps.Navegador;

public class Monumento{

    private String nombre;
    private String autor;
    private String dirección;
    private Navegador nav = new Navegador();

    public Monumento(String nombre, String autor, String dirección) {
        setNombre(nombre);
        setAutor(autor);
        setDirección(dirección);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

	
}
