package com.cursosalura.aplicacionaudio.modelos;

public class Comentario {
    private String textoComentario;
    private Persona usuarioDejoComentario;
    private String fechaComentario;

    public String getTextoComentario() {
        return textoComentario;
    }

    public String getFechaComentario() {
        return fechaComentario;
    }

    public void setTextoComentario(String textoComentario) {
        this.textoComentario = textoComentario;
    }

    public void setUsuarioDejoComentario(Persona usuarioDejoComentario) {
        this.usuarioDejoComentario = usuarioDejoComentario;
    }

    public void setFechaComentario(String fechaComentario) {
        this.fechaComentario = fechaComentario;
    }

    public void mostrarInformacionComentario() {
        System.out.println("✅ \033[96mEl comentario de " + usuarioDejoComentario.getNombre() + " es: " + "\033[93m" + getTextoComentario());
        System.out.println("✅ \033[96mLa fecha que ingreso el comentario es: " + "\033[93m" + getFechaComentario() + "\033[0m\n");
    }
}
