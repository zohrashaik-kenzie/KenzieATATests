package com.kenzie.examples.week29.patterns.facade;

public class FacadePatternDemo {

    public static void main(String[] args){
        TravelFacade travelF = new TravelFacade();
        BookingInfo info = new BookingInfo();
        travelF.book(TravelFacade.BookingType.Train, info);
        travelF.book(TravelFacade.BookingType.Flight_And_Hotel,info);
    }
}
