package mobility;

/**
 * Mobile class the implements location interface
 */
public abstract class Mobile implements ILocatable {
	protected Point location;

	/**
	 * ctor
	 * @param location
	 */
	public Mobile(Point location) {
		this.setLocation(location);
	}

	/**
	 * get the location
	 * @return location
	 */
	public Point getLocation() {
		return location;
	}

	/**
	 * set the location
	 * @param newLocation new location
	 * @return true if location is valid else false
	 */
	public boolean setLocation(Point newLocation) {
		this.location = newLocation;
		return true;

	}
}
