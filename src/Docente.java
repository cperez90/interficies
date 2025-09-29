import java.util.List;

public class Docente extends Persona implements Remunerado{
    private String ccc;
    private List<String> cursosImporte;

    public Docente(String nombre, String direccion, int edad, String DNI,String ccc) {
        super(nombre, direccion, edad, DNI);
        this.ccc = ccc;
    }
    @Override
    public String getCcc() {
        return ccc;
    }

    @Override
    public String sueldo() {
        return ccc + "- de Docente";
    }
}
