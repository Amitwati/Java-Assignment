package animals;

import diet.Herbivore;
import graphics.ZooPanel;
import mobility.Point;

/**
 * The giraffe class
 */
public class Giraffe extends Animal {

	/**
	 * Ctor
	 * @param s speed
	 * @param h horizontal speed
	 * @param v vertical speed
	 * @param c color
	 */
	 public Giraffe(int s, int h, int v, String c) {
		 super("Giraffe",s,s*2,h,v,c,ZooPanel.getInstance(null));
		 setDiet(new Herbivore());
		 loadImages("grf");

		 cor_w = (int)(size*0.7);
	 }
}
