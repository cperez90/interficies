public class Becario extends Alumno implements Remunerado{

    public Becario(String nombre, String direccion, int edad, String DNI) {
        super(nombre, direccion, edad, DNI);
    }

    @Override
    public int sueldo() {
        return 0;
    }
}
