public class Giraffa extends Animal{
    private double neckLength;
    private int kolvoPyaten;
    public static final int numHorns = 2;

    protected Giraffa(String _name, double l3ngth, int patna) {
        super(4, new Cover("Skin", 1), "Giraffa", _name);
        setNeckLength(l3ngth);
        setKolvoPyaten(patna);

    }    // ג'ירפה יורשת מחיה

    public void setNeckLength(double length)
    {
        if (length>=0) {
            neckLength = length;
        }
        else neckLength = 0;
    }

    public void setKolvoPyaten(int pyaten)
    {
        if (pyaten>=10) {
            kolvoPyaten = pyaten;
        }
        else kolvoPyaten = 10;
    }

    @Override
    void move()
    {
        System.out.println("Giraffa walks");
    }

    @Override
    void eat()
    {
        System.out.println("Giraffa eats leaves");
    }
    @Override
    void haveChildren()
    {
        System.out.println("Giraffa has babies");
    };
}
