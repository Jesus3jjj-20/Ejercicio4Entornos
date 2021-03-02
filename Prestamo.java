public class Prestamo {

    private String nombrePrestamo;

    public Prestamo(String nombrePrestamo) {
        this.nombrePrestamo = nombrePrestamo;
    }

    @Override
    public String toString() {
        return "Préstamo => " + nombrePrestamo;
    }
}
