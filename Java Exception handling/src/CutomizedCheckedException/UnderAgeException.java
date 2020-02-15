package CutomizedCheckedException;

public class UnderAgeException extends Exception{
public UnderAgeException() {
	super("You are uneligible  to cast your vote");
}
public UnderAgeException(String message) {
	super(message);
}
}
