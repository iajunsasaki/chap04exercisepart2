package carrentalshop;

/**
 * レンタル用トラック。会社にしかレンタルしない
 */
public class Truck extends RentalVehicle {
	/** 貸し出し相手の会社 */
	private String companyName;
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Truck(String name, int milage) {
		super(name, milage);
	}
	
	@Override
	public void rentVehicle(String renterName, int runDistanceKm) {
		// 変更しないで！！！
		System.out.println("トラックは個人に貸し出せません！");
	}

	/**
	 * トラック貸し出しメソッド
	 * @param companyName 会社名
	 * @param driverName ドライバ名
	 * @param runDistanceKm 走行距離
	 */
	public void rentTruck(String companyName, String driverName, int runDistanceKm) {
		// 
	}
	
}
