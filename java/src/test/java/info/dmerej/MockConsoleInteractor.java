package info.dmerej;

import java.util.ArrayList;
import java.util.List;

public class MockConsoleInteractor extends ConsoleInteractor {
    private final List<String> inputs;
    private int currentInputIndex;
    private final List<String> messages;

    public MockConsoleInteractor() {
        this.inputs = new ArrayList<>();
        this.currentInputIndex = 0;
        this.messages = new ArrayList<>();
    }

    public void setInputs(List<String> inputs) {
        this.inputs.clear();
        this.inputs.addAll(inputs);
        this.currentInputIndex = 0;
    }

    @Override
    public String readInput() {
        if (currentInputIndex < inputs.size()) {
            return inputs.get(currentInputIndex++);
        }
        return "";
    }

    @Override
    public void printMessage(String message) {
        System.out.println(message);
        this.messages.add(message);
    }

    public List<String> getMessages() {
        return this.messages;
    }
}
