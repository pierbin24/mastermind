package mastermind;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SequenceGenerator {

  @Test
  public void testGenerateSequence() {
    // Creazione di un oggetto Game
    Game game = new Game();

    // Invocazione del metodo di generazione della sequenza
    int[] sequence = game.generateSequence();

    // Verifica che la lunghezza della sequenza sia 4
    assertEquals(4, sequence.length);

    // Verifica che ogni numero nella sequenza sia compreso tra 0 e 9 inclusi
    for (int num : sequence) {
      assertTrue(num >= 0 && num <= 9);
    }
  }

}
