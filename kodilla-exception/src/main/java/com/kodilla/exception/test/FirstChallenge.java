package com.kodilla.exception.test;

public class FirstChallenge {

    //Kamil czy dobrze rozumiem, że w tej metodzie rzucanie wyjątku jest "dopisane"
    // bo normalnie przy zmiennych typu double i dzieleniu przez zero zwróci niskończoność?

    public double divide(double a, double b) throws ArithmeticException {
        try{
            if (b == 0) {
                throw new ArithmeticException();
            }
            return a / b;

        } catch (ArithmeticException e){
            System.out.println("ArithmeticException ocurred in bloc catch " + e);
            return 0;
        }
        finally {
            System.out.println("Remember not to divide by 0" );
        }
    }


    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        Flight flight = new Flight("Warsaw", "Tokyo");
        Flight flight1 = new Flight("Berlin", "Bergen");
        Flight flight2 = new Flight("Toronto", "New York");
        Flight flight3 = new Flight("Warsaw", "Berlin");



        FlightLogic flightLogic = new FlightLogic();
        flightLogic.addNewFlight(flight);
        flightLogic.addNewFlight(flight1);
        flightLogic.addNewFlight(flight2);
        flightLogic.addNewFlight(flight3);


        try{
            flightLogic.findFlight(flight1);
        }catch (RouteNotFoundException e){
            System.out.println("OH NO! Flight to " + flight.getArrivalAirport() + "is not supported");
        }





        /*try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
            System.out.println("End of try block");
        } catch (ArithmeticException e) {
            System.out.println("You should not divide by zero");
            System.out.println("ArithmeticException ocurred in bloc catch " + e);
        } finally {
            System.out.println("Remember not to divide by 0" );
        }*/
    }




}
