package HerenciaExten;
public class Estudiante extends Persona{
    private int codigoEstudiantes;
    private float notaFinal;

    public Estudiante(String nombre, String apellido, int edad,int codigoEstudiantes, float notaFinal) {
        super(nombre,apellido,edad);
        this.codigoEstudiantes = codigoEstudiantes;
        this.notaFinal = notaFinal;
    }
    public void mostrarDatos(){
        System.out.println("Nombre "+getNombre()+
                "\nApellido "+getApellido()+
                "\nEdad "+getEdad()+
                "\nCodigo "+codigoEstudiantes+
                "\nNota Final "+notaFinal);
    }
}
