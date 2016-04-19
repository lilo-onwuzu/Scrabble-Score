import java.util.ArrayList;

public class Scrabble {

  public Integer scoreScrabble (String word) {

    String[] scrabbleArray = word.split("");
    Integer score = 0;
    for (Integer index=0; index < scrabbleArray.length; index++){
      System.out.println(scrabbleArray[index]);
      if (scrabbleArray[index].equals("q") || scrabbleArray[index].equals("z") ){
        score += 10;
      } else if (scrabbleArray[index].equals("j") || scrabbleArray[index].equals("x")){
        score += 8;
      } else if (scrabbleArray[index].equals("k")) {
        score += 5;
      } else if (scrabbleArray[index].equals("f") || scrabbleArray[index].equals("h") || scrabbleArray[index].equals("v") || scrabbleArray[index].equals("w") || scrabbleArray[index].equals("y")) {
        score += 4;
      } else if (scrabbleArray[index].equals("b") || scrabbleArray[index].equals("c") ||
      scrabbleArray[index].equals("m") || scrabbleArray[index].equals("p")) {
        score += 3;
      } else if (scrabbleArray[index].equals("d") || scrabbleArray[index].equals("g")){
        score += 2;
      } else if (scrabbleArray[index].equals("a") || scrabbleArray[index].equals("e") ||
      scrabbleArray[index].equals("i") || scrabbleArray[index].equals("o") ||
      scrabbleArray[index].equals("u") || scrabbleArray[index].equals("l") ||
      scrabbleArray[index].equals("n") || scrabbleArray[index].equals("r")||
      scrabbleArray[index].equals("s") || scrabbleArray[index].equals("t")) {
        score++;
      }
    }
    System.out.println(score);
    return score;
  }
}
