package PatternBuilder;

public class OneTimeCup implements Packaging{
    @Override
    public String packaging() {
        return "One time cup";
    }

    @Override
    public double price() {
        return 1.2;
    }
}
