package ParkingSystem;

import java.util.ArrayList;
import java.util.List;

public class Floors {

	    int fNum;
	    List<ParkingSpot> parkingSpots;
	    
	    public Floors(int fNum, int two_wheeler, int three_wheeler, int four_wheeler) {
	    	
	    	this.fNum = fNum;
	    	this.parkingSpots = new ArrayList<>(two_wheeler + three_wheeler + four_wheeler);
	    	
	    	for(int i=0;i<two_wheeler;i++) {
	    		ParkingSpot parkingSpot = new ParkingSpot(i,VehicleType.TWO_WHEELER,false); 
	    		parkingSpots.add(parkingSpot);
	    	}
	    	
	    	for(int i=0;i<three_wheeler;i++) {
	    		ParkingSpot parkingSpot = new ParkingSpot(i,VehicleType.THREE_WHEELER,false); 
	    		parkingSpots.add(parkingSpot);
	    	}
	    	
	    	for(int i=0;i<four_wheeler;i++) {
	    		ParkingSpot parkingSpot = new ParkingSpot(i,VehicleType.FOUR_WHEELER,false); 
	    		parkingSpots.add(parkingSpot);
	    	}
	    	
	    }
}
