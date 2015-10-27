/**
 * Ejercicio 10
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de 
 * nacimiento.
 *
 * @author Rubén López Mompeán
 */

public class C04Ejercicio10 {
  
 public static void main (String[] args){
    System.out.println("Vamos a conocer que horóscopo eres. ");
    
    String mes;
    System.out.print("Primero introduce el mes que naciste: ");
    mes = (System.console().readLine()).toLowerCase();
    
    System.out.print("Ahora introduce el día que naciste: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String horoscopo = "";
    
    switch (mes) {
      case "diciembre":
        if ((dia >=  1) &&(dia <=21)) {
        horoscopo = "Sagitario";
        }
        if ((dia >= 21) && (dia <= 31)) {
        horoscopo = "Capricornio";
        }
        break;
      case "enero":
        if ((dia >=  1) &&(dia <=19)) {
        horoscopo = "Capricornio";
        }
        if ((dia >= 20) && (dia <= 31)) {
        horoscopo = "Aquario";
        }
        break;
      case "febrero":
        if ((dia >=  1) &&(dia <=17)) {
        horoscopo = "Aquario";
        }
        if ((dia >= 17) && (dia <= 29)) {
        horoscopo = "Piscis";
        }
        break;
      case "marzo":
        if ((dia >=  1) &&(dia <= 21)) {
        horoscopo = "Piscis";
        }
        if ((dia >= 21) && (dia <= 31)) {
        horoscopo = "Aries";
        }
        break;
      case "abril":
        if ((dia >= 1) &&(dia <= 19)) {
        horoscopo = "Aries";
        }
        if ((dia >= 20) && (dia <= 30)) {
        horoscopo = "Tauro";
        }
        break;
      case "mayo":
        if ((dia >=  1) &&(dia <=20)) {
        horoscopo = "Tauro";
        }
        if ((dia >= 21) && (dia <= 31)) {
        horoscopo = "Géminis";
        }
        break;
      case "junio":
        if ((dia >=  1) &&(dia <=20)) {
        horoscopo = "Géminis";
        }
        if ((dia >= 21) && (dia <= 30)) {
        horoscopo = "Cáncer";
        }
        break;
      case "julio":
        if ((dia >=  1) &&(dia <=22)) {
        horoscopo = "Cáncer";
        }
        if ((dia >= 23) && (dia <= 31)) {
        horoscopo = "Leo";
        }
        break;
      case "agosto":
        if ((dia >=  1) &&(dia <=22)) {
        horoscopo = "Leo";
        }
        if ((dia >= 23) && (dia <= 31)) {
        horoscopo = "Virgo";
        }
        break;
      case "septiembre":
        if ((dia >=  1) &&(dia <=22)) {
        horoscopo = "Virgo";
        }
        if ((dia >= 23) && (dia <= 30)) {
        horoscopo = "Libra";
        }
        break;
      case "octubre":
        if ((dia >=  1) &&(dia <=22)) {
        horoscopo = "Libra";
        }
        if ((dia >= 23) && (dia <= 31)) {
        horoscopo = "Escorpio";
        }
        break;
      case "noviembre":
        if ((dia >=  1) &&(dia <=21)) {
        horoscopo = "Escorpio";
        }
        if ((dia >= 21) && (dia <= 30)) {
        horoscopo = "Sagitario";
        }
        break;
        default:
      }
      
      if (mes != "" && horoscopo != ""){
        System.out.print("Por haber nacido el dia " + dia + " de " + mes);
        System.out.print(" tu horóscopo es " + horoscopo);  
      }else{
      System.out.print("Fecha introducida incorrecta.");
      
      }
  }
}

