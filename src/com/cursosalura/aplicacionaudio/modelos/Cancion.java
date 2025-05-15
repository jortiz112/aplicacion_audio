package com.cursosalura.aplicacionaudio.modelos;

public class Cancion extends Audio implements Clasificacion {
    private Persona artista;
    private Album album;
    private Genero genero;
    private String compositores;

    public void setArtista(Persona artista) {
        this.artista = artista;
    }

    public String getCompositores() {
        return compositores;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setCompositores(String compositores) {
        this.compositores = compositores;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("✅ \033[96mEl nombre de la canción es: " + "\033[93m" + getTitulo());
        System.out.println("✅ \033[96mEl nombre del artista de la canción es: " + "\033[93m" + artista.getNombre());
        System.out.println("✅ \033[96mEl nombre del Album donde se encuentra la canción es: " + "\033[93m" + album.getTitulo());
        System.out.println("✅ \033[96mEl número de canciones del álbum es: " + "\033[93m" + album.getNumeroCanciones());
        System.out.println("✅ \033[96mLa duración total del álbum es: " + "\033[93m" + album.getDuracionTotal() + " minutos");
        System.out.println("✅ \033[96mEl género de la canción es: " + "\033[93m" + genero.getNombre());
        System.out.println("✅ \033[96mLa descripción del género es: " + "\033[93m" + genero.getDescripcion());
        System.out.println("✅ \033[96mEl o los compositores son: " + "\033[93m" + getCompositores());
        System.out.println("✅ \033[96mLa duración del la canción es: " + "\033[93m" + getDuracion() + " minutos");
        System.out.println("✅ \033[96mEl total de reproducciones de la canción que se lleva hasta el momento es: " + "\033[93m" + getTotalDeReproducciones());
        System.out.println("✅ \033[96mEl total de me gusta de la canción que se lleva hasta el momento es: " + "\033[93m" + getTotalMeGusta());
        System.out.println("✅ \033[96mLa fecha de publicación de la canción es: " + "\033[93m" + getFechaPublicacion() + "\033[0m");
    }

    @Override
    public int clasificacionCancionPotcast() {
        if (getTotalMeGusta() >= 8000) {
            return 9;
        } else {
            return 3;
        }
    }
}
