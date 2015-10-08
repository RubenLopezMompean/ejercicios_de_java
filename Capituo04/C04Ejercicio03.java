/**
 * Ejercicio 3
 * Escribe un programa en que dado un número del 1 a 7 escriba el
 * correspodiente nombre del día de la semana.
 *
 * @author Rubén López Mompeán
 */

public class C04Ejercicio03 {
	public static void main(String[] args) { 	
    
    System.out.print("Por favor, di un número del 1 al 7 y te digo el día ");
    System.out.println(" correspodiente: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String nombreDelDia;
    
    switch (dia) {
      case 1:
        nombreDelDia = "lunes";
        break;
      case 2:
        nombreDelDia = "martes";
        break;
      case 3:
        nombreDelDia = "miércoles";
        break;
      case 4:
        nombreDelDia = "jueves";
        break;
      case 5:
        nombreDelDia = "viernes";
        break;
      case 6:
        nombreDelDia = "sábado";
        break;
      case 7:
        nombreDelDia = "domingo";
        break;
      default:
        nombreDelDia = "no existe ese día";
    
     }
     
     System.out.println("Dia " + dia + ": " + nombreDelDia);
	}
}
