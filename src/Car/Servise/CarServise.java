package Car.Servise;

import Car.model.Car;

import java.util.Scanner;

public class CarServise {
    public Car creatCar() {
        Scanner s = new Scanner(System.in);
        Car car = new Car();
        System.out.print("Car Name - ");
        car.setName(s.next());
        System.out.print("Car Year - ");
        car.setYear(s.nextInt());
        System.out.print("Car Milage - ");
        car.setCarMileage(s.nextInt());
        System.out.print("Car Engie - ");
        car.setEngine(s.nextDouble());

        return car;
    }

    public void printInfo(Car car) {
        System.out.println(car.getName() + " " + car.getYear());
    }

    public void printCarBigger2000(Car car) {
        if (car.getYear() > 2000)
            System.out.println(car.getName());
        else
            System.out.println(car.getYear());
    }

    public String longMilage(Car car1, Car car2) {
        if (car1.getCarMileage() > car2.getCarMileage()) {
            return car1.getName();
        } else
            return car2.getName();
    }

    public Car bigerName(Car a, Car b) {
        if (a.getName().length() > b.getName().length())
            return a;
        return b;
    }

    public void printArray(Car[] cars) {
        for (Car x : cars) {
            x.printInfo();
        }
    }

    public void printCarBig2010(Car[] cars) {
        for (Car x : cars) {
            if (x.getYear() > 2010)
                x.printInfo();
            else
                System.out.println("no big car");
        }
    }
}
