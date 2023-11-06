package basics.dependencyInversionPrinciple;

public class PurchaseFlowManager {

    private final PaymentProcessor paymentProcessor;
    private final NotificationSender notificationSender;

    public PurchaseFlowManager(PaymentProcessor paymentProcessor, NotificationSender notificationSender) {
        this.paymentProcessor = paymentProcessor;
        this.notificationSender = notificationSender;
    }

    public void printDetails(){
        paymentProcessor.intitatePayment();
        notificationSender.message();
    }
}
