package com.cursosalura.aplicacionaudio.modelos;

public class Persona {
    private String nombre;
    private int edad;
    private String correoElectronico;
    private String listaDeReproduccion;
    private String listaDeMeGusta;
    private String historialDeReproducciones;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getListaDeReproduccion() {
        return listaDeReproduccion;
    }

    public String getListaDeMeGusta() {
        return listaDeMeGusta;
    }

    public String getHistorialDeReproducciones() {
        return historialDeReproducciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setListaDeReproduccion(String listaDeReproduccion) {
        this.listaDeReproduccion = listaDeReproduccion;
    }

    public void setListaDeMeGusta(String listaDeMeGusta) {
        this.listaDeMeGusta = listaDeMeGusta;
    }

    public void setHistorialDeReproducciones(String historialDeReproducciones) {
        this.historialDeReproducciones = historialDeReproducciones;
    }
}
