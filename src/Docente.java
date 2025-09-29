import java.util.List;

public class Docente extends Persona implements Remunerado{
    private List<String> cursosImporte;

    public Docente(String nombre, String direccion, int edad, String DNI) {
        super(nombre, direccion, edad, DNI);
    }

    @Override
    public int sueldo() {
        return 0;
    }
}
