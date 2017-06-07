package animals;

import diet.Omnivore;
import graphics.ZooPanel;
import mobility.Point;

public class Bear extends Animal {

	public Bear(int s,int x, int y, int h, int v, String c, ZooPanel p) {
		 super("Bear",(int)(s),s,h,v,c,p);
		 setLocation(new Point(x,y));
		 setDiet(new Omnivore());
		 loadImages("bea");
		 cor_h = (int)(size*0.55);
	 }
}
