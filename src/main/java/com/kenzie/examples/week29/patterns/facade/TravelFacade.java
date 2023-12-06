package com.kenzie.examples.week29.patterns.facade;

public class TravelFacade{
    FlightBooking flightBooking;
    TrainBooking trainBooking;
    HotelBooking hotelBooking;

    enum BookingType {
        Flight,Train,Hotel,Flight_And_Hotel,Train_And_Hotel;
    };

    public TravelFacade(){
        flightBooking = new FlightBooking();
        trainBooking = new TrainBooking();
        hotelBooking = new HotelBooking();
    }
    public void book(BookingType type, BookingInfo info){
        switch(type){
            case Flight:
                // book flight;
                flightBooking.bookFlight(info);
                return;
            case Hotel:
                // book hotel;
                hotelBooking.bookHotel(info);
                return;
            case Train:
                // book Train;
                trainBooking.bookTrain(info);
                return;
            case Flight_And_Hotel:
                // book Flight and Hotel
                flightBooking.bookFlight(info);
                hotelBooking.bookHotel(info);
                return;
            case Train_And_Hotel:
                // book Train and Hotel
                trainBooking.bookTrain(info);
                hotelBooking.bookHotel(info);
                return;
        }
    }
}