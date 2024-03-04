package GestionEventosDeportivos;

import java.time.LocalDateTime;

public class Carrera extends EventoDeportivo{
    public Carrera(String nombre, LocalDateTime fecha, String lugar) {
        super(nombre, fecha, lugar);
    }

    @Override
    public Participante obtenerGanador() {
        return null;
    }
}
