package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;

/**
 * diet interface
 */
public interface IDiet {

	/**
	 * Check if animal can eat food
	 * @param food
	 * @return true if so else false
	 */
	public boolean canEat(IEdible food);

	/**
	 * Animal try to eat food
	 * @param food
	 * @return true if the animal can eat the food else false
	 */
	public boolean eat(Animal animal, IEdible food);

	/**
	 * Check if animal can eat food
	 * @param food_type
	 * @return true if so else false
	 */
	public boolean canEat(EFoodType food_type);

}
