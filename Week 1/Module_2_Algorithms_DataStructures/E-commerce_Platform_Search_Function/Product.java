class Product {
    int productId;
    String productName;
    String category;
    
    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
    
    @Override
    public String toString() {
        return "ID: " + productId + ", Name: " + productName + ", Category: " + category;
    }
}
class SearchAlgorithms {
    // Linear Search - O(n)
    public static Product linearSearch(Product[] products, int searchId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == searchId) {
                return products[i];
            }
        }
        return null;
    }
    // Binary Search - O(log n)
    public static Product binarySearch(Product[] products, int searchId) {
        int left = 0;
        int right = products.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (products[mid].productId == searchId) {
                return products[mid];
            }
            
            if (products[mid].productId < searchId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}