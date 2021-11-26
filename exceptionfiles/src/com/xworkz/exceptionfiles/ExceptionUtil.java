package com.xworkz.exceptionfiles;

import java.security.cert.CertificateException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.TooManyListenersException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.TimeoutException;
import java.util.prefs.BackingStoreException;

import javax.management.BadAttributeValueExpException;
import javax.management.BadStringOperationException;
import javax.management.InvalidApplicationException;
import javax.naming.NamingException;
import javax.swing.text.BadLocationException;
import javax.xml.transform.TransformerException;

public class ExceptionUtil {

	public static void main(String[] args) throws BackingStoreException, BadAttributeValueExpException,
			BadLocationException, BadStringOperationException, BrokenBarrierException, CertificateException,
			InterruptedException, InvalidApplicationException, SQLException, TransformerException, NamingException,
			TimeoutException, TooManyListenersException, ParseException {
		ExceptionEvent event = new ExceptionEvent();

		event.createExceptionalEvent1();
		event.createExceptionalEvent2();
		event.createExceptionalEvent3();
		event.createExceptionalEvent4();
		event.createExceptionalEvent5();
		event.createExceptionalEvent6();
		event.createExceptionalEvent7();
		event.createExceptionalEvent8();
		event.createExceptionalEvent9();
		event.createExceptionalEvent10();
		event.createExceptionalEvent11();
		event.createExceptionalEvent12();
		event.createExceptionalEvent13();
		event.createExceptionalEvent14();
		event.createExceptionalEvent15();
		event.createExceptionalEvent16();
		event.createExceptionalEvent17();
		event.createExceptionalEvent18();
		event.createExceptionalEvent19();
		event.createExceptionalEvent20();
		event.createExceptionalEvent21();
		event.createExceptionalEvent22();
		event.createExceptionalEvent23();
		event.createExceptionalEvent24();
		event.createExceptionalEvent25();
	}
}
