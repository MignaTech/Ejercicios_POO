package OrdenaMayor;
import javax.swing.JOptionPane;
public class Pedro1Test {
    public static void main(String[] args) {
        Pedro1 pedr; int[] num = new int[3];
        while (true) {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione una opción"
                    + "\n1) Ingresar los datos\n2) Utilizar los datos por default\n3) Salir"));
            if (op == 1) {
                num[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite el 1° número:"));
                num[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite el 2° número:"));
                num[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite el 3° número:"));
                pedr = new Pedro1(num);
            }
            else if(op==2) pedr = new Pedro1();
            else break;
            JOptionPane.showMessageDialog(null, pedr.mayor()
                    + pedr.ParImpar(Integer.parseInt(JOptionPane.showInputDialog(null, 
                            "Digite el numero a corroborar si es Par o Impar"))) 
                    + pedr.ordenar() + "\n");
        }
    }
}
