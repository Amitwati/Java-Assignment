package animals;

import diet.Carnivore;
import graphics.ZooPanel;
import mobility.Point;

public class Lion extends Animal {

	 public Lion(int s, int h, int v, String c) {
		 super("Lion",(int)(s),(int)(s*0.8),h,v,c,ZooPanel.getInstance(null));
		 setDiet(new Carnivore());
		 loadImages("lio");
		 cor_h = (int)(size*0.73);
	 }
}
