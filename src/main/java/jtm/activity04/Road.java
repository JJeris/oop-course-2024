package jtm.activity04;

public class Road {
	private String from; // Start point
	private String to; // End point
	private int distance; // distance in km

	/*- #1
	 * Select menu Source — Generate Constructor using Fields...
	 * and create constructor which sets from, to and distance
	 * values of the newly created object
	 */
	public Road(String from, String to, int distance) {
		this.from = from;
		this.to = to;
		this.distance = distance;
	}
	/*- TODO #2
	 * Create constructor without parameters, which sets empty
	 * values or 0 to all object properties
	 */
	public Road() {
		this.from = "";
		this.to = "";
		this.distance = 0;
	}

	/*- TODO #3
	 * Select menu: Source — Generate getters and Setters...
	 * and generate public getters/setters for distance, from and to
	 * fields
	 */

	public void setFrom(String from) {
		this.from = from;
	}

	public int getDistance() {
		return this.distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return this.from;
	}

	public String getTo() {
		return this.to;
	}

	/*- TODO #4
	 * Select menu: Source — Generate toString()...
	 * and implement this method, that it returns String in form:
	 * "From — To, 00km",
	 * where "From" is actual from point, "To" — actual to point and
	 * 00 is actual length of the road
	 * Note that — is not dash ("minus key" in jargon), but m-dash!
	 * See more at: https://en.wikipedia.org/wiki/Dash
	 */

	@Override
	public String toString() {
		return from + " — " + to + ", " + distance + "km";
	}

}
