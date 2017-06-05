package plants;

import graphics.ZooPanel;

import java.awt.*;

public class Cabbage extends Plant {
	private static Cabbage instance;
	private Cabbage(ZooPanel pan) {
		super(pan);
		loadImages("cabbage");
	}

	public static Cabbage getInstance(ZooPanel pan) {
		if(instance == null)
			instance = new Cabbage(pan);

		return instance;
	}
}
