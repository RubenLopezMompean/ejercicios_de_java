/**
 * Ejercicio 13
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 *
 * @author Rubén López Mompeán
 */

public class C04Ejercicio13 {
  
 public static void main (String[] args){
   
   int aux;
   
    System.out.println("Este programa ordena 3 números enteros \n");
    System.out.print("Introduzca el primer número: ");
    int primerNum = Integer.parseInt (System.console().readLine());

    System.out.print("Introduzca el segundo número: ");
    int segundoNum = Integer.parseInt (System.console().readLine());
    
    System.out.print("Introduzca el tercer número: ");
    int tercerNum = Integer.parseInt (System.console().readLine());
    
    if (primerNum > segundoNum) {
      aux = primerNum;
      primerNum = segundoNum;
      segundoNum = aux;
    }
    
    if (segundoNum > tercerNum) {
      aux = segundoNum;
      segundoNum = tercerNum;
      tercerNum = aux;
    }
    if (primerNum > segundoNum) {
      aux = primerNum;
      primerNum = segundoNum;
      segundoNum = aux;
    }
    
    System.out.print("Los números ordenados de menor a mayor son ");
    System.out.println(primerNum + ", " + segundoNum + ", " + tercerNum + " .");
    
  }
}
