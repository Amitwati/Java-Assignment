package plants;


/**
 * Cabbage singlton class
 */
public class Cabbage extends Plant {
	private static Cabbage instance;

	/**
	 * private ctor for the instance
	 */
	private Cabbage() {
		super();
		loadImages("cabbage");
	}

	/**
	 * get the instance and initlize it if it null
	 * @return instance object
	 */
	public static Cabbage getInstance() {
		if(instance == null)
			instance = new Cabbage();

		return instance;
	}
}
