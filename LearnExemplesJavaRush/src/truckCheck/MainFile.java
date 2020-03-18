package truckCheck;

public class MainFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Truck first =  new Truck();
		first.weight=10000;
		Truck second = new Truck();
		second.weight = 20000;
		
		BridgeOfficer officer = new BridgeOfficer(15000);
		System.out.println("Truck nr. 1! ");
		boolean canFirstTuckGo = officer.CheckTruck(first);
		System.out.println(canFirstTuckGo);
		
		System.out.println();
		
		System.out.println("Truck nr. 2! ");
		boolean canSecondTuckGo = officer.CheckTruck(second);
		System.out.println(canSecondTuckGo);

	}

}
