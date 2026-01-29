class Product {
    int pcode;
    String name;
    double price;

    // Constructor
    Product(int pcode, String name, double price) {
        this.pcode = pcode;
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    void display() {
        System.out.println("Product Code: " + pcode);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating 3 Product objects
        Product p1 = new Product(101, "Laptop", 55000);
        Product p2 = new Product(102, "Mobile", 25000);
        Product p3 = new Product(103, "Tablet", 30000);

        // Assume first product has lowest price
        Product lowest = p1;

        if (p2.price < lowest.price) {
            lowest = p2;
        }
        if (p3.price < lowest.price) {
            lowest = p3;
        }

        // Display product with lowest price
        System.out.println("Product with Lowest Price:");
        lowest.display();
    }
}




 