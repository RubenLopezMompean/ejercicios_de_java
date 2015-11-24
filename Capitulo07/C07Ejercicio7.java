/**
 * Ejercicio 7
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los 
 * muestre por pantalla separados por espacios. El programa pedirá entonces por 
 * teclado dos valores y a continuación cambiará todas las ocurrencias del primer 
 * valor por el segundo en la lista generada anteriormente. Los números que se 
 * han cambiado deben aparecer entrecomillados.
 * 
 * @author Rubén López Mompeán
 */

public class C07Ejercicio7 {
  public static void main(String[] args) {
        
    int numero;
    int valor1;
    int valor2;
    int num[] = new int[100];
    
    for (int i = 0; i < 100; i++) {
      num[i] = (int)(Math.random()*21);
    
      System.out.print(num[i] + "  ");
    }
    System.out.println();
    System.out.print("Introduce el valor que desea cambiar: ");
    valor1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el valor que sustituya el valor que desea cambiar: ");
    valor2 = Integer.parseInt(System.console().readLine());
    
    System.out.println();
    //Sustituye el valor1 por el valor2 de la array
    for(int i = 0; i < 100; i++) {
      if (num[i] == valor1) {
        num[i] = valor2;
        System.out.print("\""+ num[i] +"\" ");
      } else {
      System.out.print(" " + num[i] + " ");
      }
    }
    System.out.println();
  }
}

