package ParkingSystem;

public class ParkingSpot {

	  int id;
	  Vehicle v;
	  VehicleType vType;
	  boolean isFull;
	  
	  public ParkingSpot(int id, VehicleType vType, boolean isFull) {
		   this.id = id;
		   this.vType = vType;
		   this.isFull = isFull;
	  }
}
