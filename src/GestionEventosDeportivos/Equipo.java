package GestionEventosDeportivos;

import java.util.ArrayList;
import java.util.Objects;

public class Equipo implements Comparable {

    private String nombre;
    private ArrayList<Participante> jugadores;
    private int puntos;


    public Equipo(String nombre) {

        setNombre(nombre);
        setPuntos(0);
        setJugadores(new ArrayList<>());

    }


    // Métodos

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public boolean anhadirjugador(Participante jugador) {

        // Comprueba si el jugador está ya en el equipo
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getDni().equals(jugador.getDni())) {

                // Jugador ya existe
                return false;
            }
        }

        // Si el jugador no está en el equipo, lo añade
        jugadores.add(jugador);
        return true;
    }

    public boolean eliminarJugador(Participante jugador) {

        // Comprueba si el jugador está ya en el equipo
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getNombre().equals(jugador.getNombre()) &&
                    jugadores.get(i).getApellidos().equals(jugador.getApellidos())) {

                // Si el jugador se encuentra, se elimina
                jugadores.remove(jugador);
                return true;
            }
        }

        // Si el jugador no se encuentra
        return false;
    }

    public String toString() {
        return "Participante: \n" +
                "   Nombre: "+this.nombre+"\n" +
                "   Puntos: "+this.puntos+"\n"+
                "   Jugadores: "+this.jugadores;
    }


    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Equipo equipo = (Equipo) obj;
        return Objects.equals(nombre, equipo.nombre);
    }

    public int compareTo(Equipo eq) {
        return Integer.compare(this.puntos, eq.getPuntos());
    }


    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Participante> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Participante> jugadores) {
        this.jugadores = jugadores;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
