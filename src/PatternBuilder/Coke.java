package PatternBuilder;

public class Coke extends ColdDrinks{
    @Override
    public String name() {
        return "Coke a Cola";
    }

    @Override
    public double price() {
        return 5.0;
    }
}
