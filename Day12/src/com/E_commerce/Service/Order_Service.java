/*

service layer(int simple words):
-contains business logic
-communicates with data access layer and presentation layer
-contain methods for operations like place order, cancel order, view order history etc

*/


package Day12.src.com.E_commerce.Service;

import Day12.src.com.E_commerce.model.Order;

public class Order_Service {
    public void placeOrder(Order order){
        System.out.println("User:"+order.user.name);
        System.out.println("Product:"+order.product.name);
        System.out.println("Total Price:"+order.product.price*order.quan);
    }
}
