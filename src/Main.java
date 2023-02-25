import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Андреев Григорий Даниилович РИБО-01-21");

        Car car = new Car();
        Scanner in = new Scanner(System.in);


        System.out.println("Enter car model: ");
        car.model = in.nextLine();

        System.out.println("Enter car type: ");
        car.type = in.nextLine();

        System.out.println("Enter car year: ");
        car.year = in.nextInt();

        System.out.println("Enter car volume: ");
        car.setVolume(in.nextFloat());

        System.out.println("Enter car power: ");
        car.setPower(in.nextInt());

        System.out.println("Enter car firm: ");
        car.setFirm(in.next());

        System.out.println(car.go());

        System.out.println(car.toString());
    }
}