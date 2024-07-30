import java.util.Arrays;
public class App {
    public static void main(String[] args) {
        // Create some sample products
        Product[] products = {
            new Product("1", "Product1", "Category1"),
            new Product("2", "Product2", "Category2"),
            new Product("3", "Product3", "Category3")
        };

        // Linear search
        Product resultLinear = SearchAlgorithms.linearSearch(products, "2");
        System.out.println("Linear Search Result: " + resultLinear);

        // Sort products by productId for binary search
        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));

        // Binary search
        Product resultBinary = SearchAlgorithms.binarySearch(products, "2");
        System.out.println("Binary Search Result: " + resultBinary);
    }
}
