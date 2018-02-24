package challenges.shop;

//erwis powinien zajmować się wykonywaniem zamówień różnego rodzaju produktów -
// gier, kapcie, szczoteczek do zębów… innymi słowy, Allegro :)

import java.time.LocalDateTime;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest);

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createNewOrder(orderRequest);
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}

