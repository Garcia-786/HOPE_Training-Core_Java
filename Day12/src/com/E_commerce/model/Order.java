package Day12.src.com.E_commerce.model;

public class Order {
    public Product product;
    public User user;
    public int quan;
    public Order(Product product, User user, int quan){
        this.product=product;
        this.user=user;
        this.quan=quan;
    }
}
