package PatternSingleton;

import java.util.Scanner;

public class SingleObject {
    private static SingleObject instance = new SingleObject();
    private int HEHEHE = 1000;

    private SingleObject() {}

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("HEH HEh Huh: " + HEHEHE);
    }

    public void reduceVal () {
        Scanner scanInput = new Scanner(System.in);
        System.out.print("HE HEH HEEE:");
        int reduceVal = scanInput.nextInt();
        HEHEHE -= reduceVal;
    }
}
