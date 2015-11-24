/**
 * Ejercicio 10
 * 
 * @author Rubén López Mompeán
 */

public class C07Ejercicio10sinaux {
  public static void main(String[] args) {
    
    int[] num = new int[20];
    int i;
    int aux;
    int pares;
    int impares = 19;
    
    System.out.println("Muestra 20 numeros aleatorios");
        
    for (i = 0; i < 20; i++) {
      num[i] = (int)(Math.random() * 101);
      System.out.print(num[i] + " ");
    }
    
    System.out.println();
    
    // cuenta los pares
    System.out.println();
    System.out.println("Números ordenados con pares primeros e impares al final.");
    for (i = 0; i < 20; i++) {
      if(num[i] % 2 == 0) {
        System.out.print(num[i] + " ");
      }
    }
    for (i = 0; i < 20; i++) {
      if((num[i] % 2 != 0) || (num[i] == 1)) {
        System.out.print(num[i] + " ");
      }
    }
  }
}

