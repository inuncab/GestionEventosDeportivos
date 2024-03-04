package GestionEventosDeportivos;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Carrera extends EventoDeportivo {

    private double distancia;

    public Carrera(String nombre, LocalDateTime fecha, String lugar, double distancia) {
        super(nombre, fecha, lugar);

        this.distancia = distancia;
    }


    @Override
    public ArrayList<Participante> obtenerGanador() {
        double tiempoMinimo = Double.MAX_VALUE;
        ParticipanteCarrera participanteMin = null;

        for (int i = 0; i < participantes.size(); i++) {

            double tiempo = participantes.get(i).getTiempo();

            if (tiempo < tiempoMinimo) {
                tiempoMinimo = tiempo;
                participanteMin = participantes.get(i);
            }
        }

        ArrayList<Participante> ganadores = new ArrayList<>();
        if (participanteMin != null) {
            ganadores.add(participanteMin);
        }

        return ganadores;
    }
}