  /**
 * Ejercicio 10
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. 
 * El carácter con el que se pinta cada línea se elige de forma aleatoria entre 
 * uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud 
 * aleatoria entre 1 y 40 caracteres.
 * 
 * @author Rubén López Mompeán
 */
public class C06Ejercicio10 {
  public static void main(String[] args) {
    
    System.out.print("Este programa pinta en pantalla diez líneas, cada línea ");
    System.out.println(" con un caracter especial con una longitud entre 1 y 40.");

    String caracter = "";
    int relleno;
    int linea;
    
    for (int i = 1; i <= 10; i++) {
    
    relleno = (int)(Math.random() * 6 + 1);
    linea = (int)(Math.random()*40)+1;
    switch (relleno) {
      case 1:
        caracter = "*";
        break;
      case 2:
        caracter = "-";
        break;
      case 3:
        caracter = "=";
        break;
      case 4:
        caracter = ".";
        break;
      case 5:
        caracter = "|";
        break;
      case 6:
        caracter = "@";
        break;
      default:
      }
      for (int l = 1; l <= linea; l++) {
        System.out.print(caracter);
      }
      System.out.println();
    }
  }
}
