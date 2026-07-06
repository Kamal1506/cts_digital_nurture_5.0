class EcommerceSearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(205, "Shirt", "Clothing"),
            new Product(302, "Book", "Education"),
            new Product(408, "Phone", "Electronics"),
            new Product(555, "Shoes", "Footwear")
        };
        
        Product[] sortedProducts = products.clone();
        java.util.Arrays.sort(sortedProducts, (p1, p2) -> p1.productId - p2.productId);
        
        System.out.println("Searching for product ID: 302\n");
        
        Product result1 = SearchAlgorithms.linearSearch(products, 302);
        System.out.println("Linear Search Result: " + result1);
        
        Product result2 = SearchAlgorithms.binarySearch(sortedProducts, 302);
        System.out.println("Binary Search Result: " + result2);
    }
}