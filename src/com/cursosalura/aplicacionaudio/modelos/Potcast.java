package com.cursosalura.aplicacionaudio.modelos;

public class Potcast extends Audio implements Clasificacion {
    private Persona locutor;
    private String tema;
    private int numeroDeEpisodios;
    private double duracionPotcastCompleto;
    private String descripcion;
    private int totalInvitados;

    public String getTema() {
        return tema;
    }

    public int getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }

    public double getDuracionPotcastCompleto() {
        return duracionPotcastCompleto;
    }

    public void setDuracionPotcastCompleto(double duracionPotcastCompleto) {
        this.duracionPotcastCompleto = duracionPotcastCompleto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getTotalInvitados() {
        return totalInvitados;
    }

    public void setLocutor(Persona locutor) {
        this.locutor = locutor;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setNumeroDeEpisodios(int numeroDeEpisodios) {
        this.numeroDeEpisodios = numeroDeEpisodios;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTotalInvitados(int totalInvitados) {
        this.totalInvitados = totalInvitados;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("✅ \033[96mEl nombre del tema del potcast es: " + "\033[93m" + getTema());
        System.out.println("✅ \033[96mEl nombre del locutor es: " + "\033[93m" + locutor.getNombre());
        System.out.println("✅ \033[96mEl nombre del episodio del potcast es: " + "\033[93m" + getTitulo());
        System.out.println("✅ \033[96mLa descripción del episodio del potcast es: " + "\033[93m" + getDescripcion());
        System.out.println("✅ \033[96mEl número de episodios que tiene el potcast es: " + "\033[93m" + getNumeroDeEpisodios());
        System.out.println("✅ \033[96mLa duración del episodio del potcast es: " + "\033[93m" + getDuracion() + " minutos");
        System.out.println("✅ \033[96mLa Duración total del todos los episodios del tema del potcast es: " + "\033[93m" + getDuracionPotcastCompleto() + " minutos");
        System.out.println("✅ \033[96mEl total de invitados al potcast es: " + "\033[93m" + getTotalInvitados());
        System.out.println("✅ \033[96mEl total de reproducciones del potcast que se lleva hasta el momento es: " + "\033[93m" + getTotalDeReproducciones());
        System.out.println("✅ \033[96mEl total de me gusta del potcast que se lleva hasta el momento es: " + "\033[93m" + getTotalMeGusta());
        System.out.println("✅ \033[96mLa fecha de publicación del potcast es: " + "\033[93m" + getFechaPublicacion() + "\033[0m");
    }

    @Override
    public int clasificacionCancionPotcast() {
        if (getTotalMeGusta() >= 12000) {
            return 9;
        } else {
            return 4;
        }
    }
}
