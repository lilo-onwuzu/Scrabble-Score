import java.util.ArrayList;

public class Scrabble {
  public static void main (String[] args) {}

  public Integer scoreScrabble (String word) {
  // char[] scrabbleArray = word.toCharArray();
  String[] scrabbleArray = word.split("");
  System.out.println(scrabbleArray[0]);
  Integer score = 0;
  for (Integer index=0; index < scrabbleArray.length; index++){
      if (scrabbleArray[index] == "j" || scrabbleArray[index] == "x"){
        score += 8;
      } else if (scrabbleArray[index] == "k") {
        score += 5;
      } else if (scrabbleArray[index] == "f" || scrabbleArray[index] == "h" || scrabbleArray[index] == "v" || scrabbleArray[index] == "w" || scrabbleArray[index] == "y") {
        score += 4;
      } else if (scrabbleArray[index] == "b" || scrabbleArray[index] == "c" ||
      scrabbleArray[index] == "m" || scrabbleArray[index] == "p") {
        score += 3;
      } else if (scrabbleArray[index] == "d" || scrabbleArray[index] == "g"){
        score += 2;
      } else if (scrabbleArray[index] == "a" || scrabbleArray[index] == "e" ||
      scrabbleArray[index] == "i" || scrabbleArray[index] == "o" ||
      scrabbleArray[index] == "u" || scrabbleArray[index] == "l" ||
      scrabbleArray[index] == "n" || scrabbleArray[index] == "r"||
      scrabbleArray[index] == "s" || scrabbleArray[index] == "t") {
        score++;
      }
    }
  return score;
  }
}
