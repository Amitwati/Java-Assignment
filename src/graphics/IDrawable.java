package graphics;

import java.awt.Graphics;
import java.io.File;

public interface IDrawable {
	//when working on linux the saperate should be '/' | on windows '\\'
	public final static String PICTURE_PATH = "src/pictures/";
	 public void loadImages(String nm);
	 public void drawObject(Graphics g);
	 public String getColor();	 
}

