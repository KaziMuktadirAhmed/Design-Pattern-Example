package PatternBuilder;

public abstract class Pizza implements FoodItem{
    public Packaging packaging() {
        return new PizzaBox();
    }
}
