import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import java.util.Queue;

public class UpdateParkingApp 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        ArrayList<Parking> vehicle = new ArrayList();
        LinkedList<Car> theList = new LinkedList();
        ParkingSystem parkingSystem = new ParkingSystem();

        int select = 0;
        int option = 0;  
        System.out.println("1.Staff || 2.Customer");
        if(select == 1)
        {
          System.out.println("Please enter your admin id:");
          int admin_id = s.nextInt();
          System.out.println("Please enter your password:");
          String admin_password = s.next();
            
            while (option != 3) { // Loop until the user chooses option 3 (Exit)
            System.out.println("\n=== Parking Management ===");
            System.out.println("1. View All Vehicles");
            System.out.println("2. Update Parking Duration");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            option = s.nextInt();
            s.nextLine(); // Consume newline character

            if (option == 1) 
            {
                // View all vehicles 
                if (vehicles.isEmpty()) 
                {
                    System.out.println("No vehicles to display.");
                } 
                else 
                {
                    System.out.println("Vehicle List:");
                    for (int i = 0; i < vehicles.size(); i++) 
                    {
                        Vehicle v = vehicles.get(i); // Get the vehicle at index i
                        v.displayDetails();
                    }
                }
            }
            else if (option == 2) 
            {
                // Update parking duration
                System.out.print("Enter License Plate to update: ");
                String plate = s.nextLine();

                // Iterating over the list of vehicles to find the matching one
                for (int i = 0; i < vehicles.size(); i++) 
                {
                    Vehicle v = vehicles.get(i); // Get the vehicle at index i
                    if (v.licensePlate.equalsIgnoreCase(plate)) 
                    {
                        System.out.print("Enter new parking duration (in hours): ");
                        int newparkingDuration = s.nextInt();
                        v.parkingDuration = newparkingDuration;
                        System.out.println("Parking duration updated successfully!");
                        break;// Exit the loop after updating the vehicle's parking duration
                    }
                }

                // If no vehicle was found (not using a flag, just checking inside the loop)
                System.out.println("Vehicle not found.");
            } 
            else if (option == 3) 
            {
                // Exit the program
                System.out.println("Exiting... Goodbye!");
            } 
            else 
            {
                System.out.println("Invalid option. Please try again.");
            }
          }
            System.out.println("\n=== Simple Vehicle Management ===");
            System.out.println("1. Add Vehicle");
            System.out.println("2. View All Vehicles");
            System.out.println("3. Update Payment Status");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            option = s.nextInt();
            s.nextLine(); // Consume newline character

          if (option == 1) 
            {
                System.out.print("Enter License Plate: ");
                String plate = s.nextLine();
                System.out.print("Enter Owner Name: ");
                String owner = s.nextLine();
                System.out.print("Has the payment been made? (true for yes, false for no): ");
                boolean paid = s.nextBoolean();
                vehicles.add(new Vehicle(plate, owner, paid));
                System.out.println("Vehicle added successfully!");
            } 
            else if (option == 2) 
            {
                if (vehicles.isEmpty()) 
                {
                    System.out.println("No vehicles to display.");
                } else 
                {
                    System.out.println("Vehicle List:");
                    for (int i = 0; i < vehicles.size(); i++) 
                    {
                        Vehicle v = vehicles.get(i); 
                        v.displayDetails();
                    }
                }
            } 
            else if (option == 3) 
            {
                System.out.print("Enter License Plate to update: ");
                String plate = s.nextLine();
                int found = 0;
                for (int i = 0; i < vehicles.size(); i++) 
                {
                    Vehicle v = vehicles.get(i); 
                    if (v.licensePlate.equalsIgnoreCase(plate)) 
                    {
                        System.out.print("Enter new payment status (true for paid, false for unpaid): ");
                        v.paymentStatus = scanner.nextBoolean();
                        System.out.println("Payment status updated successfully!");
                        found = 1;
                        break;
                    }
                }
            } 
            else if (option == 4) 
            {
                System.out.println("Exiting... Goodbye!");
                
            } 
            else 
            {
                System.out.println("Invalid option. Please try again.");
            }
        }
      
        vehicle.add(new Parking("P001", "A1", "Compact", "ABC1234"));
        vehicle.add(new Parking("P002", "A2", "Sedan", "XYZ5678"));
        vehicle.add(new Parking("P003", "A3", "Compact", "MNO8765"));
        vehicle.add(new Parking("P004", "B1", "Sedan","EFG4321"));
        vehicle.add(new Parking("P005", "B2", "SUV", "BRN3210"));
        vehicle.add(new Parking("P006", "B3", "Sedan", "JKL2109"));
        vehicle.add(new Parking("P007", "C1", "SUV", "WIL5432"));
        vehicle.add(new Parking("P008", "C2", "Compact", "OLV7654"));
        vehicle.add(new Parking("P009", "C3", "Luxury", "DVB5670"));
        vehicle.add(new Parking("P010", "D1", "Pickup", "WWE8904"));
        vehicle.add(new Parking("P011", "D2", "Sedan", "WWT7890"));
        vehicle.add(new Parking("P012", "D3", "Compact", "WWE4521"));
        vehicle.add(new Parking("P013", "E1", "SUV", "BRN3210"));
        vehicle.add(new Parking("P014", "E2", "Luxury", "JKL2109"));
        vehicle.add(new Parking("P015", "E3", "SUV", "WIL5432"));
        vehicle.add(new Parking("P016", "F1", "Luxury", "VGF3302"));
        vehicle.add(new Parking("P017", "F2", "Sedan", "WXY5678"));
        vehicle.add(new Parking("P018", "F3", "Compact", "JKL7890"));
        vehicle.add(new Parking("P019", "G1", "SUV", "DEF3456"));
        vehicle.add(new Parking("P020", "G2", "Luxury", "GHI4567"));
        vehicle.add(new Parking("P021", "G3", "Compact", "PQR6789"));
        vehicle.add(new Parking("P022", "H1", "SUV", "LMN8901"));
        vehicle.add(new Parking("P023", "H2", "Compact", "STU234"));
        vehicle.add(new Parking("P024", "H3", "Luxury", "OPQ4567"));
        vehicle.add(new Parking("P025", "I1", "Electric", "VWX6789"));

        System.out.println("Please enter your parking id: ");
        String parkingId = s.next();
        
        s.nextLine(); 
        
        System.out.println("\nPlease enter your parking slot: ");
        String parkingSlot = s.next();
        
        System.out.println("Please enter your parking type: ");
        String parkingType = s.next();
        
        System.out.println("Enter your car plate number: ");
        String carPlate = s.next();
        
        Parking searchPark = new Parking(parkingId, parkingSlot, parkingType, carPlate);
        vehicle.add(searchPark);
      
      //search for available parking
      int ind = -1; 
      Parking p = null;
      
      for(int i = 0; i<vehicle.size(); i++)
      {
          p = (Parking) vehicle.get(i);
          if(!p.getIsOccupied() ) //check if parking not occupied(diduduki)
          {
             System.out.println("\n\nAvailable parking is found: ");
             System.out.println("Parking ID: " + p.getParkingId() + " " + "\nParking Slot: " + p.getParkingSlot() + " " + "\nParking Type: " + p.getParkingType());
             ind = i;
             break; //exit the loop after finding an available space
          }
          
      }
      
      //if no availablle parking was found
      if(ind == -1)
      {
          System.out.println("No available parking spaces.");   
      }
      
      //example to searching for a spesific vehicle by its plate number
      System.out.println("\n\nPlease enter the car plate number to search for: ");
      String searchPlate = s.next();
      
      boolean found = false;
      for(int j = 0; j<vehicle.size(); j++)
      {
          p = (Parking) vehicle.get(j);
          if(p.getCarPlate().equals(searchPlate))
          {
              System.out.println("\n\nVehicle is found!!!: " + "\nParking ID: " + p.getParkingId() + " " + "\nParking Slot: " + p.getParkingSlot() + " " + "\nParking Type: " + p.getParkingType());
              found = true;
              break; //exit loop after finding the vehicle
          }
          
      }
      
      if(!found)
      {
          System.out.println("Sorry Mr/Mrs, the vehicle with plate number: " + searchPlate + " not found.");
      }
     
      //add some data for car object
      theList.add(new Car("ABC1234", "Toyota Vios", 08.30, 10.45));
      theList.add(new Car("XYZ5678", "Honda Civic", 09.00, 12.30));
      theList.add(new Car("MNO8765", "Perodua Myvi", 10.15, 02.00));
      theList.add(new Car("EFG4321", "Proton Saga", 11.00, 01.00));
      theList.add(new Car("BRN3210", "Nissan Almera", 12.30,03.45));
      theList.add(new Car("JKL2109", "Hyundai Elantra", 01.45, 04.30));
      theList.add(new Car("WIL5432", "Kia Sportage", 02.00, 05.15));
      theList.add(new Car("OLV7654", "Mazda 3",03.00, 06.30));
      theList.add(new Car("DVB5670", "BMW X5",10.30,12.45));
      theList.add(new Car("WWE8904", "Ford Ranger", 07.00,10.00));
      theList.add(new Car("WWT7890", "Honda Accord", 10.15, 04.00));
      theList.add(new Car("WWE4521", "Perodua Axia", 10.30, 03.30));
      theList.add(new Car("BRN3210", "Toyota Hilux", 12.30, 03.45));
      theList.add(new Car("JKL2109", "Lexus RX350", 02.45, 04.30));
      theList.add(new Car("WIL5432", "Audi Q5", 02.00, 05.30));
      theList.add(new Car("VGF3302", "Mercedes-Benz C200", 03.29, 07.00));
      theList.add(new Car("WXY5678", "Volkswagen Passat", 09.00, 01.00));
      theList.add(new Car("JKL7890", "Subaru Forester", 07.30, 11.30));
      theList.add(new Car("DEF3456", "Mitsubishi Outlander", 10.00, 02.00));
      theList.add(new Car("GHI4567", "Volvo XC60", 08.45, 12.45));
      theList.add(new Car("PQR6789", "Peugeot 3008", 06.15, 10.15));
      theList.add(new Car("LMN8901", "Renault Captur", 09.30, 01.30));
      theList.add(new Car("STU2345", "Jeep Cherokee", 07.00,11.00));
      theList.add(new Car("OPQ4567", "Porsche Cayenne", 10.15, 02.15));
      theList.add(new Car("VWX6789", "Tesla Model 3", 08.30, 12.30));
      
      
      //to delete records of exited vehicles
      Car c = null; //to store the car that exists
      if(!theList.isEmpty())
      {
        c = theList.removeFirst(); // remove the first car from the list and linkedlist nama theList
        System.out.println("\n\nDATA DELETED:");
        System.out.println(c.toString()); // to print the car data that was removed
      }
      else
      {
          System.out.println("CANNOT DELETE - BECAUSE LIST IS EMPTY");
      }
    
    // Menu-based system using if-else
      while (true) 
      {
        System.out.println("\nParking System Menu:");
        System.out.println("1. Add Parking Slot");
        System.out.println("2. Occupy Parking Slot");
        System.out.println("3. Vacate Parking Slot");
        System.out.println("4. Display Parking Slots");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) 
        {
            // Add Parking Slot
            System.out.print("Enter Parking ID: ");
            String parkingId = scanner.nextLine();
            System.out.print("Enter Parking Slot: ");
            String parkingSlot = scanner.nextLine();
            System.out.print("Enter Parking Type: ");
            String parkingType = scanner.nextLine();
            System.out.print("Enter Car Plate (leave empty if vacant): ");
            String carPlate = scanner.nextLine();
            parkingSystem.addParkingSlot(parkingId, parkingSlot, parkingType, carPlate);

        } else if (choice == 2) 
        {
            // Occupy Parking Slot
            System.out.print("Enter Parking ID to Occupy: ");
            String parkingId = scanner.nextLine();
            System.out.print("Enter Car Plate: ");
            String carPlate = scanner.nextLine();
            parkingSystem.occupyParkingSlot(parkingId, carPlate);

        } else if (choice == 3)
        {
            // Vacate Parking Slot
            System.out.print("Enter Parking ID to Vacate: ");
            String parkingId = scanner.nextLine();
            parkingSystem.vacateParkingSlot(parkingId);

        } else if (choice == 4) 
        {
            // Display Parking Slots
            parkingSystem.displayParkingSlots();

        } else if (choice == 5) 
        {
            // Exit
            System.out.println("Exiting Parking System.");
            scanner.close();
            return;

        } else 
        {
            System.out.println("Invalid choice. Please try again.");
        }
    }
          
      
      
      
      
      
    else if(select == 2) // berkaitan customer
    {
            
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        scanner.close();
    }
}




    


      
 class UpdateParking 
{
    public static void main(String[] args) 
    {
        // Create a LinkedList for parking entries
        LinkedList theList = new LinkedList();
        
        // Input 5 parking entries into the list
        for (int i = 0; i < 3; i++) 
        {
            // Get user inputs using JOptionPane
            String vehicleNumber = JOptionPane.showInputDialog("Please enter your vehicle number:");
            String ownerName = JOptionPane.showInputDialog("Please enter your name:");
            String ownerVehiclePlate = JOptionPane.showInputDialog("Please enter your car plate number:");
            String timeIn = JOptionPane.showInputDialog("Enter time in (e.g., 01/15/2025 12:00):");
            String timeOut = JOptionPane.showInputDialog("Enter time out (e.g., 01/15/2025 14:00):");

            // Create a new parking entry using the user input
            ParkingEntry entry = new ParkingEntry(vehicleNumber, ownerName, ownerVehiclePlate, timeIn, timeOut);

            // Insert the parking entry at the front of the list
            theList.insertAtFront(entry);  // Insert at the front of the list
        }

        // Display all parking entries in the linked list
        System.out.println("\nLIST OF PARKING ENTRIES:");
        LinkedList.Node current = theList.first;
        while (current != null) 
        {
            System.out.println(current.data.toString());
            current = current.next;
        }

        
    }
}


    class ParkingSystem 
{
    static int totalSlots, availableSlots;
    static Queue<String> parkingQueue = new LinkedList<>();  
    public static void main(String[] args) 
    {
        String totalSlotsInput = JOptionPane.showInputDialog("Enter the total number of parking slots:");
        totalSlots = Integer.parseInt(totalSlotsInput);
        availableSlots = totalSlots;

        while (true) 
        {
            String choiceInput = JOptionPane.showInputDialog(
                    "What would you like to do?\n" +
                    "1. Park a car\n" +
                    "2. Remove a car\n" +
                    "3. View parked cars\n" +
                    "4. Exit");

            int choice = Integer.parseInt(choiceInput);

            switch (choice) 
            {
                case 1:
                    parkCar();
                    break;
                case 2:
                    removeCar();
                    break;
                case 3:
                    viewParkedCars();
                    break;
                case 4:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
            }
        }
    }

    public static void parkCar() 
    {
        if (availableSlots == 0) 
        {
            JOptionPane.showMessageDialog(null, "Sorry, there are no available parking slots.");
            return;
        }

        String licensePlate = JOptionPane.showInputDialog("Enter the license plate number of the car:");

        // Enqueue operation: Add car to the parking queue (FIFO)
        parkingQueue.offer(licensePlate);
        availableSlots--;
        JOptionPane.showMessageDialog(null, "Car parked successfully. Available slots: " + availableSlots);
    }

    public static void removeCar() 
    {
        if (availableSlots == totalSlots)
        {
            JOptionPane.showMessageDialog(null, "There are no parked cars.");
            return;
        }

        String licensePlate = JOptionPane.showInputDialog("Enter the license plate number of the car to be removed:");

        // Remove car by matching the license plate
        boolean carFound = false;

        int size = parkingQueue.size();
        for (int i = 0; i < size; i++) 
        {
            String car = parkingQueue.poll();  // Dequeue the car
            if (car.equals(licensePlate)) 
            {
                carFound = true;
                availableSlots++;
            } 
            else 
            {
                parkingQueue.offer(car);  
            }
        }

        if (carFound) 
        {
            JOptionPane.showMessageDialog(null, "Car removed successfully. Available slots: " + availableSlots);
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "The car is not parked here.");
        }
    }

    public static void viewParkedCars() 
    {
        {  if (availableSlots == totalSlots)
            {
            JOptionPane.showMessageDialog(null, "There are no parked cars.");
            return;
            }

            StringBuilder parkedCarsList = new StringBuilder("Parked cars:\n");
            for (String licensePlate : parkingQueue) 
            {
                parkedCarsList.append(licensePlate).append("\n");
            }

            JOptionPane.showMessageDialog(null, parkedCarsList.toString());
        } 
    }
}





    

    
    





  




