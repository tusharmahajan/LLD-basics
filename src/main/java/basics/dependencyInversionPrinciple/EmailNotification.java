package basics.dependencyInversionPrinciple;

public class EmailNotification implements NotificationSender{

    @Override
    public void message() {
        System.out.println("Message send through SMS");
    }
}
