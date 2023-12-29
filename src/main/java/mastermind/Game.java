package mastermind;

import java.util.Random;

public class Game {

  public static void main(String... args){

  }

  public int[] generateSequence(){
    Random random = new Random();
    int[] sequence = new int[4];
    for (int i = 0; i < sequence.length; i++) {
      sequence[i] = random.nextInt(10); // Genera un numero casuale tra 0 e 9 inclusi
    }
    return sequence;
  }

}
