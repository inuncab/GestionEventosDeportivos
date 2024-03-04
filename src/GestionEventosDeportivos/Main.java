package GestionEventosDeportivos;

import java.time.LocalDateTime;


import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Instanciar un evento de carrera
        EventoDeportivo carrera = new Carrera("Maratón de la Ciudad", LocalDateTime.of(2024, 3, 10, 8, 0), "Ciudad Principal", 42.195);

        // Crear algunos participantes para la carrera
        Participante corredor1 = new Participante("78451236T", "Ignacio", "Nuñez", 180);
        Participante corredor2 = new Participante("78412587Y", "Victor", "Chacon", 98);

        // Inscribir los participantes en la carrera
        carrera.inscribirParticipante(corredor1);
        carrera.inscribirParticipante(corredor2);

        // Instanciar un torneo de fútbol
        TorneoDeFutbol torneo = new TorneoDeFutbol("Torneo de Fútbol", LocalDateTime.of(2024, 5, 1, 14, 0), "Estadio Principal", new Equipo("Equipo 1"));

        // Crear algunos equipos para el torneo
        Equipo equipo1 = new Equipo("Real madrid");
        Equipo equipo2 = new Equipo("Barcelona");

        // Inscribir los equipos en el torneo
        torneo.inscribirParticipante(equipo1);
        torneo.inscribirParticipante(equipo2);

        // Añadir jugadores al primer equipo
        Participante jugador1 = new Participante("78152113C", "Paco", "Perez", 25);
        Participante jugador2 = new Participante("44444444D", "juan", "Dominguezº", 28);

        boolean jugadorAñadido = equipo1.anhadirjugador(jugador1);
        System.out.println(jugadorAñadido ? "Jugador añadido correctamente al equipo 1" : "El jugador ya está en el equipo 1");

        jugadorAñadido = equipo1.anhadirjugador(jugador2);
        System.out.println(jugadorAñadido ? "Jugador añadido correctamente al equipo 1" : "El jugador ya está en el equipo 1");

        // Mostrar información de los eventos, participantes, equipos y jugadores
        System.out.println("\nInformación de la carrera:");
        System.out.println(carrera);

        System.out.println("\nInformación del torneo de fútbol:");
        System.out.println(torneo);

        System.out.println("\nInformación del primer equipo:");
        System.out.println(equipo1);

        // Eliminar un jugador del equipo
        boolean jugadorEliminado = equipo1.eliminarJugador(jugador1);
        System.out.println(jugadorEliminado ? "Jugador eliminado correctamente del equipo 1" : "El jugador no está en el equipo 1");

        // Mostrar información del equipo después de eliminar jugadores
        System.out.println("\nEquipo 1 después de eliminar jugadores:");
        System.out.println(equipo1);

        // Determinar y mostrar el ganador de cada evento
        Participante ganadorCarrera = carrera.obtenerGanador();
        System.out.println("\nEl ganador de la carrera es: " + ganadorCarrera);

        Participante ganadorTorneo = torneo.obtenerGanador();
        System.out.println("El ganador del torneo de fútbol es: " + ganadorTorneo);

        // Mostrar la lista de equipos de mayor puntuación a menor puntuación
        System.out.println("\nLista de equipos del torneo de fútbol ordenados por puntuación:");
        // Supongamos que tenemos un método para obtener la lista de equipos ordenados por puntuación
        //ArrayList<Equipo> equiposOrdenados = torneo.obtenerEquiposOrdenadosPorPuntuacion();
        //for (Equipo equipo : equiposOrdenados) {
        //    System.out.println(equipo);
        //
    }
}