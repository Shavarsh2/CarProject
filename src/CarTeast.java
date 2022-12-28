import Car.Servise.CarServise;
import Car.model.Car;

public class CarTeast {
    public static void main(String[] args) {

        CarServise car = new CarServise();
        Car car1 =  car.creatCar();
        Car car2 = car.creatCar();
        Car car3 = car.creatCar();
        Car[] cars = {car1,car2,car3};
        System.out.println("-------------");
        car.printInfo(car1);
        System.out.println("-------------");
        car.printCarBigger2000(car1);
        System.out.println("-------------");
        String s = car.longMilage(car1,car2);
        System.out.println(s);
        System.out.println("-------------");
        Car a = car.bigerName(car1,car2);
        a.printInfo();
        System.out.println("-------------");
        car.printArray(cars);
        System.out.println("-------------");
        car.printCarBig2010(cars);

    }
}