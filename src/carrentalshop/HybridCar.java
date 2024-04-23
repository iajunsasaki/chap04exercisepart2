package carrentalshop;

public class HybridCar extends RentalVehicle {

	public HybridCar(String name, int milageKm) {
		super(name,milageKm);
	}
	
	@Override
	public void rentVehicle(String renterName, int runDistanceKm) {
		// TODO 自動生成されたメソッド・スタブ
		addRenterToHistoryList(renterName);
		setMilageKm(getMilageKm() + runDistanceKm);
	}

}
