package ClassPractice.Week10.week10_2;


import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void listTasks() {
        for (Task task: tasks) {
            System.out.println(task);
        }
    }
}
