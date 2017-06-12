package graphics;

public interface IAnimalBehavior {
	/**
	 * get the name of the animal
	 * @return
	 * 			string name of the animal
	 */
	 abstract public String getName();

	/**
	 * set the animal suspended
	 */
	abstract public void setSuspend();

	/**
	 * set the animal not suspended
	 */
	abstract public void setResume();

	 /**
	  * get the Size of the animal
	  * @return
	  * 			int Size of the animal
	  */
	 abstract public int getSize();

	/**
	 * increase the animal's eat count
	 */
	abstract public void eatInc();

	 /**
	 * get the EatCount of the animal
	 * @return
	 * 			int EatCount of the animal
	 */
	 abstract public int getEatCount();

	/**
	 * see if there are some changes in the animal's coords
	 * @return
	 */
	abstract public boolean getChanges();

	/**
	 * set changes as param
	 * @param state
	 * 				the changes state
	 */
	 abstract public void setChanges(boolean state);
}

