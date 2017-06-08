package animals;

import diet.Herbivore;
import graphics.ZooPanel;
import mobility.Point;

public class Elephant extends Animal {

	 public Elephant(int s, int h, int v, String c) {
		 super("Elephant",(int)(s),(s-45)*20,h,v,c,ZooPanel.getInstance(null));
		 setDiet(new Herbivore());
		 loadImages("elf");
		 cor_h = (int)(size*0.7);
	 }
	 
}
