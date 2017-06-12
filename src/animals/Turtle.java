package animals;

import diet.Herbivore;
import graphics.ZooPanel;
import mobility.Point;

/**
 * The turtle class
 */
public class Turtle extends Animal {

	/**
	 * Ctor
	 * @param s speed
	 * @param h horizontal speed
	 * @param v vertical speed
	 * @param c color
	 */
	public Turtle(int s, int h, int v, String c) {
		 super("Turtle",s/2,s/2,h,v,c,ZooPanel.getInstance(null));
		 setDiet(new Herbivore());
		 loadImages("trt");

		 cor_h = (int)(size*0.55);
	 }
}
