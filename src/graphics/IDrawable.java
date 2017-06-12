package graphics;

import java.awt.Graphics;
import java.io.File;

/**
 * the draw interface for the printable objects
 */
public interface IDrawable {
	//pictures path
	public final static String PICTURE_PATH = "src/pictures/";

	/**
	 * load the image for the object
	 * @param nm
	 * 			name of the image file
	 */
	 public void loadImages(String nm);

	/**
	 * draw the object on the panel
	 * @param g
	 */
	public void drawObject(Graphics g);

	/**
	 * get the color param of the object
	 * @return string color
	 */
	 public String getColor();	 
}

