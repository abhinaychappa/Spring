package busmanagement.Exceptions;

public class InvalidTicketException extends Exception {
	
	public InvalidTicketException() {
		
	} //NoArgsconstructor -implicitly calls super class constructor -for proper initialization of Exception class and hierarchy maintanence
    
	public InvalidTicketException(String message) {
		super(message);
	}
}
