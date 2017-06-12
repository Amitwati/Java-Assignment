package plants;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import food.EFoodType;
import food.IEdible;
import graphics.IDrawable;
import graphics.ZooPanel;
import mobility.ILocatable;
import mobility.Point;

/**
 * plant abstract class for the food
 */
public abstract class Plant implements IEdible, ILocatable, IDrawable {

	private Point location;
	protected ZooPanel pan;
	protected BufferedImage img;

	/**
	 * ctor for the plant class
	 */
	public Plant() {
		pan = ZooPanel.getInstance(null);
		this.location = new Point(pan.getWidth()/2,pan.getHeight()/2 - 45);
	}

	@Override
	public void loadImages(String nm){
			try { 
				img = ImageIO.read(new File(PICTURE_PATH + nm + ".png"));
			}
			catch (IOException e) { System.out.println("Cannot load picture"); }
	}

	@Override
	public void drawObject(Graphics g) {
		g.drawImage(img, pan.getWidth() / 2 , pan.getHeight() / 2 - 45, 40, 40, pan);
	}

	@Override
	public EFoodType getFoodtype() { return EFoodType.VEGETABLE; }

	@Override
	public String getColor() { return "Green"; }

	@Override
	public Point getLocation() { return null; }

	@Override
	public boolean setLocation(Point location) { return false; }


}
