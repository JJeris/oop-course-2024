package jtm.activity04;

import java.util.Locale;

public class Transport {
	// Do not change access modifiers to encapsulate internal properties!
	private String id; // Transport registration number
	private float consumption; // fuel consumption in litres per 100km
	private int tankSize; // tank size in litres
	private float fuelInTank; // fuel in tank

	/*- TODO #1
	 * Select menu Source — Generate Constructor using Fields...
	 * and create constructor which sets id, consumption, tankSize
	 * values of the newly created object
	 * And make fuel tank full.
	 */

	public Transport(String id, float consumption, int tankSize) {
		this.id = id;
		this.tankSize = tankSize;
		this.consumption = consumption;
		this.fuelInTank = tankSize;
	}
	/*- #2
	 * Select menu: Source — Generate getters and Setters...
	 * and generate public getters for consumption, tankSize, id, and
	 * fuelInTank fields
	 */
	public void setId(String id) {
		this.id = id;
	}

	public void setConsumption(float consumption) {
		this.consumption = consumption;
	}

	public void setTankSize(int tankSize) {
		this.tankSize = tankSize;
	}

	public void setFuelInTank(float fuelInTank) {
		this.fuelInTank = fuelInTank;
	}

	public String getId() {
		return this.id;
	}

	public float getConsumption() {
		return this.consumption;
	}

	public int getTankSize() {
		return this.tankSize;
	}

	public float getFuelInTank() {
		return this.fuelInTank;
	}
	/*- TODO #3
	 * Select menu: Source — Generate toString()...
	 * and implement this method, that returns String in form:
	 * "Id:ID cons:0.0l/100km, tank:00l, fuel:00.00l"
	 * where ID and numbers are actual properties of the transport
	 * HINT: use String.format(Locale.US, "%.2f", float) to limit shown digits
	 * to 2 decimal for fractions, and dot as a decimal delimiter.
	 */

	@Override
	public String toString() {
		return String.format(Locale.US, "Id:%s cons:%.1fl/100km, tank:%dl, fuel:%.2fl", id, consumption, tankSize, fuelInTank);
		// return "Id:" + id + " cons:" + consumption + "l/100km, tank:" + tankSize + "l, fuel:" + String.format(Locale.US, "%.2f", fuelInTank) + "l";

	}

	// Return transport id and type as string e.g. "AAA Transport"
	// HINT: use this.getClass().getSimpleName(); to get type of transport
	protected final String getType() {
		// return required value
		return id + " " + this.getClass().getSimpleName();
	}

	// HINT: use getType() to describe transport and road.toString() to describe
	// road
	// HINT: String.format(Locale.US, "%.2f", float) to format float number with
	// fixed mask
	public String move(Road road) {
		// If transport has enough fuel, decrease actual amount of fuel by
		// necessary amount and return String in form:
		// "AAA Type is moving on From–To, 180km"
		float fuelNeeded = (road.getDistance() * consumption) / 100;
		if (fuelNeeded < fuelInTank) {
			fuelInTank -= fuelNeeded;
			return getType() + " is moving on " + road;
		}
		else return "Cannot move on " + road + ". Necessary fuel:" + String.format(Locale.US, "%.2f", fuelNeeded) + "l, fuel in tank:" + String.format(Locale.US, "%.2f", fuelInTank) + "l";
	}

}
