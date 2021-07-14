public abstract class Animal {
    // fields
    int lapy;
    Cover pokrytiye;
    private String kind;
    String name;



    // methods
    void move(){};
    void eat(){};
    void haveChildren(){};
    protected Animal(int _lapy, Cover _cover, String _kind, String _name)
    {
        lapy = _lapy;
        pokrytiye = _cover;
        kind = _kind;
        name= _name;
    }
}
