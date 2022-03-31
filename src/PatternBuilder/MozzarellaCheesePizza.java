package PatternBuilder;

public class MozzarellaCheesePizza extends Pizza{
    @Override
    public String name() {
        return "Mozzarella Cheese Pizza";
    }

    @Override
    public double price() {
        return 10.56;
    }
}
