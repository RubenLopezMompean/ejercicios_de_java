/**
 * Ejercicio 8
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de 
 * un determinado año y que muestre a continuación un diagrama de barras 
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base 
 * de asteriscos o cualquier otro carácter.
 * 
 * @author Rubén López Mompeán
 */

public class C07Ejercicio8 {
  public static void main(String[] args) {
        
    String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", 
      "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    
    double[] temperatura = new double[11];
    
    System.out.println("Introduce la temperatura media de cada mes: ");
    // Genera 20 números aleatorios en la array
    for (int i = 0; i < 12; i++) {
      System.out.print("Temperatura media en el mes de " + mes[i] + " es de: ");
      temperatura[i] = Double.parseDouble(System.console().readLine());
    
    }
    System.out.print
  }
}

