
public class Parking
{
    private String parkingId;
    private String parkingSlot;
    private String parkingType;
    private String carPlate;
    boolean isOccupied;
    
    public Parking()
    {
        this.parkingId = parkingId;
        this.parkingSlot = parkingSlot;
        this.parkingType = parkingType;
        this.carPlate = carPlate;
        this.isOccupied = false; 
    
    }
    
    public Parking(String parkingId, String parkingSlot, String parkingType, String carPlate)
    {
        this.parkingId = parkingId;
        this.parkingSlot = parkingSlot;
        this.parkingType = parkingType;
        this.carPlate = carPlate;
        this.isOccupied = false;
      
    }

    public void setData(String parkingId, String parkingSlot, String parkingType, String carPlate)
    {
        this.parkingId = parkingId;
        this.parkingSlot = parkingSlot;
        this.parkingType = parkingType;
        this.carPlate = carPlate;
        this.isOccupied = false;
        
    }
    
    public void setIsOccupied(boolean isOccupied)
    {
        this.isOccupied = isOccupied;
    }
    
    public String getParkingId()
    {
        return parkingId;
    }
    
    public String getParkingSlot()
    {
        return parkingSlot;
    }
    
    public String getParkingType()
    {
        return parkingType;
    }
    
    public String getCarPlate()
    {
        return carPlate;
    }
    
    public boolean getIsOccupied()
    {
        return isOccupied;
    }
    
    public String toString()
    {
        return ("PARKING ID: " + parkingId + "PARKING SLOT: " + parkingSlot + "PARKING TYPE: " + parkingType + "CAR PLATE: " + carPlate);
    }
}
