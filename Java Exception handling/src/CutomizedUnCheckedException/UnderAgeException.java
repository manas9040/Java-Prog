package CutomizedUnCheckedException;

public class UnderAgeException extends RuntimeException{
public UnderAgeException() {
	super("You are uneligible  to cast your vote");
}
public UnderAgeException(String message) {
	super(message);
}
}
