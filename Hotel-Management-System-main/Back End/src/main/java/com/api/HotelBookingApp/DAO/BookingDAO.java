package com.api.HotelBookingApp.DAO;

import com.api.HotelBookingApp.Model.Booking;

public interface BookingDAO {

	Object addBooking(Booking param) throws Exception;
	Object getBookings(Integer hotelId, Integer userId) throws Exception;
	Object updateBooking(Integer bookingId, String status) throws Exception;
}
