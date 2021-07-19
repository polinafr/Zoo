public class Elephant extends Animal{
    private double height;

    protected Elephant(String _name, double height) {
        super(4, new Cover("skin", 1), "Elephant", _name);
        if (height>0)
            this.height = height;
        else
            this.height = 0;

    }@Override
    void move()
    {
        System.out.println("Elephant walks");
    }

    @Override
    void eat()
    {
        System.out.println("Elephant eats leaves");
    }
    @Override
    void haveChildren()
    {
        System.out.println("Elephant has babies");
    };
}
