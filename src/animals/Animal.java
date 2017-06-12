package animals;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.concurrent.Future;
import javax.imageio.ImageIO;

import com.sun.org.apache.xpath.internal.operations.Bool;
import diet.IDiet;
import food.EFoodType;
import food.IEdible;
import graphics.IAnimalBehavior;
import graphics.IDrawable;
import graphics.ZooPanel;
import mobility.Mobile;
import mobility.Point;

/**
 * The animal class
 */
public abstract class Animal extends Observable implements ColoredAnimalDecorator,IEdible,IDrawable,IAnimalBehavior,Runnable,Cloneable {

	protected final int EAT_DISTANCE = 5;
	private IDiet diet;
	protected String name;
	private double weight;
	boolean isRun;
	protected Point location;
	protected int size;
	protected String col;
	protected int horSpeed;
	protected int verSpeed;
	protected boolean coordChanged;
	protected Future<?> task;
	protected int x_dir;
	protected int y_dir;
	protected int eatCount;
	protected ZooPanel pan;
	protected boolean threadSuspended;	 
	protected BufferedImage img1, img2;
	protected int cor_w, cor_h;

	/**
	 * Ctor
	 * @param nm the name of the animal
	 * @param sz size
	 * @param w weight
	 * @param hor horizontal speed
	 * @param ver vertical speed
	 * @param c color
	 * @param p panel
	 */
	public Animal(String nm, int sz, int w, int hor, int ver, String c, ZooPanel p) {
		location = new Point(0,0);
        name = new String(nm);
		size = sz;
		weight = w;
		isRun = false;
		horSpeed = hor;
		verSpeed = ver;
		col = c;
		pan = p;
		x_dir = 1;
		y_dir = 1;
        cor_w = cor_h = size;
		coordChanged = false;

	}

	/**
	 * Get food type
	 * @return food type
	 */
	public EFoodType getFoodtype() { return EFoodType.MEAT;	}

	/**
	 * get diet
	 * @return diet
	 */
	public IDiet getDiet() { return diet; }

	/**
	 * get name
	 * @return name
	 */
	public String getName() { return this.name;	}

	/**
	 * get weight
	 * @return weight
	 */
	public double getWeight() {	return this.weight;	}

	/**
	 * set wight
	 * @param w weight
	 */
	public void setWeight(double w) { weight = w; }

	/**
	 * set diet
	 * @param diet diet
	 */
	protected void setDiet(IDiet diet) { this.diet = diet;}

	/**
	 * get size
	 * @return size
	 */
	public int getSize() { return size; }

	/**
	 * get horizontal speed
	 * @return horizontal speed
	 */
	public int getHorSpeed() { return horSpeed; }

	/**
	 * set horizontal speed
	 * @param hor horizontal speed
	 */
	public void setHorSpeed(int hor) { horSpeed  = hor; }

	/**
	 * get vertical speed
	 * @return vertical speed
	 */
	public int getVerSpeed() { return verSpeed; }

	/**
	 * set vertical speed
	 * @param ver vertical spped
	 */
	public void setVerSpeed(int ver) { verSpeed  = ver; }

	/**
	 * Add 1 to eat count
	 */
	public void eatInc() { eatCount++; }

	/**
	 * get eat counter
	 * @return eat counter
	 */
	public int getEatCount() { return eatCount; }

	/**
	 * The animal thread is suspended
	 */
	synchronized public void setSuspend() { threadSuspended = true; }

	/**
	 * The animal thread is no suspended
	 */
	synchronized public void setResume() { threadSuspended = false; notify(); }

	/**
	 * Check if the animal coordinates has changed
	 * @return true if the animal coordinates has changed else false
	 */
	synchronized public boolean getChanges(){ return coordChanged; }

	/**
	 * Set the state of the animal. true if its coordinates has changed else false
	 * @param state of the animal
	 */
	synchronized public void setChanges(boolean state){ coordChanged = state; }

	/**
	 * get the color of the animal
	 */
	public String getColor() { return col; }

	/**
	 * check if the animal is running
	 * @return true if the animal is running else false
	 */
	public boolean isRunning() { return isRun; }

	/**
	 * get the location of the animal
	 * @return location of the animal
	 */
    public Point getLocation() {
        return location;
    }

	/**
	 * set the location of the animal
	 * @param location the new location we want to put the animal in
	 * @return true if we successfully moved the animal to the new point else false
	 */
	public Boolean setLocation(Point location) {
        this.location = location;
        return true;
    }

	/**
	 * paint the animal with some color
	 * @param col the color
	 * @return true if we managed to color the animal else false
	 */
	@Override
	public boolean PaintAnimal(String col) {
	    String nm = "";
		if(!this.col.equals("Natural"))
			return false;
        this.col = col;

        if(this instanceof Lion){
            nm = "lio";
        }
        if(this instanceof Bear){
            nm = "bea";
        }
        if(this instanceof Giraffe){
            nm = "grf";
        }
        if(this instanceof Elephant){
            nm = "elf";
        }
        if(this instanceof Turtle){
            nm = "trt";
        }

        loadImages(nm);
		return true;

	}

	/**
	 * Interrupt the animal in order to remove it from the threadpool
	 */
	public void interrupt() {
		isRun = false;
		task.cancel(true); // to remove thread of animal from Threadpool
	}

	/**
	 * set task of the animal in order to add it to threadpool
	 * @param tsk the task
	 */
	public void setTask(Future<?> tsk) {
		this.task = tsk;
	}

	/**
	 * load image from the pictures
	 * @param nm name of the animal
	 */
	public void loadImages(String nm){
		 switch(getColor()){
			 case "Red":
				 try { img1 = ImageIO.read(new File(PICTURE_PATH + nm + "_r_1.png"));
				 	   img2 = ImageIO.read(new File(PICTURE_PATH + nm + "_r_2.png"));} 
				 catch (IOException e) { System.out.println("Cannot load picture"); }
				 break;
			 case "Blue":
				 try { img1 = ImageIO.read(new File(PICTURE_PATH + nm + "_b_1.png"));
				 	   img2 = ImageIO.read(new File(PICTURE_PATH + nm + "_b_2.png"));} 
				 catch (IOException e) { System.out.println("Cannot load picture"); }
				 break;
			 default:
				 try { img1 = ImageIO.read(new File(PICTURE_PATH + nm + "_n_1.png"));
			 	       img2 = ImageIO.read(new File(PICTURE_PATH + nm + "_n_2.png"));} 
				 catch (IOException e) { System.out.println("Cannot load picture"); }			 
		 }
	}

	/**
	 * run method of the animal
	 */
    public void run() 
    {
    	isRun = true;
       while (isRun)
       {
           try {
               Thread.sleep(50);
               synchronized(this) {
                   while (threadSuspended)
   						wait();
   				}  
          } 
           catch (InterruptedException e) 
           {
           	System.out.println(getName()+ " dead...");
           	return;
           }
                      
           if(this.getDiet().canEat(pan.checkFood()))
           {
           		double oldSpead = Math.sqrt(horSpeed*horSpeed+verSpeed*verSpeed);
           		double newHorSpeed = oldSpead*(location.getX() - pan.getWidth()/2)/
           				   (Math.sqrt(Math.pow(location.getX() - pan.getWidth()/2,2)+
           						      Math.pow(location.getY() - pan.getHeight()/2 + 45,2)));
           		double newVerSpeed = oldSpead*(location.getY() - pan.getHeight()/2 + 45)/
           				   (Math.sqrt(Math.pow(location.getX() - pan.getWidth()/2,2)+
           						      Math.pow(location.getY() - pan.getHeight()/2 + 45,2)));
              	int v = 1;
                if(newVerSpeed<0) { v=-1; newVerSpeed = -newVerSpeed; }
              	if(newVerSpeed > 10)
              		newVerSpeed = 10;
              	else if(newVerSpeed < 1) {
              	   if(location.getY() != pan.getHeight()/2 + 45)
              		newVerSpeed = 1;   
              	   else
              		newVerSpeed = 0;  
              	}
              	int h = 1;
                if(newHorSpeed<0) { h=-1; newHorSpeed = -newHorSpeed; }
              	if(newHorSpeed > 10)
              		newHorSpeed = 10;
              	else if(newHorSpeed < 1) {
              	   if(location.getX() != pan.getWidth()/2)
              		newHorSpeed = 1;   
              	   else
              		newHorSpeed = 0;  
              	}
               	location.setX((int)(location.getX() - newHorSpeed*h));
               	location.setY((int)(location.getY() - newVerSpeed*v));
              	if(location.getX()<pan.getWidth()/2)
              		x_dir = 1;
              	else
              		x_dir = -1;
              	if((Math.abs(location.getX()-pan.getWidth()/2)<EAT_DISTANCE) && 
              	   (Math.abs(location.getY()-pan.getHeight()/2 + 45)<EAT_DISTANCE))
              	{
              		pan.eatFood(this);
              	}
           }
           else
           {
			    location.setX(location.getX() + horSpeed*x_dir);
			    location.setY(location.getY() + verSpeed*y_dir);
           }

		    if(location.getX() + cor_w + 10  > pan.getWidth()) {
                x_dir = -1;
            }
		    else if(location.getX() < 0) {
		    	x_dir = 1;
		    }

		    if(location.getY() + cor_h + 50 > (pan.getHeight())) {
		    	y_dir = -1;
		    }
		    else if(location.getY() < 0) {
                y_dir = 1;
		    }
 		    setChanged();
            this.notifyObservers();

      }
   }

	/**
	 * draw the animal on the panel
	 * @param g graphics
	 */
	public void drawObject(Graphics g)
    {
 		if(x_dir==1) // an animal goes to right side
 		{
 			g.drawImage(img1, location.getX(), location.getY(), cor_w, cor_h, pan);
 		}
 		else // an animal goes to left side
 		{
 			g.drawImage(img2, location.getX(), location.getY(), cor_w, cor_h, pan);
 		}
 		
    }

	/**
	 * Print the animal with costume string
	 * @return
	 */
	public String toString(){
    	return "["+getName() + ": weight=" + weight + ", color="+col+"]";
    }

	/**
	 * clone the animal
	 * @return cloned animal
	 * @throws CloneNotSupportedException in case the we can't clone
	 */
	public Object clone() throws CloneNotSupportedException{
    	Animal an = null;
    	try{
    		an = (Animal) super.clone();
		}catch (CloneNotSupportedException e){e.printStackTrace();}
		return an;
    }
}
