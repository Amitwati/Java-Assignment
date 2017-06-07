package animals;

import diet.Herbivore;
import graphics.ZooPanel;
import mobility.Point;

public class Giraffe extends Animal {

	 public Giraffe(int s,int x, int y, int h, int v, String c, ZooPanel p) {
		 super("Giraffe",s,s*2,h,v,c,p);
		 setLocation(new Point(0,0));
		 setDiet(new Herbivore());
		 loadImages("grf");

		 cor_w = (int)(size*0.7);
	 }
}
