package carrentalshop;

public class CompactCar extends RentalVehicle {

	public CompactCar(String name, int milageKm) {
		super(name, milageKm);
	}
	
	@Override
	public void rentVehicle(String renterName, int runDistanceKm) {
		addRenterToHistoryList(renterName);
		setMilageKm(getMilageKm() + runDistanceKm);
	}

}
