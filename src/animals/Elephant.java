package animals;

import diet.Herbivore;
import graphics.ZooPanel;
import mobility.Point;

/**
 * The elephant class
 */
public class Elephant extends Animal {

	/**
	 * Ctor
	 * @param s speed
	 * @param h horizontal speed
	 * @param v vertical speed
	 * @param c color
	 */
	 public Elephant(int s, int h, int v, String c) {
		 super("Elephant",(int)(s),(s-45)*20,h,v,c,ZooPanel.getInstance(null));
		 setDiet(new Herbivore());
		 loadImages("elf");
		 cor_h = (int)(size*0.7);
	 }
	 
}
