package carrentalshop;

import java.util.ArrayList;

/**
 * レンタカー屋さんクラス
 */
public class CarRentalShop {

	public static void main(String[] args) {
		// 演習０．１（復習）RentalVehicleなどのクラスにgetter, setterメソッドを定義してください
		// 演習０．２（復習）Minivan、CompactCarクラスのrentVehicleメソッドを実装してください。
		//    内容は同一で大丈夫です。ロジックは次の通り：借りた人の名前をrenterHistoryListに追加、
		//                                                milageKmに引数のrunDistanceKmを足す
		//    Truckクラスについては後続の演習項目で行いますのでそのままにしておいてください
		
		// 演習１．１：ポリモーフィズム。下記のコードはCompactCarオブジェクトと
		//   Minivanオブジェクトがnewされています。
		//   ２つのオブジェクトに対して「車を借りる」ことができるようにrentVehicleメソッドを呼び出してみてください
		CompactCar mira = new CompactCar("mira", 10000);
		Minivan alphard = new Minivan("alphard", 2000);

		// 演習１．２：さて、今度は車のリストが準備します
		//   ①mira, alphard, carNo1, carNo2の車両オブジェクトをvehicleListに追加してください
		//   ②forやwhileなど繰り返し処理を使用してvehicleList内にある車両全てを貸し出す処理
		//    （rentVehicleメソッド呼び出し）を行ってください（truckについてはメッセージが出ますが
		//      次の演習項目でケアします）
		ArrayList<RentalVehicle> vehicleList = new ArrayList<RentalVehicle>();
		
		RentalVehicle carNo1 = new CompactCar("alto", 2000);
		RentalVehicle carNo2 = new Minivan("serena", 30000);
		RentalVehicle truck = new Truck("fuso", 50000);
		
		// 演習２．１：オブジェクトのキャスト、instanceof
		//   Truckだけ特別なレンタル条件があります（会社にのみ貸し出し可能）
		//   TruckクラスのrentTruckメソッドを実装してください
		// 演習２．２：演習１．２②での処理を調整し、Truckクラスのオブジェクトの
		//   場合はTruckクラスのrentTruckを呼び出すようにしてください。
		
		// 演習３：abstract classの継承クラス実装
		//   RentalVehicleクラスを継承するHybridCarクラスを実装し，エラーを解消させてください。
		//   他のクラスと同じように宣言・newしてvehicleListに登録してください
		
		// 演習４．１：インターフェースその１：インターフェースを利用するクラスを実装
		//   RentalVehicleクラスはIMaintainableVehicleインターフェースを実装しています。
		//   IMaintanableVehicleインターフェースを実装するもう一つのクラス（SalesCar）クラスを
		//   追加してエラーを解消させてください。
		
		ArrayList<IMaintainableVehicle> maintainanceVehicles = new ArrayList<IMaintainableVehicle>();
		
		for (IMaintainableVehicle vehicle : vehicleList) {
			maintainanceVehicles.add(vehicle);
		}

		// 整備を行う
		for (IMaintainableVehicle vehicle : maintainanceVehicles) {
			vehicle.regularCheckup("整備士１", "車両：" + vehicle.getVehicleName() + " " + vehicle.getMaintenanceRecord());
		}

		// ワンモアマイル１：自分が書いたコードが正しく動いているか確認するためのSystem.out.println()を
		//   要所要所に埋め込み，不具合が無いかを確かめてください。
	}

}
