public class App {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("1", "CustomerA", 250.0),
            new Order("2", "CustomerB", 150.0),
            new Order("3", "CustomerC", 300.0),
            new Order("4", "CustomerD", 200.0)
        };

        // Sort using Bubble Sort
        System.out.println("Before Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
        SortAlgorithms.bubbleSort(orders);
        System.out.println("\nAfter Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Sort using Quick Sort
        System.out.println("\nBefore Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
        SortAlgorithms.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nAfter Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
