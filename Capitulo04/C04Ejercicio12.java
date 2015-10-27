/**
 * Ejercicio 12
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El 
 * programa mostrará al final la calificación obtenida. Pásale el 
 * minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal 
 * andan de conocimientos en las diferentes asignaturas del curso.
 *
 * @author Rubén López Mompeán
 */

public class C04Ejercicio12 {
  
 public static void main (String[] args){
    System.out.print("Vamos ha realizar un minicuestionario de 10 preguntas");
    System.out.print(" tipo test. Responde a, b o c. Cada pregunta acertada");
    System.out.println(" sumará 1 punto.");
  
    int puntos = 0;
    String respuesta;
    
    System.out.print("Para empezar pulse intro");
    respuesta = System.console().readLine();
    
    System.out.println("1. ¿Qué es la memoria RAM?");
    System.out.println("a. Un software.");
    System.out.println("b. Un hardware.");
    System.out.println("c. Un programa.");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    
    {
    if (respuesta.equals("b")) {
     puntos++;
     System.out.println("CORRECTO");
    }else{
      System.out.println("INCORRECTO");
    }
    
    
    System.out.println("2. ¿Cuál de estos es un SO?");
    System.out.println("a. Ubuntu.");
    System.out.println("b. Google.");
    System.out.println("c. Firefox.");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    
    if (respuesta.equals("a")) {
      puntos++;
      System.out.println("CORRECTO");
    }else{
      System.out.println("INCORRECTO");
    }
    
    System.out.println("3. ¿Qué es MS VISIO?");
    System.out.println("a. Un sistema operativo.");
    System.out.println("b. Un programa de BBDD.");
    System.out.println("c. Una aplicación de imágenes.");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    
    if (respuesta.equals("b")) {
      puntos++;
      System.out.println("CORRECTO");
    }else{
      System.out.println("INCORRECTO");
    }
    System.out.println("4. ¿En qué generación se usaba tubos de vacío?");
    System.out.println("a. Primera generación.");
    System.out.println("b. Segunda generación.");
    System.out.println("c. Tercera generación.");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    
    if (respuesta.equals("a")) {
      puntos++;
      System.out.println("CORRECTO");
    }else{
      System.out.println("INCORRECTO");
    }
    
    System.out.println("5. ¿Qué programa estamos usando en Programación?");
    System.out.println("a. NotePad ++.");
    System.out.println("b. Geany.");
    System.out.println("c. MS Visio.");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    
    if (respuesta.equals("b")) {
      puntos++;
      System.out.println("CORRECTO");
    }else{
      System.out.println("INCORRECTO");
    }
    
    System.out.print("6. ¿Qué comando se utiliza en terminal para instalar");
    System.out.println(" un programa?");
    System.out.println("a. cd ..");
    System.out.println("b. ls");
    System.out.println("c. sudo apt install");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    
    if (respuesta.equals("c")) {
      puntos++;
      System.out.println("CORRECTO");
    }else{
      System.out.println("INCORRECTO");
    }
    
    System.out.println("7. ¿Qué significa FOL?");
    System.out.println("a. Formas de orientacion laboral.");
    System.out.println("b. Formación o laboral.");
    System.out.println("c. Formación y orientación laboral.");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    
    if (respuesta.equals("c")) {
      puntos++;
      System.out.println("CORRECTO");
    }else{
      System.out.println("INCORRECTO");
    }
    
    System.out.println("8. ¿De qué tema es este ejercicio?");
    System.out.println("a. Tema 2");
    System.out.println("b. Tema 4.");
    System.out.println("c. Tema 3.");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    
    if (respuesta.equals("b")) {
      puntos++;
      System.out.println("CORRECTO");
    }else{
      System.out.println("INCORRECTO");
    }
    
    System.out.println("9. ¿Qué significa GB?");
    System.out.println("a. GigaByte.");
    System.out.println("b. GigaBite.");
    System.out.println("c. GranBite.");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    
    if (respuesta.equals("a")) {
      puntos++;
      System.out.println("CORRECTO");
    }else{
      System.out.println("INCORRECTO");
    }
    
    System.out.println("10. ¿Qué estamos cursando?");
    System.out.println("a. DAW.");
    System.out.println("b. DAM.");
    System.out.println("c. SSRR.");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    
    if (respuesta.equals("a")) {
      puntos++;
      System.out.println("CORRECTO");
    }else{
      System.out.println("INCORRECTO");
    }
    
    System.out.println("\nHas obtenido " + puntos + " puntos.");
  }
    
    if (puntos >= 5) {
      System.out.println("¡Enhorabuena!Has aprobado.");
    }
    if (puntos < 5) {
    System.out.println("Lo siento, has suspendido.");
    }
  }
}
