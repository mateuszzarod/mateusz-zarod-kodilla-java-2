package challenges.shop;

import java.time.LocalDateTime;

public interface OrderRepository {

    public boolean createNewOrder(OrderRequest orderRequest);
}
