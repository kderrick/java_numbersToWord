import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void numberToWord_returnsAWordForASingleDigitNumber_one() {
    App appTest = new App();
    String word = "one";
    assertEquals(word, appTest.numberToWord("1"));
  }
  @Test
  public void numberToWord_returnsAWordForADoubleDigitNumber_fourtyfour() {
    App appTest = new App();
    String word = "fourtyfive";
    assertEquals(word, appTest.numberToWord("45"));
  }
  @Test
  public void numberToWord_returnsAWordForADoubleDigitNumberStartingWithOne_fifteen() {
    App appTest = new App();
    String word = "fifteen";
    assertEquals(word, appTest.numberToWord("15"));
  }

}
