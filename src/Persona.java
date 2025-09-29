public abstract class Persona {
    private String nombre;
    private int Edad;
    private String Direccion;
    private String DNI;

    public Persona(String nombre, String direccion, int edad, String DNI) {
        this.nombre = nombre;
        Direccion = direccion;
        Edad = edad;
        this.DNI = DNI;
    }
}
