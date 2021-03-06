package soonwee.duke;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Represents an Event instance. An Event instance will store the task
 * name and its starting time.
 */
public class Event extends TimedTask {

    /**
     * Instantiates the Event task.
     *
     * @param description description of the task
     * @param startTime   start time of the task
     */
    public Event(String description, LocalDateTime startTime) {
        super(description, startTime);
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + "(at: "
                + this.dateTime.format(DateTimeFormatter.ofPattern("MMM dd yyyy HH:mm")) + ")";
    }
}
