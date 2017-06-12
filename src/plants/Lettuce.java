package plants;


/**
 * Lettuce singlton class
 */
public class Lettuce extends Plant {
	private static Lettuce instance;

	/**
	 * private ctor for the instance
	 */
	private Lettuce() {
		super();
		loadImages("lettuce");
	}

	/**
	 * get the instance and initlize it if it null
	 * @return instance object
	 */
	public static Lettuce getInstance() {
		if(instance == null)
			instance = new Lettuce();

		return instance;
	}
}
