package ParkingSystem;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
	
	 int pNum;
	 List<Floors> floors;
	 
	 public ParkingLot(int pNum, int numberOfFloors) {
		 this.pNum = pNum;
		 this.floors = new ArrayList<>(numberOfFloors);
		 for(int i=0;i<numberOfFloors;i++) {
			 Floors floor = new Floors(i,3,4,5);
			 floors.add(floor);
		 }
		 
	 }
	 
	 public boolean park(String vNum, VehicleType vType) {
		  
		    for(int i=0;i<floors.size();i++) {
		    	Floors floor = floors.get(i);
		    	for(int j=0;j<floor.parkingSpots.size();j++) {
		    		ParkingSpot parkingSpot = floor.parkingSpots.get(j);
		    		if(parkingSpot.vType.equals(vType) && !parkingSpot.isFull) {
		    			Vehicle vehicle = new Vehicle(vNum, vType);
		    			parkingSpot.v = vehicle;
		    			parkingSpot.isFull = true;
		    			System.out.println("\n Vehicle Parked \n");
		    			return true;
		    			
		    		}
		    	}
		    }
		    return false;
	 }
	 
	
	 public boolean unPark(String vNum) {
		    for(int i=0;i<floors.size();i++) {
		    	Floors floor = floors.get(i);
		    	for(int j=0;j<floor.parkingSpots.size();j++) {
		    		ParkingSpot parkingSpot = floor.parkingSpots.get(j);
		    		if(parkingSpot.v!=null && parkingSpot.v.vNum.equals(vNum) && parkingSpot.isFull) {
		    			parkingSpot.v = new Vehicle();
		    			parkingSpot.isFull = false;
		    			System.out.println("\n Vehicle UnParked \n");
		    			return true;
		    		}
		    	}
		    }
		    return false;
	 }

	public void checkParkingStatus() {
	  
		for(int i=0;i<floors.size();i++) {
			Floors floor = floors.get(i);
			System.out.println("Floor : " + floor.fNum);
			for(int j=0;j<floor.parkingSpots.size();j++) {
				ParkingSpot spot = floor.parkingSpots.get(j);

	            String status = spot.isFull==true ? "Parked" : "Available";
	            System.out.printf("Spot %d [%s] : %s%n", j+1, spot.vType, status);
			}
			System.out.println();
		}
		
	}
}
