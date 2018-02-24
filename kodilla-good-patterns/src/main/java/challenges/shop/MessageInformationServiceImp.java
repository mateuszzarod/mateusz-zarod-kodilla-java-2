package challenges.shop;

public class MessageInformationServiceImp implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("SMS: your order is preparing");
    }
}
