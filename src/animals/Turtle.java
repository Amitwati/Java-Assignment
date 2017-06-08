package animals;

import diet.Herbivore;
import graphics.ZooPanel;
import mobility.Point;

/**
 * @author Sergey Tregulov
 *
 */
public class Turtle extends Animal {

	public Turtle(int s, int h, int v, String c) {
		 super("Turtle",s,s/2,h,v,c,ZooPanel.getInstance(null));
		 setDiet(new Herbivore());
		 loadImages("trt");

		 cor_h = (int)(size*0.55);
	 }
}
