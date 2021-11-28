package Eventos;
/** @author: Miguel Ángel Sixtega Escribano */
// 1.- Importar las librerias awt y Event swing
import java.awt.*;
import java.awt.event.*;
// 2a. Extender la clase Frame
// 2b. Implementar la interfaz ActionListener
public class PrimerEvento extends Frame implements ActionListener{
    // 3. Declarar los objetos a utilizar. Eventos
    Label letiq, lnum1,lnum2; // Poner letreros en la ventana. No genera ninguna acción
    Button boton1,boton2; // Tomar decisiones si genera accion.
    TextField n1,n2,resul; // Es un buffer donde se leen valores. No genera acción
    
    public PrimerEvento(){
        // 4.- Crear la ventana y darle nombre
        super("Mi Primer Evento");
        // 5.- Generar un Layout que maneje la ventana
        setLayout(null);
        // 6.- Mostrar la ventana
        setVisible(true);
        // 7.- Tamaño de la ventana
        setLocationRelativeTo(null);
        setSize(600,280); // primer eje x y segundo eje y
        // 8.- Darle un color al frente y fondo de la pantalla
        setBackground(Color.blue);
        setForeground(Color.red);
    }
    
    // Generar los objetos que contendrá la ventana
    public void alta(){
        //9. Crear el objeto deseado
        boton1 = new Button("Suma");
        //10. Asociarle un Listener
        boton1.addActionListener(this);
        //11. DOnde colocarlo dentro de la ventana(posición)
        // 1. eje x  2. eje y  3. largo  4. ancho  PIXELES
        boton1.setBounds(50,50,70,30);
        add(boton1);     
    }
    public void actionPerformed(ActionEvent e){
        System.out.println("Aqui va la acción");
    }
    
    public static void main(String[] args) {
        PrimerEvento xx=new PrimerEvento();
        xx.alta();
    }
    
}
