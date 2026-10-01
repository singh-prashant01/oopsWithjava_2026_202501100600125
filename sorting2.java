import java.util.*;

class Product implements Comparable<Product> {
    String productName;
    int productId;
    int productPrice;

    Product(String n, int i, int p) {
        productName = n;
        productId = i;
        productPrice = p;
    }

    @Override
    public int compareTo(Product o) {
        // Price: highest to lowest
        return o.productPrice - this.productPrice;
    }

    @Override
    public String toString() {
        return productId + " " + productName + " " + productPrice;
    }
}

class CustomComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.productPrice - o2.productPrice;
    }
}

class NameComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.productName.compareTo(o2.productName);
    }
}

public class sorting2 {
    public static void main(String[] args) {

        ArrayList<Product> list = new ArrayList<>();

        list.add(new Product("Laptop", 1, 60000));
        list.add(new Product("Mobile", 2, 60000));
        list.add(new Product("Tablet", 3, 30000));
        list.add(new Product("Mouse", 4, 1000));

        // Comparable
        list.sort(null);
        System.out.println(list);
    }
}