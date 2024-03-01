package GestionEventosDeportivos;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class EventoDeportivo implements Ganador {
    private double distancia;
    private String nombre;
    private LocalDateTime fecha;
    private String lugar;
    private final ArrayList<Participante> participantes;

    // Constructor
    public EventoDeportivo(String nombre, LocalDateTime fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.participantes = new ArrayList<>();
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

    // Método para inscribir participantes
    public boolean inscribirParticipante(Participante par) {
        return this.participantes.add(par);
    }

    // Método abstracto para obtener al ganador del evento
    public abstract Participante obtenerGanador();
}
