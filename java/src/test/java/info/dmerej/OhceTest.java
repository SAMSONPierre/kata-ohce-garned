package info.dmerej;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OhceTest {
  @Test
  void testMainLoop() {
    // Arrange
    MockConsoleInteractor consoleInteractor = new MockConsoleInteractor();
    consoleInteractor.setInputs(List.of("hello", "oto", "quit"));
    Ohce ohce = new Ohce(consoleInteractor);

    // Act
    ohce.mainLoop();

    // Assert
    List<String> res = consoleInteractor.getMessages();
    assertEquals("olleh", res.get(0));
    assertEquals("oto", res.get(1));
    assertEquals("That was a palindrome!", res.get(2));
  }
}
