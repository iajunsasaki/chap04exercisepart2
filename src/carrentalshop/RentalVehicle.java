package carrentalshop;

import java.util.ArrayList;

/**
 * 貸し出し用車両
 */
public abstract class RentalVehicle implements IMaintainableVehicle {
	/** 車両名称 */
	private String vehicleName;

	/** 走行距離Km */
	private int milageKm;

	/** 借りた人の名前履歴 */
	private ArrayList<String> renterHistoryList = new ArrayList<String>();
	
	private String maintenanceNote;

	/**
	 * コンストラクタ
	 * @param vehicleName 車両名
	 * @param milageKm 走行距離
	 */
	public RentalVehicle(String vehicleName, int milageKm) {
		this.vehicleName = vehicleName;
		this.milageKm = milageKm;
		this.maintenanceNote = "";
	}

	/**
	 * レンタカー利用
	 * @param renterName 借りた人
	 * @param runDistanceKm 走行距離
	 */
	public abstract void rentVehicle(String renterName, int runDistanceKm);

	@Override
	public String getVehicleName() {
		return this.vehicleName;
	}
	
	@Override
	public void regularCheckup(String mechanic, String note) {
		this.maintenanceNote += "整備士：" + mechanic + " " + note + "\r\n";
	}

	@Override
	public String getMaintenanceRecord() {
		return this.maintenanceNote;
	}
	
	// 演習０（復習）RentalVehicleなどのクラスにgetter, setterメソッドを定義してください

	
}
