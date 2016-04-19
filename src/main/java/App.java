import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main (String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model,layout);
    }, new VelocityTemplateEngine());

    get("/result", (request, response) -> {
      HashMap model = new HashMap();
      String userInput = request.queryParams("word");
      Scrabble appScrabble = new Scrabble();
      Integer score = appScrabble.scoreScrabble(userInput);
      model.put("template", "templates/result.vtl");
      model.put("score", score);
      return new ModelAndView(model,layout);
    }, new VelocityTemplateEngine());
  }
}
