package Car.model;

public class Car {
    private String name;
    private int year;
    private int carMileage;
    private double engine;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getCarMileage(){
        return carMileage;
    }
    public void setCarMileage(int carMileage){
        this.carMileage = carMileage;
    }
    public double getEngine(){
        return engine;
    }
    public void setEngine(double engine){
        this.engine = engine;
    }
    public void printInfo(){
        System.out.printf("name - %s , year - %d , milage - %d , endine - %f\n",name,year,carMileage,engine);
    }
}
