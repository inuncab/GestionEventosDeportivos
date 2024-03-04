package GestionEventosDeportivos;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TorneoDeFutbol extends EventoDeportivo {

    private ArrayList<Equipo> equipos;

    public TorneoDeFutbol(String nombre, LocalDateTime fecha, String lugar, Equipo e) {
        super(nombre, fecha, lugar);

        //this.equipos = equipo;
    }

    @Override
    public ArrayList<Participante> obtenerGanador() {
        int puntajeMayor = Integer.MIN_VALUE;
        ArrayList<Participante> participantesGanadores = new ArrayList<>();

        for (int i = 0; i < equipos.size(); i++) {

            Equipo equipo = equipos.get(i);

            int puntosDeEquipo = equipo.getPuntos();
            if (puntosDeEquipo > puntajeMayor) {
                puntajeMayor = puntosDeEquipo;
                participantesGanadores = equipo.getJugadores();
            }

        }

        return participantesGanadores;
    }

    public boolean inscribirEquipo(Equipo equipo) {
        return this.equipos.add(equipo);
    }
}
