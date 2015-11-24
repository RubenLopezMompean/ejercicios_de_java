/**
 * Ejercicio 6
 * Escribe un programa que lea 15 números por teclado y que los almacene en un 
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 
 * 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra 
 * en la última posición debe pasar a la posición 0. Finalmente, muestra el 
 * contenido del array.
 * 
 * @author Rubén López Mompeán
 */

public class C07Ejercicio6 {
  public static void main(String[] args) {
    // Empieza desde el array 1    
    /* int [] numero = new int[15];
    
    System.out.println("Introduce 15 números:");
    
    for (int i = 0; i < 15; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
      
    }
    System.out.println("Números movidos una posición a la derecha: ");
    for (int i = 1; i < numero.length; i++) {
      System.out.print(numero[i] + "  ");
    }
    System.out.print(numero[0]);
    */
    
   //Empieza desde el array 15
    int[] numero = new int[15];
   
    System.out.println("Introduce 15 números:");
    
    for (int i = 0; i < 15; i++) {
      System.out.print("Introduzca el " + (i + 1)+ "º número: ");
      numero[i] = Integer.parseInt(System.console().readLine());
    }
  
      int ultimo = numero[14];
    for(int i = 14; i > 0; i--) {
          numero[i] = numero[i-1];
    }
    numero[0] = ultimo;
    for(int n = 0; n < 15; n++) {
      System.out.print(numero[n] + " ");
    }
  }
}
