package ex35;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void getWinnerShouldNotReturnEmpty() {
        ArrayList<String> contestants = new ArrayList<>();
        contestants.add("John");
        contestants.add("Mary");
        contestants.add("Jackie");
        contestants.add("Amanda");
        contestants.add("");

        String winner = ex35.Main.getWinner(contestants);
        assertNotEquals("", winner);
    }
}