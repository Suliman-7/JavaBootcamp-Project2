public class Subscribers extends Passenger {


    public Subscribers(String id, String name, Car reservedCar, int tripCost) {
        super(id, name, reservedCar, tripCost);
    }

    @Override
    public void reserveCar(Car car) throws ArithmeticException {

        try {


            if (car.getMaxPerTrip()==0) {
                throw new ArithmeticException("Unfortunately , Maximum Capacity per trip is Zero") ;
            }

            super.setTripCost(car.getFiexedRoute().getTripPrice() - (car.getFiexedRoute().getTripPrice() * 0.5 )) ;
            car.setMaxPerTrip(car.getMaxPerTrip() - 1);
            super.setReservedCar(car);



        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void display() {
        System.out.println("Passenger subscriber " + super.getName());
        System.out.println("ID : " + super.getId() + " Reserved Car code : " + super.getReservedCar().getCode() +  " Trip Cost : " + super.getTripCost() );
    }






}