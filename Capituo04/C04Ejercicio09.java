/**
 * Ejercicio 9
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo 
 * ax * 2 + bx + c = * 0).
 *
 * @author Rubén López Mompeán
 */

public class C04Ejercicio09 {
  
 public static void main (String[] args){
    System.out.print("Resolver una ecuación de segundo grado ");
    System.out.println("(ax2 + bx + c = 0).");
    
    System.out.print("Introduzca el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el valor de c: ");
    double c = Double.parseDouble(System.console().readLine());
    
    double resultadoPos = 0.0;
    double resultadoNeg = 0.0;
    
    if (a != 0){
      if (b != 0){
        if (c != 0){
          if (Math.pow(b,2)-(4*a*c) >= 0){
            resultadoPos = (-b+(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
            resultadoNeg = (-b-(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
          }else{
            System.out.print("Raíz cuadrada negativa.");
          }
        }else{
          if ((-b/a) >= 0){
            resultadoPos = Math.sqrt(-b/a);
            resultadoNeg = -resultadoPos;
          }else{
            System.out.print("Raíz cuadrada negativa.");
          }
        }
      }else{
        if ((-c/a) >= 0){
          resultadoPos = Math.sqrt(-c/a);
          resultadoNeg = -resultadoPos;
        }else{
          System.out.print("Raíz cuadrada negativa.");
        }
      }
    }else{
      System.out.print("Esta ecuación no tiene solución real.");
    }
    
    System.out.printf("Resultado 1: %.2f\n", resultadoPos);
    System.out.printf("Resultado 2: %.2f", resultadoNeg);
  }
}
