  /**
 * Ejercicio 18
 * Escribe un programa que obtenga los números enteros comprendidos entre dos 
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio18 {
  public static void main(String[] args) {
    
    System.out.print("Este programa incrementa en 7 el primer número hasta");
    System.out.println("llegar lo más próximo al segundo número.");
    
    
    int primerNum;
    int segundoNum;
    
    do {
      System.out.print("\nDime un primer número: ");
      primerNum = Integer.parseInt(System.console().readLine());
      
      System.out.print("Dime un segundo número: ");
      segundoNum = Integer.parseInt(System.console().readLine());
      
      if (primerNum == segundoNum) {
        System.out.println("Los números deben ser diferentes");
        }
    } while (primerNum == segundoNum);
    
    if (primerNum > segundoNum) {
      int aux = primerNum;
      segundoNum = segundoNum;
      segundoNum = aux;
    }
    int contador = primerNum;
    System.out.println("\nLos numeros son los siguientes:");
    
    while (contador < segundoNum) {
      
      if ((contador < segundoNum) && (contador + 7 < segundoNum)){
        System.out.print(contador + ", ");
      } else {
        System.out.print(contador);
      }
      contador = contador + 7;
    }
    System.out.print(".");
  }
}


