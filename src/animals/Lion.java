package animals;

import diet.Carnivore;
import graphics.ZooPanel;
import mobility.Point;

public class Lion extends Animal {

	 public Lion(int s,int x, int y, int h, int v, String c, ZooPanel p) {
		 super("Lion",(int)(s),(int)(s*0.8),h,v,c,p);
		 setLocation(new Point(x,y));
		 setDiet(new Carnivore());
		 loadImages("lio");
		 cor_h = (int)(size*0.73);
	 }
}
