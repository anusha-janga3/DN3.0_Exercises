public class App {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Adding tasks
        taskList.addTask(new Task("1", "Task1", "Pending"));
        taskList.addTask(new Task("2", "Task2", "In Progress"));
        taskList.addTask(new Task("3", "Task3", "Completed"));

        // Traverse tasks
        System.out.println("Task List:");
        taskList.traverseTasks();

        // Search for a task
        System.out.println("\nSearching for task with ID 2:");
        System.out.println(taskList.searchTaskById("2"));

        // Delete a task
        taskList.deleteTaskById("2");
        System.out.println("\nTask List after deletion:");
        taskList.traverseTasks();
    }
}
