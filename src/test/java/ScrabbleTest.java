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
  public void scoreScrabble_returnScoreForTwoPointLetter_2(){
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.scoreScrabble("d"));
  }

  @Test
  public void scoreScrabble_returnScoreForThreePointLetter_3(){
    Scrabble testScrabble = new Scrabble();
    Integer expected = 3;
    assertEquals(expected, testScrabble.scoreScrabble("b"));
  }

  @Test
  public void scoreScrabble_returnScoreForFourPointLetter_4(){
    Scrabble testScrabble = new Scrabble();
    Integer expected = 4;
    assertEquals(expected, testScrabble.scoreScrabble("f"));
  }

  @Test
  public void scoreScrabble_returnScoreForFivePointLetter_5(){
    Scrabble testScrabble = new Scrabble();
    Integer expected = 5;
    assertEquals(expected, testScrabble.scoreScrabble("k"));
  }

  @Test
  public void scoreScrabble_returnScoreForEightPointLetter_8(){
    Scrabble testScrabble = new Scrabble();
    Integer expected = 8;
    assertEquals(expected, testScrabble.scoreScrabble("j"));
  }

  @Test
  public void scoreScrabble_returnScoreForTenPointLetter_10(){
    Scrabble testScrabble = new Scrabble();
    Integer expected = 10;
    assertEquals(expected, testScrabble.scoreScrabble("q"));
  }

  @Test
  public void scoreScrabble_returnScoreForWord_5(){
    Scrabble testScrabble = new Scrabble();
    Integer expected = 5;
    assertEquals(expected, testScrabble.scoreScrabble("cat"));
  }

}
