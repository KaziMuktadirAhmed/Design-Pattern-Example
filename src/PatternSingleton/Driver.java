package PatternSingleton;

public class Driver {
    public static void main(String[] args) {
        SingleObject instance = SingleObject.getInstance();
        instance.showMessage();
        System.out.println("okay");
        run();
    }

    public static void run() {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.reduceVal();
        singleObject.showMessage();
    }
}
