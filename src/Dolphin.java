public class Dolphin extends Animal{
    private double lungs;


    public Dolphin(String _name, double _lungs) {
        super(0, new Cover("Skin",1), "Dolphin", _name);
        setLungs(_lungs);
    }

    public void setLungs(double lungs) {

        this.lungs = lungs;
        if ( this.lungs<0)
            this.lungs=0;
    }

    @Override
    void move()
    {
        System.out.println("Dolphin swims");
    }

    @Override
    void eat()
    {
        System.out.println("Dolphin eats fish");
    }
    @Override
    void haveChildren()
    {
        System.out.println("Dolphin has babies");
    };
}
