package com.cursosalura.aplicacionaudio.modelos;

public class Favorito {
    private Persona usuario;
    private Audio cancionPotcast;
    private String fechaMacadoFavorito;
    private String tipoDeFavorito;

    public void setCancionPotcast(Audio cancionPotcast) {
        this.cancionPotcast = cancionPotcast;
    }

    public String getFechaMacadoFavorito() {
        return fechaMacadoFavorito;
    }

    public String getTipoDeFavorito() {
        return tipoDeFavorito;
    }

    public void setUsuario(Persona usuario) {
        this.usuario = usuario;
    }

    public void setFechaMacadoFavorito(String fechaMacadoFavorito) {
        this.fechaMacadoFavorito = fechaMacadoFavorito;
    }

    public void setTipoDeFavorito(String tipoDeFavorito) {
        this.tipoDeFavorito = tipoDeFavorito;
    }

    public void mostrarInformacionFavorito() {
        System.out.println("✅ \033[96mEl nombre de la persona es: " + "\033[93m" + usuario.getNombre());
        System.out.println("✅ \033[96mLa edad de " + usuario.getNombre() + " es: " + "\033[93m" + usuario.getEdad());
        System.out.println("✅ \033[96mSu correo electrónico es: " + "\033[93m" + usuario.getCorreoElectronico());
        System.out.println("✅ \033[96mSu lista de reproducción es: " + "\033[93m" + usuario.getListaDeReproduccion());
        System.out.println("✅ \033[96mSu lista de me gusta es: " + "\033[93m" + usuario.getListaDeMeGusta());
        System.out.println("✅ \033[96mSu historial de reproducciones es: " + "\033[93m" + usuario.getHistorialDeReproducciones());
        System.out.println("✅ \033[96mLa Fecha que se marco como favorito a " + "\"" + cancionPotcast.getTitulo() + "\"" +
                " es: " + "\033[93m" + getFechaMacadoFavorito());
        System.out.println("✅ \033[96mEl Favorito es de tipo: " + "\033[93m" + getTipoDeFavorito() + "\033[0m");
    }

    public void ingresaCancionPotcastFavorito(Clasificacion clasificacion) {
        if (clasificacion.clasificacionCancionPotcast() > 8) {
            System.out.printf("""
                    💥💥 \033[97m¡Gracias por tu excelente calificación! Nos alegra saber que""" + " \"" + cancionPotcast.getTitulo() + "\" %n" +
                     """
                     ha sido de tu agrado. Seguiremos creando experiencias musicales que te inspiren y acompañen. 💥💥%n%n""");
        } else {
            System.out.printf("""
                    ⭐⭐ Lamentamos que""" + " \"" + cancionPotcast.getTitulo() + "\" %n" +
                    """
                    no haya cumplido del todo tus expectativas. Agradecemos tus comentarios, ya que nos ayudan a mejorar y ofrecerte%n""" +
                    """
                     una mejor experiencia en el futuro.⭐⭐%n%n""");
        }
    }
}
