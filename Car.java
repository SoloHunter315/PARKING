

public class Car
{
    // instance variables - replace the example below with your own
    private String carPlate;
    private String carName;
    private double carIn;
    private double carOut;

    public Car()
    {
        this.carPlate = carPlate;
        this.carName = carName;
        this.carIn = carIn;
        this.carOut = carOut;
    }
    
    public Car(String carPlate, String carName, double carIn, double carOut)
    {
        this.carPlate = carPlate;
        this.carName = carName;
        this.carIn = carIn;
        this.carOut = carOut;
    }

    public void setData(String carPlate, String carName, double carIn, double carOut)
    {
        this.carPlate = carPlate;
        this.carName = carName;
        this.carIn = carIn;
        this.carOut = carOut;
    }
    
    public String getCarPlate()
    {
        return carPlate;
    }
    
    public String getCarName()
    {
        return carName;
    }
    
    public double getCarIn()
    {
        return carIn;
    }
    
    public double getCarOut()
    {
        return carOut;
    }
    
    
    public String toString()
    {
        return ("CAR PLATE: " + carPlate + " " + "\nCAR NAME: " + carName + " " + "\nCAR TIME IN: " + carIn + " " + "\nCAR TIME OUT: " + carOut);
    }
    
}
