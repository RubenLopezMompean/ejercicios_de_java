/**
 * Ejercicio 6
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde 
 * una altura h. Aplica la fórmula t = √2h/g  siendo g = 9.81m/s 2
 * 
 * @author Rubén López Mompeán
 */

public class C04Ejercicio06 {
	public static void main (String[] args){
    System.out.print("Vamos a calcular el tiempo que tardará en caer un ");
    System.out.println(" objeto desde una altura h.");
    
    System.out.print("Introduzca la altura (h) en metros: ");
    int h = Integer.parseInt(System.console().readLine());
    
    if (h > 0){
      System.out.print("El tiempo que tarda en caer un objeto ");
      System.out.print("desde " + h + "m. es: ");
      System.out.printf("%.2f segundos", Math.sqrt((2.0*h)/9.81));
    }else{
      System.out.print("Altura incorrecta.");
    }
  }
}

