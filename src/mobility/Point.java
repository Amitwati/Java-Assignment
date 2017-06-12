package mobility;

/**
 * Point class
 */
public class Point {

	private int x; // the x value
	private int y; // the y value

	/**
	 * Ctor
	 * @param x
	 * @param y
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * get x
	 * @return x
 	 */
	public int getX() {
		return x;
	}

	/**
	 * get y
	 * @return y
	 */
	public int getY() {
		return y;
	}

	/**
	 * set x
	 * @param x new x
	 * @return true
	 */
	public boolean setX(int x) {
		this.x = x;
		return true;
	}

	/**
	 * set y
	 * @param y new y
	 * @return true
	 */
	public boolean setY(int y) {
		this.y = y;
		return true;
	}
}
