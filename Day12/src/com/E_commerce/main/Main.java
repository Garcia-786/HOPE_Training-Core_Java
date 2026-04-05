package Day12.src.com.E_commerce.main;
import Day12.src.com.E_commerce.Service.Order_Service;
import Day12.src.com.E_commerce.model.*;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product("Laptop", 999.99);
        User user1 = new User("Alice", "123 Main St");
        Order order1 = new Order(prod1, user1, 1);
        Order_Service orderService = new Order_Service();
        orderService.placeOrder(order1);
        
    }     
}
