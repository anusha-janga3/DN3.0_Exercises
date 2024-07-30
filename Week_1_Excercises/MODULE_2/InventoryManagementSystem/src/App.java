// App.java
public class App {
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        Product p1 = new Product("1", "Product1", 10, 100.0);
        Product p2 = new Product("2", "Product2", 20, 200.0);

        ims.addProduct(p1);
        ims.addProduct(p2);

        System.out.println("Inventory after adding products:");
        ims.displayInventory();

        Product p1Updated = new Product("1", "UpdatedProduct1", 15, 150.0);
        ims.updateProduct("1", p1Updated);

        System.out.println("Inventory after updating product 1:");
        ims.displayInventory();

        ims.deleteProduct("2");

        System.out.println("Inventory after deleting product 2:");
        ims.displayInventory();
    }
}
