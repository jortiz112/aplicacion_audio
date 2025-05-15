package com.cursosalura.aplicacionaudio.modelos;

public class Album {
    private String titulo;
    private int numeroCanciones;
    private double duracionTotal;

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroCanciones() {
        return numeroCanciones;
    }

    public double getDuracionTotal() {
        return duracionTotal;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroCanciones(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }

    public void setDuracionTotal(double duracionTotal) {
        this.duracionTotal = duracionTotal;
    }
}
