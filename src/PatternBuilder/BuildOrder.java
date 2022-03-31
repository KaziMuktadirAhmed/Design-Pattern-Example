package PatternBuilder;

public class BuildOrder {
    public Order prepareBBQPizza () {
        Order order = new Order();
        order.addItem(new BBQChickenPizza());
        order.addItem(new Coke());
        return order;
    }

    public Order prepareCheesePizza () {
        Order order = new Order();
        order.addItem(new MozzarellaCheesePizza());
        order.addItem(new Sprite());
        return order;
    }
}
