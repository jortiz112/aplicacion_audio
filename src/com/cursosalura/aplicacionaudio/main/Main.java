package com.cursosalura.aplicacionaudio.main;

import com.cursosalura.aplicacionaudio.modelos.*;

public class Main {
    public static void main(String[] args) {
        //Datos de la canción
        Cancion miCancion = new Cancion();
        //Le asigno el nombre de la canción
        miCancion.setTitulo("Blinding Lights");
        //Le asigno la duración de la canción
        miCancion.setDuracion(3.20);
        //número inicial de reproducciones de la cancion
        miCancion.setTotalDeReproducciones(6000);
        //número inicial de me gusta de la cancion
        miCancion.setTotalMeGusta(8500);
        //formateo de la fecha
        miCancion.formatearFecha(2019, 11, 29);
        Persona miArtista = new Persona();
        //Le asigno el nombre del artista a la clase Persona
        miArtista.setNombre ("The Weeknd");
        //Le asigno el nombre de la persona a la clase Cancion
        miCancion.setArtista(miArtista);
        Album miAlbum = new Album();
        //Le asigno el título del álbum a la clase Album
        miAlbum.setTitulo("After Hours");
        //Le asigno el nombre del álbum a la clase Cancion
        miCancion.setAlbum(miAlbum);
        //Le asigno el número de canciones que tiene el álbum donde se encuentra la canción
        miAlbum.setNumeroCanciones(14);
        //Le asigno la duración total de todas las canciones del álbum
        miAlbum.setDuracionTotal(56.19);
        Genero miGenero = new Genero();
        //Le asigno el nombre del género a la clase Genero
        miGenero.setNombre("Synth-pop");
        //Le asigno el genero a la clase cancion
        miCancion.setGenero(miGenero);
        //Le signo la descipción a la clase Genero
        miGenero.setDescripcion("El synth-pop es un subgénero del pop que se caracteriza " +
                "por el uso prominente de sintetizadores electrónicos. Nació en los años 80 y " +
                "suele tener un sonido retro, melódico, con ritmos bailables y una producción muy pulida.");
        miCancion.setCompositores("Abel Tesfaye (The Weeknd), Max Martin, Oscar Holter, " +
                "Ahmad Balshe (Belly), Jason Quenneville (DaHeala)");

        // Persona que reprodujo, dió me gusta y comentó la cancion Blinding Lights
        Persona miPersona = new Persona();
        //Le asigno el nombre a la clase Persona
        miPersona.setNombre("Camila Rodríguez");
        Favorito miCancionFavorita = new Favorito();
        //Leasigno el usuario a la clase Favorito
        miCancionFavorita.setUsuario(miPersona);
        //Le asigno la canción a la clase Favorito
        miCancionFavorita.setCancionPotcast(miCancion);
        Comentario miCancionComentario = new Comentario();
        //Le asigno el usuario que dejo el comentario a la clase Comentario
        miCancionComentario.setUsuarioDejoComentario(miPersona);
        //Le asigno la edad en la clase Persona
        miPersona.setEdad(27);
        //Le asigno el correo electrónico en la clase Persona
        miPersona.setCorreoElectronico("camila.rodriguez92@email.com");
        //Le asigno una lista de reproducción de canciones en la clase Persona
        miPersona.setListaDeReproduccion("Blinding Lights, Pop Hits Forever, Energía para el gym, " +
                "Favoritas 2020, Viajes nocturnos");
        //Le asigno una lista de me gusta en la clase Persona
        miPersona.setListaDeMeGusta("Blinding Lights - The Weeknd, Don't Start Now - Dua Lipa, " +
                "Watermelon Sugar - Harry Styles, Levitating - Dua Lipa feat. DaBaby, Save Your Tears - The Weeknd");
        //Le asigno un historial de reproducciones en la clase Persona
        miPersona.setHistorialDeReproducciones("Blinding Lights - reproducida 17 veces, " +
                "Save Your Tears - reproducida 10 veces, Levitating - reproducida 9 veces, " +
                "Don't Start Now - reproducida 7 veces, Watermelon Sugar - reproducida 6 veces");
        //Le asigno la fecha de marcado favorito de la canción Blinding Lights en la clase Favorito
        String formatearFecha;
        Cancion formateoFechaFavorito = new Cancion();
        formatearFecha = formateoFechaFavorito.formatearFecha(2025, 03, 15);
        miCancionFavorita.setFechaMacadoFavorito(formatearFecha);
        //Le reproduce a la canción Blinding Lights
        miCancion.reproducido();
        //Le da me gusta a la canción Blinding Lights
        miCancion.meGusta();
        //Le asigno el tipo de favorito en la clase Favorito
        miCancionFavorita.setTipoDeFavorito("Canción \"Blinding Lights\"");
        //Le asigno el texto de comentario del usuario sobre la canción Blinding Lights en la clase Comentario
        miCancionComentario.setTextoComentario("¡Simplemente icónica! Me transporta cada vez que la escucho. 💫🌟✨🌠🌌🌒");
        //Le asigno la fecha de ingreso del texto del usuario sobre la canción Blinding Lights en la clase Comentario
        String formatearFech;
        Cancion formateoFechaComentario = new Cancion();
        formatearFech = formateoFechaComentario.formatearFecha(2025, 03, 16);
        miCancionComentario.setFechaComentario(formatearFech);

        //Datos del potcast
        Potcast miPotcast = new Potcast();
        //Le asigno el título del episodio
        miPotcast.setTitulo("El futuro de la inteligencia artificial: ¿Aliado o amenaza?");
        //Le asigno la duración del episodio
        miPotcast.setDuracion(72);
        //Le asigno el total de reproducciones inicial del episodio
        miPotcast.setTotalDeReproducciones(48560);
        //Le asigno el total de me gusta inicial del episodio
        miPotcast.setTotalMeGusta(10845);
        //Le asigno y formateo la fecha de publicación del episodio
        String formateoFechPotcast;
        Cancion formateoFechaPotcast = new Cancion();
        formateoFechPotcast = formateoFechaPotcast.formatearFecha(2025, 03, 12);
        miPotcast.setFechaPublicacion(formateoFechPotcast);
        //Le asigno el nombre del locutor del potcast en la clase Persona
        Persona miLocutor = new Persona();
        miLocutor.setNombre("Andrea Morales");
        //Le asigno el nombre del locutor del potcast en la clase Potcast
        miPotcast.setLocutor(miLocutor);
        //Le asigno el nombre del tema del potcast
        miPotcast.setTema("Tecnología y Sociedad");
        //Le asigno el número de episodios del potcast completo
        miPotcast.setNumeroDeEpisodios(28);
        //Le asigno la duración total de todos los episodios del potcast
        miPotcast.setDuracionPotcastCompleto(2016);
        //Le asigno la descipción del episodio del potcast
        miPotcast.setDescripcion("En este episodio, exploramos el impacto de la " +
                "inteligencia artificial en distintos aspectos de la vida cotidiana: " +
                "desde la automatización laboral hasta la ética en el uso de algoritmos. " +
                "Conversamos sobre el equilibrio entre innovación y responsabilidad, y " +
                "cómo prepararnos para convivir con máquinas cada vez más inteligentes.");
        //Le asigno el total de invitados del potcast
        miPotcast.setTotalInvitados(2);

        // Persona que reprodujo, dió me gusta y comentó el potcast
        // "El futuro de la inteligencia artificial: ¿Aliado o amenaza?"
        Persona miPersonaPotcast = new Persona();
        //Le asigno el nombre a la clase Persona
        miPersonaPotcast.setNombre("Laura Méndez");
        Favorito miPotcastFavorita = new Favorito();
        //Leasigno el usuario a la clase Favorito
        miPotcastFavorita.setUsuario(miPersonaPotcast);
        //Le asigno el potcast a la clase Favorito
        miPotcastFavorita.setCancionPotcast(miPotcast);
        Comentario miPotcastComentario = new Comentario();
        //Le asigno el usuario que dejo el comentario a la clase Comentario
        miPotcastComentario.setUsuarioDejoComentario(miPersonaPotcast);
        //Le asigno la edad en la clase Persona
        miPersonaPotcast.setEdad(29);
        //Le asigno el correo electrónico en la clase Persona
        miPersonaPotcast.setCorreoElectronico("laura.mendez.ai@gmail.com");
        //Le asigno una lista de reproducción de Potcasts en la clase Persona
        miPersonaPotcast.setListaDeReproduccion("El futuro de la inteligencia artificial: ¿Aliado o amenaza?, " +
                "Neurociencia para principiantes, Tecnología y sociedad: una relación en evolución, " +
                "La historia oculta del internet, Emprendimiento en la era digital");
        //Le asigno una lista de me gusta en la clase Persona
        miPersonaPotcast.setListaDeMeGusta("El futuro de la inteligencia artificial: ¿Aliado o amenaza?, " +
                "Tecnología y sociedad: una relación en evolución, Emprendimiento en la era digital");
        //Le asigno un historial de reproducciones en la clase Persona
        miPersonaPotcast.setHistorialDeReproducciones("2025/04/03 – Neurociencia para principiantes, " +
                "2025/04/06 – Tecnología y sociedad: una relación en evolución, 2025/04/08 – La historia oculta del internet, " +
                "2025/04/10 – El futuro de la inteligencia artificial: ¿Aliado o amenaza?, " +
                "2025/04/12 – Emprendimiento en la era digital");
        //Le asigno la fecha de marcado favorito del episodio del Potcast en la clase Favorito
        String formatearFechaPotcast;
        Cancion formateoFechaFavoritoPotcast = new Cancion();
        formatearFechaPotcast = formateoFechaFavoritoPotcast.formatearFecha(2025, 04, 10);
        miPotcastFavorita.setFechaMacadoFavorito(formatearFechaPotcast);
        //Le reproduce el episodio del potcast "El futuro de la inteligencia artificial: ¿Aliado o amenaza?"
        miPotcast.reproducido();
        //Le da me gusta al episodio del potcast "El futuro de la inteligencia artificial: ¿Aliado o amenaza?"
        miPotcast.meGusta();
        //Le asigno el tipo de favorito en la clase Favorito
        miPotcastFavorita.setTipoDeFavorito("Potcast \"El futuro de la inteligencia artificial: ¿Aliado o amenaza?\"");
        //Le asigno el texto de comentario del usuario sobre el episodio del potcast en la clase Comentario
        miPotcastComentario.setTextoComentario("Una mirada muy completa sobre el potencial y los riesgos de la IA. " +
                "Me hizo reflexionar sobre cómo se deben tomar decisiones éticas en su desarrollo. " +
                "¡Excelente episodio! 💫🌟✨🌠🌌🌒");
        //Le asigno la fecha de ingreso del texto del usuario sobre el episodio del potcst en la clase Comentario
        String formatearFechPotcast;
        Cancion formateoFechaComentarioPotcast = new Cancion();
        formatearFechPotcast = formateoFechaComentarioPotcast.formatearFecha(2025, 04, 11);
        miPotcastComentario.setFechaComentario(formatearFechPotcast);

        //Salida de los datos de la canción
        System.out.println("\n💫🌟✨🌠🌌 \033[95mInformación Inicial de la Canción: " + miCancion.getTitulo() + " 🌌🌠✨🌟💫\n");
        miCancion.mostrarInformacion();
        System.out.println("\n💫🌟✨🌠🌌 \033[95mInformación de " + miPersona.getNombre() + " que reprodujo y dío me gusta " +
                "la canción: " + miCancion.getTitulo() + " 🌌🌠✨🌟💫\n");
        miCancionFavorita.mostrarInformacionFavorito();
        miCancionComentario.mostrarInformacionComentario();

        //Salida de los datos del potcast
        System.out.println("\n💫🌟✨🌠🌌 \033[95mInformación Inicial del Potcast: " + miPotcast.getTitulo() + " 🌌🌠✨🌟💫\n");
        miPotcast.mostrarInformacion();
        System.out.println("\n💫🌟✨🌠🌌 \033[95mInformación de " + miPersonaPotcast.getNombre() + " que reprodujo y dío me gusta " +
                "al potcast : " + miPotcast.getTitulo() + " 🌌🌠✨🌟💫\n");
        miPotcastFavorita.mostrarInformacionFavorito();
        miPotcastComentario.mostrarInformacionComentario();
        System.out.println("\033[95mClasificación: \n");
        //Ingresa la canción como favorita
        miCancionFavorita.ingresaCancionPotcastFavorito(miCancion);
        //Ingresa el potcast como favorito
        miPotcastFavorita.ingresaCancionPotcastFavorito(miPotcast);


    }
}
