import java.util.List;

public class Container {
    private List<Animal> animals;
    public List<Animal> getAnimals()
    {
        return animals;
    }
    public String getFill();
    public void addAnimal(Animal animal);
    public void deleteAnimal(Animal animal);
    public boolean exists(Animal animal);
}
