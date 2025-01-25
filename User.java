
public class User
{
    private String userName;
    private int userPhoneNumber;
    private String userEmail;
    private String userPaymentMethod;

    public User(String name, int phone, String email, String paymentMethod) {
        this.userName = name;
        this.userPhoneNumber = phone;
        this.userEmail = email;
        this.userPaymentMethod = paymentMethod;
    }

    public void setData(String name, int phone, String email, String paymentMethod) {
        this.userName = name;
        this.userPhoneNumber = phone;
        this.userEmail = email;
        this.userPaymentMethod = paymentMethod;
    }

    public String getName() {
        return userName;
    }

    public int getPhoneNumber() {
        return userPhoneNumber;
    }

    public String getEmail() {
        return userEmail;
    }

    public String getPaymentMethod() {
        return userPaymentMethod;
    }
    
    public String toString() {
        return "User{name='" + userName + '\'' + ", phoneNumber=" + userPhoneNumber + ", email=" + userEmail + ", paymentMethod=" + userPaymentMethod + '}';
    }
}

