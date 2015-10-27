/**
 * Ejercicio 11
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
 * los segundos que faltan para llegar a la medianoche.
 *
 * @author Rubén López Mompeán
 */

public class C04Ejercicio11 {
  
 public static void main (String[] args){
    System.out.print("Queremos saber cuanto tiempo falta para la medianoche. ");
    System.out.print(" Para ello se va a introducir primero la hora y ");
    System.out.println(" los minutos.");
    
    System.out.print("Primero introduce las horas: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora introduce los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int segundos = 0;
    
    if ((horas >= 0) && (horas <= 24)); {
      if ((minutos >=0) && (minutos <= 60)); {
          horas = 24 - horas;
          minutos= 60 - segundos;
          segundos = (86400 - ((3600*horas) + ( 60 * minutos)));
        }
      }
      System.out.println("Falta " + segundos + " segundos para la medianoche.");
  }
}
