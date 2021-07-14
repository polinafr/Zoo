public class Canary   extends Animal{
  private   double krilia ;

    public Canary(String _name, double _krilia) {
        super/*Animal*/(2, new Cover("Feathers", 1), new String("Canary"), _name);
        krilia = _krilia;
    }

    @Override
    void move()
    {
        System.out.println("Canary flies");
    }

    @Override
    void eat()
    {
        System.out.println("Canary eats seed");
    }
    @Override
    void haveChildren()
    {
        System.out.println("Canary puts eggs");
    };
}
