
public class NonSubscribers extends Passenger {

    private boolean discountCoupon ;


    public NonSubscribers(String id, String name, Car reservedCar, int tripCost,boolean discountCoupon) {
        super(id, name, reservedCar, tripCost);
        this.discountCoupon = discountCoupon;

    }

    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }


    @Override
    public void reserveCar(Car car) throws ArithmeticException  {

        double tripCost ;

        try {


            if (car.getMaxPerTrip()==0) {
                throw new ArithmeticException ("Unfortunately , Maximum Capacity per trip is Zero") ;
            }


            if (isDiscountCoupon()) {
                super.setTripCost(car.getFiexedRoute().getTripPrice() - (car.getFiexedRoute().getTripPrice() * 0.1)) ;
            }
            else {
                super.setTripCost(car.getFiexedRoute().getTripPrice()) ;
            }

            super.setReservedCar(car);




        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }





    }

    @Override
    public void display() {
        System.out.println("Passenger non subscriber " + super.getName());
        System.out.println("ID : " + super.getId() + " Reserved Car code : " + super.getReservedCar().getCode() + " Trip Cost : " + super.getTripCost() );
    }
}
