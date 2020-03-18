package truckCheck;

public class BridgeOfficer {

	int maxWeight;

	public BridgeOfficer(int normalVolume) {

		this.maxWeight = normalVolume;

	}

	public boolean CheckTruck(Truck truck) {
		if (truck.weight > maxWeight) {

			return false;

		} else {

			return true;
		}

	}
}
