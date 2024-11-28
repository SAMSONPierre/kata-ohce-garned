package info.dmerej;

import java.util.ArrayList;
import java.util.List;

public class MockConsoleInteractor extends ConsoleInteractor{
    private List<String> messages;

    public MockConsoleInteractor() {
        this.messages = new ArrayList<>();
    }

    public String readInput(String input) {
        return input;
    }

    public void printMessage(String message) {
        System.out.println(message);
        this.messages.add(message);
    }

    public List<String> getMessages() {
        return this.messages;
    }

}
