package archivos;
/** @author Miguel Ángel Sixtega Escribano */
import java.util.Scanner;
public class PrimerArchivoTest {
    public static void main(String[] args) {
        PrimerArchivo xx = new PrimerArchivo("Ejemplo.txt");
        Scanner lee = new Scanner(System.in);
        String nombre,matricula,telefono,carrera;
        double calif;
//        System.out.print("Digite Matricula: "); matricula = lee.nextLine();
//        System.out.print("Digite Nombre   : "); nombre =    lee.nextLine();
//        System.out.print("Digite Telefono : "); telefono =  lee.nextLine();
//        System.out.print("Digite Carrera  : "); carrera =   lee.nextLine();
//        System.out.print("Digite Promedio : "); calif =     lee.nextDouble();
//        xx.grabaArch(matricula+"|"+nombre+"|"+telefono+"|"+carrera+"|"+calif);
        xx.leeArch();
        
    }
    
}
