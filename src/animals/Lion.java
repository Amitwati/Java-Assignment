package animals;

import diet.Carnivore;
import graphics.ZooPanel;
import mobility.Point;

/**
 * The lion class
 */
public class Lion extends Animal {

	/**
	 * Ctor
	 * @param s speed
	 * @param h horizontal speed
	 * @param v vertical speed
	 * @param c color
	 */
	 public Lion(int s, int h, int v, String c) {
		 super("Lion",(int)(s),(int)(s*0.8),h,v,c,ZooPanel.getInstance(null));
		 setDiet(new Carnivore());
		 loadImages("lio");
		 cor_h = (int)(size*0.73);
	 }
}
