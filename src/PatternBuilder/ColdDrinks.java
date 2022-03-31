package PatternBuilder;

public abstract class ColdDrinks implements FoodItem{
    @Override
    public Packaging packaging() {
        return new OneTimeCup();
    }
}
