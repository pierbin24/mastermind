package mastermind;

import java.util.Random;

public class Game {

  public static void main(String... args){

    Game game = new Game();

    int[] secretSequence = game.generateSequence();
    System.out.println("La sequenza da indovinare è:");
    for(int num : secretSequence){
      System.out.print(num + " ");
    }


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
