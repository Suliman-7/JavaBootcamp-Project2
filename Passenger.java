public abstract class Passenger {

    private String name;
    private String id;
    private Car reservedCar ;
    private double tripCost ;

    public Passenger(String id, String name, Car reservedCar, int tripCost) {
        this.id = id;
        this.name = name;
        this.reservedCar = reservedCar;
        this.tripCost = tripCost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public abstract void reserveCar(Car car) throws ArithmeticException ;

    public abstract void display();
}
