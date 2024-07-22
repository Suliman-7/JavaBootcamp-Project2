//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {


        Route r1 = new Route( "Riyadh" , "Jeddah" , 200 );

        Route r2 = new Route( "Newyork" , "Manchister" , 400 );

        Car c1 = new Car("SR1144" , r1 , 0);

        Car c2 = new Car("EF2200" , r2 , 1);

        Car c3 = new Car("PP1122" , r2 , 2);


        Subscribers s1 = new Subscribers("302904" , "Mohammed" , c2 , 200 );

        NonSubscribers n1 = new NonSubscribers("940203" , "Khalid" , c3 , 500 , true );

        ArrayList<Passenger> arr = new ArrayList() ;

        s1.reserveCar(c1);
        n1.reserveCar(c3);


        arr.add(s1);
        arr.add(n1);


        s1.display();
        n1.display();








    }


}