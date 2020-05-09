package observer.v3;

public interface Subject {

	void notifyObservers();
	String getAction();
	void setAction(String action);
}
