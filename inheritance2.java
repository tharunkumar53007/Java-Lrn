class vehicle
{
    String brand;
    int year;
    void startEngine()
    {
        System.out.println("Engine Started");
    }
}
class Car extends vehicle
{
    String fuelType;

    void startEngine()
    {
        System.out.println("Car Engine start");
    }
    void drive()
    {
        System.out.println("Car is driving");
    }
}
class Truck extends vehicle{
    int loadCapacity;

    void startEngine()
    {
        System.out.println("Truck Engine start");
    }
    void haul()
    {
        System.out.println("Truck is hauling");
    }
}
class inheritance2
{
    public static void main(String args[])
    {
        Car c1=new Car();
        c1.brand="Rolls Royce";
        c1.year=2020;
        c1.fuelType="Petrol";
        c1.startEngine();
        c1.drive();

        Truck t1=new Truck();
        t1.brand="Toyota";
        t1.year=2005;
        t1.loadCapacity=1000;
        t1.startEngine();
        t1.haul();
    }
}