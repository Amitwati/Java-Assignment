package animals;

import diet.Herbivore;
import graphics.ZooPanel;
import mobility.Point;

public class Giraffe extends Animal {

	 public Giraffe(int s, int h, int v, String c) {
		 super("Giraffe",s,s*2,h,v,c,ZooPanel.getInstance(null));
		 setDiet(new Herbivore());
		 loadImages("grf");

		 cor_w = (int)(size*0.7);
	 }
}
