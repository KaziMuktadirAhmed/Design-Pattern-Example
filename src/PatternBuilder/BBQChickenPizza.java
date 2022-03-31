package PatternBuilder;

public class BBQChickenPizza extends Pizza {
    @Override
    public String name() {
        return "BBQ Chicken Pizza";
    }

    @Override
    public double price() {
        return 20.25;
    }
}
