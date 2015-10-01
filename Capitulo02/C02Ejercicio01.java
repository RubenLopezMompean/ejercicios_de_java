/**
 * Ejercicio 1
   Escribe un programa en el que se declaren las variables enteras x e y .
   Asignales los valores 144 y 999 respectivamente. A continuación, muestra por 
   pantallas el valor de cada variable,la suma, la resta, la división y la 
   multiplicación.
 *
 * @author Rubén López Mompeán
 */

public class C02Ejercicio01 {
  public static void main(String[] args) {

    int x = 144;
    int y = 999;
    double division;
    
    System.out.println("El resultado de la suma es " + "" + (x + y));
    System.out.println("El resultado de la resta es " + "" + (x - y));
    System.out.println("El resultado de la multiplicación es " + "" + (x * y));
    division = (double)y / (double)x;
    //division = y / x; // Comenta esta línea y
                // observa la diferencia.
  
    System.out.println("El resultado de la división es " + division);   
  }
}
