public class Snake extends Animal {
    private Poisonousness poisonous;

    public Snake(String _name, Poisonousness poisonous) {
        super(0, new Cover("Skin", 1), "Snake", _name);
        this.poisonous = poisonous;
    }

    @Override
    void move() {
        System.out.println("Snake slums");
    }

    @Override
    void eat() {
        System.out.println("Snakes eats mice");
    }

    @Override
    void haveChildren() {
        System.out.println("Snakes has eggs");
    }

    ;
}