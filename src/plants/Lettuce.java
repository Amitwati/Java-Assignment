package plants;

import graphics.ZooPanel;

public class Lettuce extends Plant {
	private static Lettuce instance;
	public Lettuce(ZooPanel pan) {
		super(pan);
		loadImages("lettuce");
	}
	public static Lettuce getInstance(ZooPanel pan) {
		if(instance == null)
			instance = new Lettuce(pan);

		return instance;
	}
}
