public class Car {

    private String code ;
    private Route fiexedRoute ;
    private int maxPerTrip ;

    public Car(String code, Route fiexedRoute, int maxPerTrip) {
        this.code = code;
        this.fiexedRoute = fiexedRoute;
        this.maxPerTrip = maxPerTrip;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getFiexedRoute() {
        return fiexedRoute;
    }

    public void setFiexedRoute(Route fiexedRoute) {
        this.fiexedRoute = fiexedRoute;
    }

    public int getMaxPerTrip() {
        return maxPerTrip;
    }

    public void setMaxPerTrip(int maxPerTrip) {
        this.maxPerTrip = maxPerTrip;
    }
}
