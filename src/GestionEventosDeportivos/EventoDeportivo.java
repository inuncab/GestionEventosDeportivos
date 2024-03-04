package GestionEventosDeportivos;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class EventoDeportivo implements Ganador {
    protected String nombre;
    protected LocalDateTime fecha;
    protected String lugar;
    protected ArrayList<Participante> participantes;

    // Métodos
    // Constructor
    public EventoDeportivo(String nombre, LocalDateTime fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.participantes = new ArrayList<>();
    }

    // Método para inscribir participantes
    public boolean inscribirParticipante(Participante participante) {
        return this.participantes.add(participante);
    }

    // Método abstracto para obtener al ganador del evento
    public abstract ArrayList<Participante> obtenerGanador();

    public String toString() {
        return "   Nombre: "+this.nombre+"\n" +
                "   Fecha: "+this.fecha+"\n"+
                "   Lugar: "+this.lugar;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

}

