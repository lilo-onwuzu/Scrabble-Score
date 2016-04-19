import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  @Test
  public void scoreScrabble_returnScoreForOnePointLetter_1(){
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.scoreScrabble("a"));
  }

  @Test
  public void scoreScrabble_returnScoreForTwoPointLetter_1(){
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.scoreScrabble("d"));
  }
}
