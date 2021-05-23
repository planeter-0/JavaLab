package t1.lab4;

public class ExpresswayTollFee {
    public static void main(String[] args) {
        char vehicle = 'm';
        if (vehicle == 'c') {
            System.out.println("Car-Cost: 2.00");
        } else if (vehicle == 'm') {
            System.out.println("Motorbike-Cost: 1.10");
        } else if (vehicle == 'b') {
            System.out.println("Bus-Cost: 4.25");
        } else if (vehicle == 't') {
            System.out.println("Truck-Cost: 6.70");
        } else if (vehicle == 'v') {
            System.out.println("Van-Cost: 4.00");
        } else {
            System.out.println("Wrong input!");
        }
    }
}
