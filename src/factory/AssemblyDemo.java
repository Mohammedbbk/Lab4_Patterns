package factory;

public class AssemblyDemo {
    public static void main(String[] args) {
        VehicleFactory factory = new CarFactory();
        Vehicle car = factory.createVehicle();
        car.assemble();
    }
}