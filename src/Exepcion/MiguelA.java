package Exepcion;

import java.util.Scanner;
import java.io.*;
import java.util.InputMismatchException;

public class MiguelA {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = { 6, 8, 0, 5, 2 };
    int a1 = 0;
    int resul = arr[0];
    FileInputStream entrada = null; // Esta linea esta bien no lleva modificacion
    try {
      entrada = new FileInputStream("fich1.txt"); // Esta linea esta bien no lleva modificacion
    } catch (FileNotFoundException ex) {
      System.out.println("No existe el archivo");
    }
    while (true) {
      try {
        System.out.print("Inserta numero: ");
        a1 = sc.nextInt();
        break;
      } catch (InputMismatchException e1) {
        System.out.println("Error. Dato erroneo");
        sc.next();
        continue;
      }
    }
    try {
      resul = arr[a1];
    } catch (ArrayIndexOutOfBoundsException e2) {
      System.out.println("Error. Indice fuera del arreglo");
    }
    System.out.println("El dato dentro del arreglo es: " + resul);
  }
}
