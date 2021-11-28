package Recursion;

/*
 * @author: Miguel Ángel Sixtega Escribano
 */
public class Principal {
    
    public int factorial(int xnum) {
        if (xnum <= 1) {
            return 1;
        }
        return xnum * factorial(xnum - 1);
    }

    public void imprimirRec(int x) {
        if (x > 0) {
            imprimirRec(x - 1);
            System.out.println(x);
        }
    }
    
    public static void main(String[] args) {
        Principal prin = new Principal();
        System.out.println("Factorial " + prin.factorial(5));
        prin.imprimirRec(5);
    }
}
