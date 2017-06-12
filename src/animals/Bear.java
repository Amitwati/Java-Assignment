package animals;

import diet.Omnivore;
import graphics.ZooPanel;
import mobility.Point;

/**
 * The bear class
 */
public class Bear extends Animal {

	/**
	 * Ctor
	 * @param s speed
	 * @param h horizontal speed
	 * @param v vertical speed
	 * @param c color
	 */
	public Bear(int s, int h, int v, String c) {
		 super("Bear",(int)(s),s,h,v,c,ZooPanel.getInstance(null));
		 setDiet(new Omnivore());
		 loadImages("bea");
		 cor_h = (int)(size*0.55);
	 }
}
