package OrdenaMayor;
public class Pedro1 {
    public int[] abc = {3,1,2};
    public Pedro1(){}
    public Pedro1(int[] num){
        abc = num;
    }
    public String mayor() {
        int mayor = 0;
        for (int i = 0; i < abc.length; i++) {
            if(abc[i]>mayor) mayor=abc[i];
        }
        return String.valueOf("Mayor = " + mayor);
    }
    public String ParImpar(int numero) {
        if (numero % 2 == 0) return "\n\nEl numero "+numero+" es Par";
        else return "\n\nEl numero "+numero+" es Impar";
    }
    public String ordenar(){
        java.util.Arrays.sort(abc);
        String mensaje = "\n\nOrden Mayor a menor\n";
        for (int i = abc.length-1; i >= 0; i--)
            mensaje+=" [ "+abc[i]+" ] ";
        return String.valueOf(mensaje);
    }
}
