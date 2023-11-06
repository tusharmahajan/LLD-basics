package basics.dependencyInversionPrinciple;

public class PurchaseFlowSimulator {

    public static void main(String[] args) {
        PurchaseFlowManager flowManager = new PurchaseFlowManager(new CreditCardPaymentMethod(), new EmailNotification());
        flowManager.printDetails();
    }
}
