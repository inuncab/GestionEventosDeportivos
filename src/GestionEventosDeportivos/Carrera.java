package GestionEventosDeportivos;

import java.time.LocalDateTime;

public class Carrera extends EventoDeportivo {

    private double distancia;

    public Carrera(String nombre, LocalDateTime fecha, String lugar, double distancia) {
        super(nombre, fecha, lugar);

        this.distancia = distancia;
    }

    @Override
    public Participante obtenerGanador() {
            return null;
    }
}