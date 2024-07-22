public class Route {

    private String PickupAddress ;
    private String destAddress ;
    private double tripPrice ;

    public Route(String destAddress, String pickupAddress, double tripPrice) {
        this.destAddress = destAddress;
        PickupAddress = pickupAddress;
        this.tripPrice = tripPrice;
    }

    public String getDestAddress() {
        return destAddress;
    }

    public void setDestAddress(String destAddress) {
        this.destAddress = destAddress;
    }

    public String getPickupAddress() {
        return PickupAddress;
    }

    public void setPickupAddress(String pickupAddress) {
        PickupAddress = pickupAddress;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }
}
