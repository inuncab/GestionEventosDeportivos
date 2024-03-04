package GestionEventosDeportivos;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TorneoDeFutbol extends EventoDeportivo {

    private ArrayList<Equipo> equipos;

    public TorneoDeFutbol(String nombre, LocalDateTime fecha, String lugar, Equipo equipo) {
        super(nombre, fecha, lugar);

        //this.equipos = equipo;
    }

    @Override
    public Participante obtenerGanador() {
        return null;
    }
}
