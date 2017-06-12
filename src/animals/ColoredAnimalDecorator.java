package animals;

/**
 * Created by amitwati on 06/06/17.
 * interface for animals that can be colored
 */
public interface ColoredAnimalDecorator {
    /**
     * paint the animal with the color param
     * @param col
     *          the color we want to paint the animal
     * @return boolean key that present the success of the operation
     */
    public boolean PaintAnimal(String col);
}
