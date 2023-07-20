import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class InventoryManagementSystem { private List<Item> items;
    private List<Vendor> vendors;
    private List<Bill> bills;

    public InventoryManagementSystem() {
        items = new ArrayList<>();
        vendors = new ArrayList<>();
        bills = new ArrayList<>();
    }

    public void addGoods(Item item) {
        items.add(item);
    }

    public void viewVendors() {
        for (Vendor vendor : vendors) {
            System.out.println("Vendor Name: " + vendor.getVendorName());
            System.out.println("Contact Info: " + vendor.getContactInfo());
            System.out.println("-----------------------------");
        }
    }

    public void viewGoods() {
        for (Item item : items) {
            System.out.println("Item Name: " + item.getItemName());
            System.out.println("Category: " + item.getCategory().getCategoryName());
            System.out.println("Vendor: " + item.getVendor());
            System.out.println("Price: " + item.getPrice());
            System.out.println("Quantity: " + item.getQuantity());
            System.out.println("-----------------------------");
        }
    }

    public void viewBills() {
        for (Bill bill : bills) {
            System.out.println("Bill Number: " + bill.getBillNumber());
            System.out.println("Date: " + bill.getDate());
            System.out.println("Total Amount: " + bill.getTotalAmount());
            System.out.println("Items Purchased:");
            for (Item item : bill.getItems()) {
                System.out.println("- " + item.getItemName());
            }
            System.out.println("-----------------------------");
        }
    }

    public void issueGoods(Bill bill) {
        bills.add(bill);
        for (Item item : bill.getItems()) {
            int currentQuantity = item.getQuantity();
            item.setQuantity(currentQuantity - 1);
        }
    }

    public void viewIssuedGoods() {
        for (Bill bill : bills) {
            System.out.println("Bill Number: " + bill.getBillNumber());
            System.out.println("Date: " + bill.getDate());
            System.out.println("Total Amount: " + bill.getTotalAmount());
            System.out.println("Items Issued:");
            for (Item item : bill.getItems()) {
                System.out.println("- " + item.getItemName());
            }
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        // Example usage of the InventoryManagementSystem
        InventoryManagementSystem system = new InventoryManagementSystem();

        // Create item categories
        ItemCategory beverages = new ItemCategory("Beverages");
        ItemCategory breadBakery = new ItemCategory("Bread/Bakery");
        // Add more categories...

        // Create items
        Item item1 = new Item("Coffee", beverages, "Vendor A", 5.99, 10);
        Item item2 = new Item("Sandwich Loaves", breadBakery, "Vendor B", 2.99, 20);
        // Add more items...

        // Add items to the system
        system.addGoods(item1);
        system.addGoods(item2);
        // Add more items...

        // View all goods
        system.viewGoods();

        // View all vendors
        system.viewVendors();

        // Create a bill
        List<Item> purchasedItems = new ArrayList<>();
        purchasedItems.add(item1);
        purchasedItems.add(item2);
        Bill bill = new Bill(1, new Date(), 8.98, purchasedItems);

        // Issue goods and update quantities
        system.issueGoods(bill);

        // View issued goods
        system.viewIssuedGoods();
    }

}
