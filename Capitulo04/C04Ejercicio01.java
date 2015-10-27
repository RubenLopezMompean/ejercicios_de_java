/**
 *
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
   asignatura toca a primera hora ese día.
 *
 * @author Rubén López Mompeán
 */

public class C04Ejercicio01 {
	public static void main(String[] args) { 	
    
    String dia;
    
    System.out.print("Por favor, introduzca un dia de la semana: ");
    dia = (System.console().readLine());
    
    
    switch (dia) {
      case "lunes":
        System.out.println("Formación y orientación laboral");
        break;
      case "martes":
        System.out.println("Programación");
        break;
      case "miercoles":
       System.out.println("Sistemas informaticos");
        break;
      case "jueves":
        System.out.println("Programación");
        break;
      case "viernes":
        System.out.println("Base de datos");
        break;
      case "sabado":
      System.out.println("No hay clase");
        break;
      case "domingo":
        System.out.println("No hay clase");
        break;
      default:
        System.out.println("incorrecto");
        
     }   
	}
}
