package ClassPractice.Week10.week10_2;

import java.util.Scanner;

public class ToDoListApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList todoList = new ToDoList();

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.println("Select task priority:");
                    System.out.println("1. HIGH");
                    System.out.println("2. MEDIUM");
                    System.out.println("3. LOW");
                    int priorityChoice = scanner.nextInt();
                    TaskPriority priority;
                    switch (priorityChoice) {
                        case 1:
                            priority = TaskPriority.HIGH;
                            break;
                        case 2:
                            priority = TaskPriority.MEDIUM;
                            break;
                        case 3:
                            priority = TaskPriority.LOW;
                            break;
                        default:
                            System.out.println("Invalid choice. Setting priority to LOW.");
                            priority = TaskPriority.LOW;
                            break;
                    }
                    Task task = new SimpleTask(title, description, priority);
                    todoList.addTask(task);
                    System.out.println("Task added successfully.");
                    break;
                case 2:
                    System.out.println("Tasks in the To-Do List:");
                    todoList.listTasks();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

}
