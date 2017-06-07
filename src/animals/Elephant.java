package animals;

import diet.Herbivore;
import graphics.ZooPanel;
import mobility.Point;

public class Elephant extends Animal {

	 public Elephant(int s,int x, int y, int h, int v, String c, ZooPanel p) {
		 super("Elephant",(int)(s),(s-45)*20,h,v,c,p);
		 setLocation(new Point(x,y));
		 setDiet(new Herbivore());
		 loadImages("elf");
		 cor_h = (int)(size*0.7);
	 }
	 
}
