  /**
 * Ejercicio 11
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben 
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al 
 * final aparecerá el número de suspensos, el número de suficientes, el número de 
 * bienes, etc.
 * 
 * @author Rubén López Mompeán
 */
public class C06Ejercicio11 {
  public static void main(String[] args) {
    
    System.out.print("Este programa pinta en pantalla diez líneas, cada línea ");
    System.out.println(" con un caracter especial con una longitud entre 1 y 40.");

    String notas = "";
    int suspenso = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
    int calificacion;
    
    for (int i = 0; i < 20; i++) {
    
    calificacion = (int)(Math.random() * 5) + 1;
    
    switch (calificacion) {
      case 1:
        System.out.print("suspenso");
        suspenso++;
        break;
      case 2:
        System.out.print("suficiente");
        suficiente++;
        break;
      case 3:
        System.out.print("bien");
        bien++;
        break;
      case 4:
        System.out.print("notable");
        notable++;
        break;
      case 5:
        System.out.print("sobresaliente");
        sobresaliente++;
        break;
      default:
      } // switch
      System.out.println(notas);      
    } // for
    System.out.println("\nSuspenso/s: " + suspenso);
    System.out.println("Insuficiente/s: " + suficiente);    
    System.out.println("Bien: " + bien);
    System.out.println("Notable/s: " + notable);
    System.out.println("Sobresaliente/s " + sobresaliente);
  }
}
