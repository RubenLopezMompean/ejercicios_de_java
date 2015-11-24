  /**
 * Ejercicio 24
 * Escribe un programa que lea un número n e imprima una pirámide de números con 
 * n filas como en la siguiente figura:
 * 
 *                                1 
 *                               121
 *                              12321 
 *                             1234321
 * 
 * @author Rubén López Mompeán
 */
public class C05Ejercicio24 {
  public static void main(String[] args) {
    
    System.out.println("Este programa dibuja una pirámide conociendo su altura.");
    
    System.out.print("Introduzca la altura: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
   
    int altura = 1;
    int i = 0;
    int espacio = alturaIntroducida - 1;
    
    while (altura <= alturaIntroducida) {  
      
      //inserta espacios
      for (i = 1; i <= espacio; i++) {
        System.out.print(" ");
      }
      //pinta la linea
      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      System.out.println();
      
      altura++;
      espacio--;
    }
  }
}
