  /**
 * Ejercicio 5
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) 
 * separados por espacios. Muestra también el máximo, el mínimo y la media de 
 * esos números.
 * 
 * @author Rubén López Mompeán
 */
public class C06Ejercicio5 {
  public static void main(String[] args) {
    
    System.out.print("Este programa muestra 50 números aleatorios entre 10 y 199.");
    System.out.println(" Muestra también el máximo, mínimo y su media.\n");

    int numero = 0;
    int numMax = 100;
    int numMin = 199;
    int suma = 0;
    for (int i = 0; i < 50; i++) {
      numero = (int)(Math.random()*(100) + 100);
      System.out.print(numero + " ");
    
      suma = suma + numero;
      
      if (numero > numMax) {
        numMax = numero;
      }
    
      if (numero < numMin) {
        numMin = numero;
      }
    }
    System.out.println("\n\nNúmero mínimo es " + numMin + "");
    System.out.println("Número máximo es " + numMax + ".");
    System.out.println("La media del máximo y mínimo es " + (numMax + numMin) / 2 + ".");
    System.out.println("La media total es " + suma / 50 + ".");
  }
}
