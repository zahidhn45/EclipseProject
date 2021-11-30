package com.xworkz.runtimeexception;

import com.xworkz.runtimeexception.constants.TicketType;
import com.xworkz.runtimeexception.exception.HouseFullRunTimeException;

public class Theater {

	private final int GANDHI_CLASS_TICKET = 5;
	private final int MIDDLE_CLASS_TICKET = 5;
	private final int BALCONY_TICKET = 2;
	private String movieName;

	public Theater(String movieName) {
		this.movieName = movieName;
	}

	public boolean bookTicket(String movieName, TicketType ticketType, int totalTicket) {
		System.out.println("Inside bookTicket()");
		if (movieName.equals(movieName) && TicketType.GANDHI_CLASS.equals(ticketType)) {
			if (TicketType.GANDHI_CLASS.equals(ticketType) && totalTicket <= this.GANDHI_CLASS_TICKET) {
				System.out.println(this.movieName.concat(" Is booked with ").concat(ticketType.toString()));
				return true;
			} else {
				System.err.println("Cannot book ticket for ".concat(movieName).concat(" Ticket is full for ")
						.concat(ticketType.toString()));
				throw new HouseFullRunTimeException("Gandhi class can have max 5 ticket");
			}
		}

		if (movieName.equals(movieName) && TicketType.MIDDLE_CLASS.equals(ticketType)) {
			if (TicketType.MIDDLE_CLASS.equals(ticketType) && totalTicket <= this.MIDDLE_CLASS_TICKET) {
				System.out.println(this.movieName.concat(" Is booked with ").concat(ticketType.toString()));
				return true;
			} else {
				System.err.println("Cannot book ticket for ".concat(movieName).concat(" Ticket is full for ")
						.concat(ticketType.toString()));
				throw new HouseFullRunTimeException("Middle class can have max 5 ticket");
			}
		}

		if (movieName.equals(movieName) && TicketType.BALCONY.equals(ticketType)) {
			if (TicketType.BALCONY.equals(ticketType) && totalTicket <= this.BALCONY_TICKET) {
				System.out.println(this.movieName.concat(" Is booked with ").concat(ticketType.toString()));
				return true;
			} else {
				System.err.println("Cannot book ticket for ".concat(movieName).concat(" Ticket is full for ")
						.concat(ticketType.toString()));
				throw new HouseFullRunTimeException("Balcony class can have max 2 ticket");
			}
		}
		return false;
	}
}
