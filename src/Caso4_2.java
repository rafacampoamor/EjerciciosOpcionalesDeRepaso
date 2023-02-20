import java.util.Random;

public class Caso4_2 {
   public static void main(String[] args) {

      /*
       * Adivina un número diciendo si el introducido es mayor o menor que el que
       * tiene que adivinar
       */

      int numero;
      int menor = 0;
      int mayor = 101;
      boolean acierto = false;
      String selector;

      System.out.println("\n**********************\n* ¡PIENSA UN NÚMERO! *\n**********************");
      Utilidades.pausa();

      Random rand = new Random();
      numero = rand.nextInt(menor, mayor); // genera un número entero entre 0 y 100

      do {
         selector = Utilidades.PedirString("\n¿Es tu número el " + numero + " ?\n * Si\n * Mayor\n * Menor\n");
         switch (selector) {
            case "menor":
               mayor = numero;
               numero = rand.nextInt(menor, mayor);
               break;

            case "Menor":
               mayor = numero;
               numero = rand.nextInt(menor, mayor);
               break;

            case "mayor":
               menor = numero;
               numero = rand.nextInt(menor, mayor);
               break;

            case "Mayor":
               menor = numero;
               numero = rand.nextInt(menor, mayor);
               break;

            case "si":
               System.out.println("\n¡Lo adiviné, era " + numero + "!\n");
               acierto = true;
               break;

            case "Si":
               System.out.println("¡Lo adiviné, era " + numero + "!\n");
               acierto = true;
               break;

            default:
               break;
         }

      } while (!acierto);

   }
}
