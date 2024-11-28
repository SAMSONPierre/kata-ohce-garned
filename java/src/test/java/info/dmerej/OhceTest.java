package info.dmerej;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class OhceTest {
  @Test
  void testMainLoop() {
    /*
     TODO: check that given the following inputs:
      - hello
      - oto
     - quit

    The following messages are shown to the user:
     - olleh
     - oto
     - That was a palindrome!

    */
    //Arrange
    MockConsoleInteractor consoleInteractor = new MockConsoleInteractor();
    Ohce ohce = new Ohce(consoleInteractor);

    //Act
    consoleInteractor.readInput("hello");
    consoleInteractor.readInput("oto");
    consoleInteractor.readInput("quit");
    ohce.mainLoop();

    //Assert
    List<String> res = consoleInteractor.getMessages();
    assertEquals(res.get(0), "olleh");
    assertEquals(res.get(1), "oto");
    assertEquals(res.get(2), "That was a palindrome!");
  }
}
