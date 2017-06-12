package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;

/**
 * Herbivore class
 */
public class Herbivore implements IDiet {

	/**
	 * Check if it can eat the food
	 * @param food
	 * @return true if can eat else false
	 */
	@Override
	public boolean canEat(IEdible food) {
		return (food.getFoodtype() == EFoodType.VEGETABLE);
	}

	/**
	 * Check if it can eat the food
	 * @param food_type
	 * @return true if can eat else false
	 */
	public boolean canEat(EFoodType food_type) {
		return food_type == EFoodType.VEGETABLE;
	}

	/**
	 * Eat food
	 * @param animal animal
	 * @param food food
	 * @return true if the animal can eat the food else false
	 */
	@Override
	public boolean eat(Animal animal, IEdible food) {
		boolean isSuccess = canEat(food);
		if (isSuccess) {
			animal.setWeight(animal.getWeight() * 1.07);
		}
		return isSuccess;
	}

	@Override
	public String toString() {
		return "[" + this.getClass().getSimpleName() + "]";
	}
}
