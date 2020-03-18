package truckCheck;

public class Truck {

	// lungimea, latimea, inaltimea
	int lenght;
	int width;
	int height;

	// volumul
	int weight;

	public int getVolume() {

		int volume = lenght * width * height;
		return volume;
	}

}
