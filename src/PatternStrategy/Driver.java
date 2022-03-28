package PatternStrategy;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("okay");
        Driver driver = new Driver();
        driver.run();
    }

    public void run () {
        ArrayList<Opertation> operations;
        operations = buildOperation();

        Scanner scanInput = new Scanner(System.in);
        System.out.println("Input operation symbol: ");
        String symbol = scanInput.nextLine();

        System.out.println("Input op1 and op2: ");
        int op1 = scanInput.nextInt(), op2 = scanInput.nextInt();


        for (Opertation opertation : operations) {
            if(opertation.matchSymbol(symbol)) {
                System.out.println(opertation.calculate(op1, op2));
                break;
            }
        }
    }

    public ArrayList<Opertation> buildOperation() {
        ArrayList<Opertation> operations = new ArrayList<>();
        operations.add(new Add());
        operations.add(new sub());
        operations.add(new mul());
        operations.add(new div());
        return operations;
    }
}
