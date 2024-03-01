package GestionEventosDeportivos;

public class Participante {

    // Atributos
    protected String dni;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    // Métodos
    // Constructor que reciba todos los atributos e inicialice los valores
    public Participante(String dni, String nombre, String apellidos, int edad) {
        setDni(dni);
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
    }

    /**
     * Método que devuelve una cadena con la información del participante
     * @return Datos del participante
     */

    // Usamos @Override para indicar que estamos sobreescribiendo el método toString() de la clase padre Object
    @Override
    public String toString() {
        return "GestionEventosDeportivos.Participante: \n" +
                "   DNI: "+this.dni+"\n" +
                "   Nombre: "+this.nombre+"\n"+
                "   Apellidos: "+this.apellidos+"\n"+
                "   Edad: "+this.edad;
    }


    /**
     * Método que comprueba que dos participantes no sean iguales
     * @param p se pasa un participante por parámetro
     * @return true - si ambos participantes tienen el mismo dni | false - si sus dnis no coinciden
     */
    public boolean equals(Participante p) {
        if (this.dni.equals(p.dni)) {
            return true;
        }
        else {
            return false;
        }
    }

    // Getters y setters para cada atributo
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
