import java.time.LocalDate;

/**
 * Vincent Verboven
 * 7/12/2022
 */
public class TodoItem {
    private String description;
    private Priority priority;
    private LocalDate deadline;

    public TodoItem(String description, Priority priority, LocalDate deadline) {
        this.description = description;
        this.priority = priority;
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-40s %s",priority,description,deadline);
    }
}
