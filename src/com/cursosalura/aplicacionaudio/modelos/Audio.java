package com.cursosalura.aplicacionaudio.modelos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Audio {
    private String titulo;
    private double duracion;
    private int totalDeReproducciones;
    private int totalMeGusta;
    private String fechaPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalMeGusta() {
        return totalMeGusta;
    }

    public void setTotalMeGusta(int totalMeGusta) {
        this.totalMeGusta = totalMeGusta;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void meGusta() {
        this.totalMeGusta++;
    }

    public void reproducido() {
        this.totalDeReproducciones++;
    }

    public abstract void mostrarInformacion();

    public String formatearFecha(int year, int month, int day) {
        // Crear una instancia de LocalDate con la fecha deseada
        LocalDate fecha = LocalDate.of(year, month, day);
        // Definir el patrón de formato
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Formatear la fecha como una cadena
        this.fechaPublicacion = fecha.format(formato);
        this.setFechaPublicacion(fechaPublicacion);
        return this.getFechaPublicacion();
    }
}
