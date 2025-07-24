package ParkingSystem;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		ParkingLot parkingLot = new ParkingLot(0, 5);
		Scanner sc = new Scanner(System.in);

		int ch;

		do {

			System.out.println("1. Wants to keep parkign Lot open");
			System.out.println("2. Wants to close the parking lot");
			ch = sc.nextInt();
			sc.nextLine();

			switch (ch) {

			case 1:

				System.out.println("1. Parking Entry");
				System.out.println("2. See ParkingSpots Status");
				System.out.println("3. Unpark the Vehicle");
				int ch1 = sc.nextInt();
				sc.nextLine();

				switch (ch1) {

					case 1:
	
						System.out.println("Enter v number");
						String vNum = sc.nextLine();
	
						System.out.print("Select the Parking Type \n");
						System.out.print("1.TWO WHEELER \n");
						System.out.print("2.THREE WHEELER \n");
						System.out.print("3.FOUR WHEELER \n");
	
						int ch2 = sc.nextInt();
						sc.nextLine();
						switch (ch2) {
	
							case 1:
								parkingLot.park(vNum, VehicleType.TWO_WHEELER);
								break;
		
							case 2:
								parkingLot.park(vNum, VehicleType.THREE_WHEELER);
								break;
		
							case 3:
								parkingLot.park(vNum, VehicleType.FOUR_WHEELER);
								break;
		
							default:
		
								System.out.print("Enter a correct option \n");
	
						}
						break;
					case 2:
	
						parkingLot.checkParkingStatus();
						break;
	
					case 3:
	
						System.out.println("Enter v number");
						String vNum1 = sc.nextLine();
						parkingLot.unPark(vNum1);
						break;
	
					default:
	
						System.out.println("Enter a valid option.");
					}
				    break;

			default:

				System.out.println("Enter a valid option.");
			}

		} while (ch != 2);

	}
}
