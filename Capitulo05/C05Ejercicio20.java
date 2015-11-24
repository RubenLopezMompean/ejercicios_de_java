  /**
 * Ejercicio 20
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio20 {
  public static void main(String[] args) {
    
    System.out.println("Este programa dibuja una pirámide conociendo su altura.");
    
    System.out.print("Introduzca la altura: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el carácter que dibuje la pirámide: ");
    String caracter = System.console().readLine();
    
    int altura = 1;
    int i = 0;
    int espaciosDelante = alturaIntroducida - 1;
    int espaciosInterior = 0;
    
    while (altura < alturaIntroducida) {  
      
      //inserta espacios por delante
      for (i = 1; i <= espaciosDelante; i++) {
        System.out.print(" ");
      }
      System.out.print(caracter);
      //pinta la linea
      for (i = 1; i < espaciosInterior; i++) {
        System.out.print(" ");
      }
      if (altura > 1) {
        System.out.print(caracter);
      }
      System.out.println();
      altura++;
      espaciosDelante--;
      espaciosInterior = espaciosInterior + 2;
    }
    // base de la pirámide
    for (i = 1; i < altura*2; i++) {
      System.out.print(caracter);
    }
  }
}

