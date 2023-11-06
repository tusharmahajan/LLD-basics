package basics.dependencyInversionPrinciple;

public class CreditCardPaymentMethod implements PaymentProcessor{

    @Override
    public void intitatePayment() {
        System.out.println("Payment through Credit card");
    }
}
