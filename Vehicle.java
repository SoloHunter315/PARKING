
public class Vehicle
{
     // Fields to store vehicle details
    String licensePlate;
    String ownerName;
    boolean paymentStatus;
    int parkingDuration;

    // Constructor to initialize the fields
    public Vehicle(String plate, String owner, boolean status) 
    {
        licensePlate = plate;
        ownerName = owner;
        paymentStatus = status;
        parkingDuration = 0;
    }

    // Method to display the vehicle's details using if-else
    public void displayDetails() 
    {
        String status;
        if (paymentStatus) 
        {
            status = "Paid";
        } else 
        {
            status = "Unpaid";
        }
        
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Payment Status: " + status);
        System.out.println("-----------------------------");
    }
}


