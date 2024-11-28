package info.dmerej;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GreeterTest {
  @Test
  void nightlyGreeting() {
    // Assert that greeter says "Good night" when current hour is 0 (midnight)
    //Arrange
    MockSystemClock systemClock = new MockSystemClock(0);
    Greeter greeter = new Greeter(systemClock);

    //Act
    String res = greeter.greet();

    //Assert
    Assertions.assertEquals(res, "Good night");
  }

  @Test
  void neverAsserts() {
    // Assert that the assertion in greet() is never thrown, by checking all hours from 0 to 23
    for(int i = 0; i < 24; i++) {
      //Arrange
      MockSystemClock systemClock = new MockSystemClock(i);
      Greeter greeter = new Greeter(systemClock);

      assertDoesNotThrow(() -> greeter.greet());
    }
  }

}
