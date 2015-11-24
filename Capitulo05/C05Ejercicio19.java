  /**
 * Ejercicio 19
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe 
 * pedir por teclado. El carácter con el que se pinta la pirámide también se 
 * debe pedir por teclado.
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio19 {
  public static void main(String[] args) {
    
    System.out.println("Este programa dibuja una pirámide conociendo su altura.");
    
    System.out.print("Introduzca la altura: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el carácter que dibuje la pirámide: ");
    String caracter = System.console().readLine();
    
    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida - 1;
    
    while (altura <= alturaIntroducida) {  
      
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      for (i = 1; i < altura * 2; i++) {
        System.out.print(caracter);
      }
      System.out.println();
      altura++;
      espacios--;
    }
  }
}

