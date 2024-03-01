package GestionEventosDeportivos;

public class ParticipanteCarrera extends Participante {

    // Atributos
    private double tiempo;

    // Métodos
    public ParticipanteCarrera(String dni, String nombre, String apellidos, int edad, double tiempo) {
        super(dni, nombre, apellidos, edad);

        setTiempo(tiempo);
    }

    @Override
    public String toString() {
        //String cadenaParticipante;
        //cadenaParticipante = super.toString();
        return super.toString() +
                "Tiempo: " + this.tiempo;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
}
