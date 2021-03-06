package soonwee.duke;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class DeadlineTest {


    @Test
    public void createDeadline_validInput_success() {
        Deadline deadLineTask = new Deadline("Buy coffee", LocalDateTime.parse("2010-01-19T15:00:00"));
        assertEquals("[D][ ] Buy coffee(by: Jan 19 2010 15:00)", deadLineTask.toString());
    }

    @Test
    public void createDeadLine_invalidDate_exceptionThrown() {
        assertThrows(java.time.format.DateTimeParseException.class, () ->
                new Deadline("wxyz", LocalDateTime.parse("1234")));
    }
}
