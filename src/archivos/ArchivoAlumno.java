package archivos;
/** @author Miguel Ángel Sixtega Escribano */
/*OK Imprimir el nombre de los alumnos que estudien informatica.
OKUn metodo que indique el nombre(s) del(os) alumno(s) con mayor promedio
OK Un metodo que me obtenga el promedio de los alumnos de la carrera que le pases
como parametro
OK Un metodo que indique cuantos alumnos han reprobado (Calif <6)

OK Realizar un metodo que cree el archivo Excelencia.txt donde va a estar los alumnos
que tengan mas de 8.5 de calificaciòn

OK Un metodo que lea la matricula del alumno, la busque en el archivo e indique, su
nombre carrera y promedio. Si no lo encuentra poner el msg.

Un metodo que lea un promedio e indique el nombre y promedio de los que lo tienes
superior al leido.*/

import java.io.*;
public class ArchivoAlumno {
    public File f,exc;
    
    public ArchivoAlumno(String xnom){
        f = new File(xnom);
        exc = new File("Excelencia.txt");
    }
    
    public void creaArch(File xarch){
        try{
           xarch.createNewFile();
        }catch(IOException e){}
    }
    
    public String obten(int inicio, String cadena){
        int c = 0; 
        String cade = ""; 
        for( int i=0; i<cadena.length();i++){
            if (cadena.charAt(i)=='|' ) c++; 
            if (inicio==c && cadena.charAt(i)!='|')
                cade += cadena.charAt(i);
            if (inicio<c) break;
        }
        return cade;
    }
    
        public void alumCarr(String xcarr, boolean xprom){
        String aux,mat,nom,tel,carr;
        double promFinal,sumCalif=0,conAlumnos=0;
        try{
            if (!f.exists()){
                System.out.println("No existe el archivo");
                return;
            }
            FileReader r = new FileReader(f);
            BufferedReader br = new BufferedReader(r);
            while(true){ 
                aux=br.readLine();
                if (aux==null) break;
                if (xprom){
                    if (obten(3,aux).equals(xcarr)){
                        sumCalif += Double.parseDouble(obten(4,aux));
                        conAlumnos++;
                    }
                }else
                    if (obten(3,aux).equals(xcarr)) 
                        System.out.println(obten(1,aux)+" "+obten(4,aux)); 
            } 
        }catch(IOException e){System.out.println("No existe el archivo");}
        if (xprom){
            promFinal = sumCalif/conAlumnos;
            System.out.println("El promedio de "+xcarr+" es de : "+promFinal);
        }
    }

    public void buscaNombre(String xnom){
        String aux;
        boolean encontrado = false;
        try{
            if (!f.exists()){
                System.out.println("No existe el archivo");
                return;
            }
            FileReader r = new FileReader(f);
            BufferedReader br = new BufferedReader(r);
            while(true){ 
                aux=br.readLine();
                if (aux==null) break;
                if (xnom.equals(obten(1,aux))){
                    System.out.println("Nombre  : "+obten(1,aux));
                    System.out.println("Carrera : "+obten(3,aux));
                    System.out.println("Promedio: "+obten(4,aux));
                    encontrado = true;
                    break;
                }
            } 
        }catch(IOException e){System.out.println("No existe el archivo");}
        if (!encontrado) System.out.println("No se encuentra el cliente en la BD");
    }

    public void mayorPromedio(double xprom){
        String aux;
        double calif=0;
        try{
            if (!f.exists()){
                System.out.println("No existe el archivo");
                return;
            }
            FileReader r = new FileReader(f);
            BufferedReader br = new BufferedReader(r);
            while(true){ 
                aux=br.readLine();
                if (aux==null) break;
                calif = Double.parseDouble(obten(4,aux));
                if (calif>=xprom){
                    System.out.println("Nombre   : "+obten(1,aux));
                    System.out.println("Promedio : "+obten(4,aux));
                    System.out.println("------------------------");
                }
            } 
        }catch(IOException e){System.out.println("No existe el archivo");}
    }
   
    
    public void reprobado(){
        String aux;
        double calif=0,conRep=0;
        try{
            if (!f.exists()){
                System.out.println("No existe el archivo");
                return;
            }
            FileReader r = new FileReader(f);
            BufferedReader br = new BufferedReader(r);
            while(true){ 
                aux=br.readLine();
                if (aux==null) break;
                calif = Double.parseDouble(obten(4,aux));
                if (calif<6) conRep++;
            } 
        }catch(IOException e){System.out.println("No existe el archivo");}
        System.out.println("La cantidad de reprobados es: "+conRep);
        
    }

    public void archExcelencia(){
        String aux;
        double calif=0,conRep=0;
        try{
            if (!f.exists()){
                System.out.println("No existe el archivo");
                return;
            }
            FileReader r = new FileReader(f);
            BufferedReader br = new BufferedReader(r);
            while(true){ 
                aux=br.readLine();
                if (aux==null) break;
                calif = Double.parseDouble(obten(4,aux));
                if (calif>=8.5){
                    grabaArch(exc,aux);
                }
            } 
        }catch(IOException e){System.out.println("No existe el archivo");}
    }

    
    public double califMayor(){
        String aux;
        double calif=0,califMayor=0;
        try{
            if (!f.exists()){
                System.out.println("No existe el archivo");
                return 0.00;
            }
            FileReader r = new FileReader(f);
            BufferedReader br = new BufferedReader(r);
            while(true){ 
                aux=br.readLine();
                if (aux==null) break;
                calif = Double.parseDouble(obten(4,aux));
                if (calif>califMayor) califMayor = calif;
            } 
        }catch(IOException e){System.out.println("No existe el archivo");}
        System.out.println("La mayor calificacion es es: "+califMayor);
        return califMayor;
    }

    
    public void mejorAlumno(){
        String aux;
        double calif=0,califMayor=0;
        califMayor = califMayor();
        System.out.println("Los mejores alumnos son: ");
        try{
            if (!f.exists()){
                System.out.println("No existe el archivo");
                return;
            }
            FileReader r = new FileReader(f);
            BufferedReader br = new BufferedReader(r);
            while(true){ 
                aux=br.readLine();
                if (aux==null) break;
                if (califMayor == Double.parseDouble(obten(4,aux)))
                    System.out.println("Nombre: "+obten(1,aux));
            } 
        }catch(IOException e){System.out.println("No existe el archivo");} 
    }


    public void grabaArch(File xarch, String cadena){
        try{
            if (!xarch.exists()) creaArch(xarch);
            FileOutputStream fos = new FileOutputStream(xarch,true);
            OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
           BufferedWriter bw = new BufferedWriter(osw);
            bw.write(cadena+"\r\n");//escribimos en el archivo alt-92
            bw.close();
        }catch(IOException e){}
    }
}
