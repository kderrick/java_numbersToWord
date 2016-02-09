import static spark.Spark.*;
import java.util.HashMap;

import spark.ModelAndView;
// import spark.template.velocity.VelocityTemplateEngine;

public class App {
  public static void main(String[] args) {}
    public static String numberToWord(String userInput)  {
      char[] userInputArray = userInput.toCharArray();
      String test = "";
      HashMap<Character, String> ones = new HashMap();
      ones.put('1',"one");
      ones.put('2',"two");
      ones.put('3',"three");
      ones.put('4',"four");
      ones.put('5',"five");
      ones.put('6',"six");
      ones.put('7',"seven");
      ones.put('8',"eight");
      ones.put('9',"nine");

      // HashMap<String, String> tens = new HashMap();
      // tens.put("1","ten");
      // tens.put("2","twenty");
      // tens.put("3","thirty");
      // tens.put("4","fourty");
      // tens.put("5","fifty");
      // tens.put("6","sixty");
      // tens.put("7","seventy");
      // tens.put("8","eighty");
      // tens.put("9","ninety");

      if (userInputArray.length == 1) {

        test = ones.get(userInputArray[0]);
      }
        return test;

    }
}
