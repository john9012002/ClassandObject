public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private String donViTinh;
    private double gia;
    private int namSanXuat;
    
    public SanPham(String maSanPham, String tenSanPham, String donViTinh, double gia, int namSanXuat) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.donViTinh = donViTinh;
        this.gia = gia;
        this.namSanXuat = namSanXuat;
    }
    
    public void xuatSanPham() {
        System.out.println(maSanPham + "; " + tenSanPham + "; " + donViTinh + "; " + gia + "; " + namSanXuat);
    }
    
    public static void main(String[] args) {
        // Create 3 different products and display them
        SanPham product1 = new SanPham("SP001", "Product 1", "Piece", 10.5, 2022);
        SanPham product2 = new SanPham("SP002", "Product 2", "Box", 25.0, 2023);
        SanPham product3 = new SanPham("SP003", "Product 3", "Kilogram", 5.8, 2021);
        
        System.out.println("Products:");
        product1.xuatSanPham();
        product2.xuatSanPham();
        product3.xuatSanPham();
        
        // Calculate total amount for a invoice with quantities: 3, 10, and 7
        int quantity1 = 3;
        int quantity2 = 10;
        int quantity3 = 7;
        double totalAmount = (product1.gia * quantity1) + (product2.gia * quantity2) + (product3.gia * quantity3);
        System.out.println("Total amount: " + totalAmount);
        
        // Create an array of n products (n is a constant value defined in the program) and find the product with the highest price
        int n = 5; // Example: Create an array of 5 products
        SanPham[] products = new SanPham[n];
        products[0] = new SanPham("SP004", "Product 4", "Piece", 15.0, 2023);
        products[1] = new SanPham("SP005", "Product 5", "Kilogram", 8.5, 2021);
        products[2] = new SanPham("SP006", "Product 6", "Box", 12.5, 2022);
        products[3] = new SanPham("SP007", "Product 7", "Piece", 5.0, 2020);
        products[4] = new SanPham("SP008", "Product 8", "Kilogram", 20.0, 2023);
        
        double maxPrice = Double.MIN_VALUE;
        SanPham productWithMaxPrice = null;
        
        for (int i = 0; i < n; i++) {
            if (products[i].gia > maxPrice) {
                maxPrice = products[i].gia;
                productWithMaxPrice = products[i];
            }
        }
        
        System.out.println("Product with the highest price: ");
        productWithMaxPrice.xuatSanPham();
    }
}

