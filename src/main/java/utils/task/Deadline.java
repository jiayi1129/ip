package utils.task;

/**
 * The Deadline class encapsulates a task that need to be done before a specific date/time.
 */
public class Deadline extends Task {

    private String by;

    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    @Override
    public String getTaskFileString(String delimiter, String done, String notDone) {
        return "D" + delimiter + (this.isDone ? done : notDone) + delimiter + this.description + delimiter + this.by;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by + ")";
    }
}