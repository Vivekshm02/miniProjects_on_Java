import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    static ArrayList<String> tasks = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== TODO LIST ===");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task Complete");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1 -> addTask();
                case 2 -> viewTasks();
                case 3 -> markComplete();
                case 4 -> removeTask();
                case 5 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    static void addTask() {
        System.out.print("Enter task: ");
        String task = scanner.nextLine();
        tasks.add("[ ] " + task);
        System.out.println("Task added!");
    }

    static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet!");
            return;
        }

        System.out.println("\nYour Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    static void markComplete() {
        viewTasks();
        if (!tasks.isEmpty()) {
            System.out.print("Enter task number to mark complete: ");
            int index = scanner.nextInt() - 1;

            if (index >= 0 && index < tasks.size()) {
                String task = tasks.get(index);
                if (!task.startsWith("[✓]")) {
                    tasks.set(index, task.replace("[ ]", "[✓]"));
                    System.out.println("Task marked complete! ✔");
                } else {
                    System.out.println("Task already complete!");
                }
            } else {
                System.out.println("Invalid task number!");
            }
        }
    }

    static void removeTask() {
        viewTasks();
        if (!tasks.isEmpty()) {
            System.out.print("Enter task number to remove: ");
            int index = scanner.nextInt() - 1;

            if (index >= 0 && index < tasks.size()) {
                System.out.println("Removed: " + tasks.remove(index));
            } else {
                System.out.println("Invalid task number!");
            }
        }
    }
}