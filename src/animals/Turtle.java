package animals;

import diet.Herbivore;
import graphics.ZooPanel;
import mobility.Point;

/**
 * @author Sergey Tregulov
 *
 */
public class Turtle extends Animal {

	public Turtle(int s,int x, int y, int h, int v, String c, ZooPanel p) {
		 super("Turtle",s,s/2,h,v,c,p);
		 setLocation(new Point(x,y));
		 setDiet(new Herbivore());
		 loadImages("trt");

		 cor_h = (int)(size*0.55);
	 }
}
