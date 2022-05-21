package PatternBuilder;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Builder driver");
        run();
    }

    public static void run() {
        BuildOrder buildOrder = new BuildOrder();

        Order chickenPizza = buildOrder.prepareBBQPizza();
        System.out.println("Chicken pizza");
        chickenPizza.showOrderList();
        System.out.println("Total price: " + chickenPizza.price());

        buildOrder = new BuildOrder();
        Order cheesePizza = buildOrder.prepareCheesePizza();
        System.out.println("Cheese pizza");
        cheesePizza.showOrderList();
        System.out.println("Total price: " + cheesePizza.price());

    }
}
