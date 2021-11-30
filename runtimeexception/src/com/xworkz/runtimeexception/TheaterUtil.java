package com.xworkz.runtimeexception;

import com.xworkz.runtimeexception.constants.TicketType;

public class TheaterUtil {

	public static void main(String[] args) {
		Theater theater = new Theater("Mugilpete");
		theater.bookTicket("Mugilpete", TicketType.GANDHI_CLASS, 5);
		theater.bookTicket("Mugilpete", TicketType.MIDDLE_CLASS, 5);
		theater.bookTicket("Mugilpete", TicketType.BALCONY, 2);
	}
}
