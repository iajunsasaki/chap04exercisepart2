package carrentalshop;

/**
 * 要保守車両
 */
public interface IMaintainableVehicle {
	/**
	 * 車両名を取得する
	 * @return 車両名
	 */
	public String getVehicleName();
	
	/**
	 * 定期点検を実施する
	 * @param mechanic 点検作業員
	 * @param note 点検記録
	 */
	public void regularCheckup(String mechanic, String note);
	
	/**
	 * 点検記録を取得する
	 * @return 点検記録
	 */
	public String getMaintenanceRecord();
}
