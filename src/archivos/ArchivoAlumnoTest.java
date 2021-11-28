package archivos;
/** @author Miguel Ángel Sixtega Escribano */

import java.util.Scanner;

public class ArchivoAlumnoTest {
    
    public static void main(String[] args) {
        ArchivoAlumno xx = new ArchivoAlumno("Alumno.txt");
        Scanner lee = new Scanner(System.in);
        String nombre,matricula,telefono,carrera;
        double calif;
        /*
        System.out.print("Digite Matricula: "); matricula = lee.nextLine();
        System.out.print("Digite Nombre   : "); nombre =    lee.nextLine();
        System.out.print("Digite Telefono : "); telefono =  lee.nextLine();
        System.out.print("Digite Carrera  : "); carrera =   lee.nextLine();
        System.out.print("Digite Promedio : "); calif =     lee.nextDouble();
        xx.grabaArch(xx.f,matricula+"|"+nombre+"|"+telefono+"|"+carrera+"|"+calif);
        xx.alumCarr("MEC",false);
        System.out.println("");
        xx.alumCarr("MEC",true);
        xx.reprobado();
        System.out.println("");
        xx.mejorAlumno();*/
        xx.archExcelencia();
        System.out.print("Teclee el nombre del cliente a buscar: ");
        nombre = lee.nextLine();
        xx.buscaNombre(nombre);
        System.out.print("Tecle el promedio: ");
        calif = lee.nextDouble();
        xx.mayorPromedio(calif);
    }
}
