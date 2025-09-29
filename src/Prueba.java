public class Prueba {
    public static void main(String[] args) {
        Docente d1 = new Docente("Juan", "Calle 1", 20, "12345678", "123");
        Becario b1 = new Becario("Jose", "Calle 2", 21, "12345679", "104");

        pagar(d1);
        pagar(b1);
    }

    public static void pagar(Remunerado remunerado){
        String ccc = remunerado.getCcc();
        System.out.println("CCC: "+ccc);
    }
}
