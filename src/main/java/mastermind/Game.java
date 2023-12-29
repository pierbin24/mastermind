package mastermind;

import java.util.Random;

public class Game {

  public static void main(String... args){

    // Creazione di una sequenza di 4 numeri casuali da 0 a 9
    Random random = new Random();
    int[] sequence = new int[4];
    for (int i = 0; i < sequence.length; i++) {
      sequence[i] = random.nextInt(10); // Genera un numero casuale tra 0 e 9 inclusi
    }

    // Stampa della sequenza
    System.out.print("Sequenza generata: ");
    for (int num : sequence) {
      System.out.print(num + " ");
    }



  }

}
