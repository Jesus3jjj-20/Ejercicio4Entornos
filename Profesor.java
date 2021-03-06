import java.util.List;

public class Profesor extends Persona{
    String str;
    int edad;
    List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono) {
        super(numeroDeTelefono);
    }

    public void printInformacionPersonal(){
        System.out.println("Nombre: " + str);
        System.out.println("Edad: " + edad);
        System.out.println("Tel�fono: " + numeroDeTelefono);
    }

    public void printTodaLaInformacion(){
        printInformacionPersonal();
        for (Prestamo p: prestamos) {
            System.out.println(p);
        }
    }

}
