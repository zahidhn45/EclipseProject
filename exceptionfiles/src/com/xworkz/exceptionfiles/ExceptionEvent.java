package com.xworkz.exceptionfiles;

import java.lang.annotation.AnnotationFormatError;
import java.nio.channels.AlreadyBoundException;
import java.security.cert.CertificateException;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.DateTimeException;
import java.util.TooManyListenersException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.TimeoutException;
import java.util.prefs.BackingStoreException;

import javax.management.BadAttributeValueExpException;
import javax.management.BadStringOperationException;
import javax.management.InvalidApplicationException;
import javax.naming.NamingException;
import javax.swing.text.BadLocationException;
import javax.swing.undo.CannotRedoException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.transform.TransformerException;

public class ExceptionEvent {

	public void createExceptionalEvent1() {
		RuntimeException runtimeException = new RuntimeException();
		throw runtimeException;
	}

	public void createExceptionalEvent2() {
		AnnotationFormatError annotation = new AnnotationFormatError("zahid");
		throw annotation;
	}

	public void createExceptionalEvent3() {
		AssertionError assertionError = new AssertionError();
		throw assertionError;
	}

	public void createExceptionalEvent4() {
		FactoryConfigurationError error = new FactoryConfigurationError();
		throw error;
	}

	public void createExceptionalEvent5() {
		LinkageError error = new LinkageError();
		throw error;
	}

	public void createExceptionalEvent6() {
		AlreadyBoundException error = new AlreadyBoundException();
		throw error;
	}

	public void createExceptionalEvent7() throws BackingStoreException {
		BackingStoreException error = new BackingStoreException("Zahid");
		throw error;
	}

	public void createExceptionalEvent8() throws BadAttributeValueExpException {
		BadAttributeValueExpException error = new BadAttributeValueExpException(getClass());
		throw error;
	}

	public void createExceptionalEvent9() throws BadLocationException {
		BadLocationException error = new BadLocationException("Zahid", 2);
		throw error;

	}

	public void createExceptionalEvent10() throws BadStringOperationException {
		BadStringOperationException error = new BadStringOperationException("Zahid");
		throw error;
	}

	public void createExceptionalEvent11() throws BrokenBarrierException {
		BrokenBarrierException error = new BrokenBarrierException();
		throw error;
	}

	public void createExceptionalEvent12() throws CertificateException {
		CertificateException error = new CertificateException();
		throw error;
	}

	public void createExceptionalEvent13() throws InterruptedException {
		InterruptedException error = new InterruptedException();
		throw error;
	}

	public void createExceptionalEvent14() throws InvalidApplicationException {
		InvalidApplicationException error = new InvalidApplicationException(getClass());
		throw error;
	}

	public void createExceptionalEvent15() throws SQLException {
		SQLException error = new SQLException();
		throw error;
	}

	public void createExceptionalEvent16() throws TransformerException {
		TransformerException error = new TransformerException("Zahid");
		throw error;
	}

	public void createExceptionalEvent17() throws TooManyListenersException {
		TooManyListenersException error = new TooManyListenersException();
		throw error;
	}

	public void createExceptionalEvent18() throws TimeoutException {
		TimeoutException error = new TimeoutException();
		throw error;
	}

	public void createExceptionalEvent19() throws ParseException {
		ParseException error = new ParseException("Zahid", 2);
		throw error;
	}

	public void createExceptionalEvent20() throws NamingException {
		NamingException error = new NamingException();
		throw error;
	}

	public void createExceptionalEvent21() {
		ArithmeticException error = new ArithmeticException();
		throw error;
	}

	public void createExceptionalEvent22() {
		ArrayStoreException error = new ArrayStoreException();
		throw error;
	}

	public void createExceptionalEvent23() {
		CannotRedoException error = new CannotRedoException();
		throw error;
	}

	public void createExceptionalEvent24() {
		DateTimeException error = new DateTimeException("Zahid");
		throw error;
	}

	public void createExceptionalEvent25() {
		IndexOutOfBoundsException error = new IndexOutOfBoundsException();
		throw error;
	}
}
