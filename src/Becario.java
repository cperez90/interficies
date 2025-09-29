public class Becario extends Alumno implements Remunerado{
    private String ccc;

    public Becario(String nombre, String direccion, int edad, String DNI, String ccc) {
        super(nombre, direccion, edad, DNI);
        this.ccc = ccc;
    }

    @Override
    public String getCcc() {
        return ccc;
    }

    @Override
    public String sueldo() {
        return ccc + " - de Becario";
    }
}
