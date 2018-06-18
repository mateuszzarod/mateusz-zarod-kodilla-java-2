package challenges.shop;

import java.time.LocalDateTime;

public interface OrderRepository {

    boolean createNewOrder(OrderRequest orderRequest);
}
