package info.dmerej;

import java.time.LocalTime;

public class MockSystemClock extends SystemClock{
    private final int currentTime;

    public MockSystemClock(int hour) {
        this.currentTime = hour;
    }

    public int getCurrentHour() {
        return this.currentTime;
    }
}
