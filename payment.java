
public class payment
{
    private int paymentId;
    private String name;
    private double paymentAmount;

    public payment()
    {
        this.paymentId = paymentId;
        this.name = name;
        this.paymentAmount = paymentAmount;
    }

    public payment(int paymentId, String name, double paymentAmount)
    {
        this.paymentId = paymentId;
        this.name = name;
        this.paymentAmount = paymentAmount;
    }
    
    public void setData(int paymentId, String name, double paymentAmount)
    {
        this.paymentId = paymentId;
        this.name = name;
        this.paymentAmount = paymentAmount;
    }

    public int getPaymentId()
    {
        return paymentId;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getPaymentAmount()
    {
        return paymentAmount;
    }
    
    public double calcPayment()
    {
        double hours = 0.0;
        double fee = 0.0;
        
        fee = 3 * hours;
        return fee;
    }
    
    public String toString()
    {
        return ("PAYMENT ID: " + paymentId + "NAME: " + name + "PAYMENT AMOUNT: " + paymentAmount);
    }
}
