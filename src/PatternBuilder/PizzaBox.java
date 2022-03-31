package PatternBuilder;

public class PizzaBox implements Packaging{

    @Override
    public String packaging() {
        return "Pizza box";
    }

    @Override
    public double price() {
        return 4.5;
    }
}
