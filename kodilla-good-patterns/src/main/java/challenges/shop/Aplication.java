package challenges.shop;

public class Aplication {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MessageInformationServiceImp(),
                new GameOrderServiceImp(),
                new GameOrderRepositoryImp());

        productOrderService.process(orderRequest);
    }
}
