package ClassPractice.Week10.week10_2;

public class SimpleTask implements Task {

    private String title;
    private String description;
    private TaskPriority priority;

    public SimpleTask(String title, String description, TaskPriority priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public TaskPriority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "SimpleTask{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }
}
