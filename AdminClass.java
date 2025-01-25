

public class AdminClass
{
     // Attributes
    private int admin_id;
    private String admin_password;
    private int admin_phone_number;
    private boolean isLoggedIn;  

    // Constructor
    public AdminClass(int admin_id, String admin_password, int admin_phone_number) 
    {
        this.admin_id = admin_id;
        this.admin_password = admin_password;
        this.admin_phone_number = admin_phone_number;
        this.isLoggedIn = false;  
    }

    // Getters and Setters
    public int getAdminId() 
    {
        return admin_id;
    }

    public void setAdminId(int admin_id) 
    {
        this.admin_id = admin_id;
    }

    public String getAdminPassword() 
    {
        return admin_password;
    }

    public void setAdminPassword(String admin_password) 
    {
        this.admin_password = admin_password;
    }

    public int getAdminPhoneNumber() 
    {
        return admin_phone_number;
    }

    public void setAdminPhoneNumber(int admin_phone_number) 
    {
        this.admin_phone_number = admin_phone_number;
    }

    // Method for login
    public boolean login(int id, String password) 
    {
        if (this.admin_id == id && this.admin_password.equals(password)) 
        {
            isLoggedIn = true;
            System.out.println("Login successful! Welcome, Admin ^_^");
            return true;
        } 
        else
        {
            System.out.println("Invalid ID or password! Please try again.");
            return false;
        }
    }

    // Method for logout
    public void logout() 
    {
        if (isLoggedIn) 
        {
            isLoggedIn = false;
            System.out.println("Logout successful! See you again!!.");
        } else 
        {
            System.out.println("You are not logged in!");
        }
    }

    // Method to check if the admin is logged in
    public boolean isAdminLoggedIn() 
    {
        return isLoggedIn;
    }

    // Method to search for a user
    public void searchUser(int userId) 
    {
        if (isLoggedIn) 
        {
            System.out.println("Searching for user with ID: " + userId);
        } else 
        {
            System.out.println("Please log in first to perform this action.");
        }
    }

    // Method to view available parking slots
    public void viewParkingAvailable() 
    {
        if (isLoggedIn) 
        {
            System.out.println("Viewing available parking slots...");
        } 
        else 
        {
            System.out.println("Please log in first to perform this action.");
        }
    }

    // Method to register a user
    public void registerUser(String userName, String userEmail) 
    {
        if (isLoggedIn) 
        {
            System.out.println("Registering user: " + userName + ", Email: " + userEmail);
        } 
        else 
        {
            System.out.println("Please log in first to perform this action.");
        }
    }

    // Method to update a user
    public void updateUser(int userId, String newName) 
    {
        if (isLoggedIn) 
        {
            System.out.println("Updating user with ID: " + userId + " to new name: " + newName);
        } 
        else 
        {
            System.out.println("Please log in first to perform this action.");
        }
    }

    // Method to view a user
    public void viewUser(int userId) 
    {
        if (isLoggedIn) 
        {
            System.out.println("Viewing details of user with ID: " + userId);
        } 
        else 
        {
            System.out.println("Please log in first to perform this action.");
        }
    }

    // Method to delete a user
    public void deleteUser(int userId) 
    {
        if (isLoggedIn) 
        {
            System.out.println("Deleting user with ID: " + userId);
        } else 
        {
            System.out.println("Please log in first to perform this action.");
        }
    
    }
}

