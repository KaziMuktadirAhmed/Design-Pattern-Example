package PatternStrategy;

public class div implements Opertation{
    @Override
    public boolean matchSymbol(String symbol) {
        return symbol.equals("/");
    }

    @Override
    public double calculate(int op1, int op2) {
        return op1/op2;
    }
}
